package com.sayuj.themoviesdb.ui.home.tabLayoutPages.upComing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavDirections
import androidx.navigation.fragment.NavHostFragment
import androidx.paging.LoadState
import com.sayuj.themoviesdb.common.getTheRecyclerViewItemDecoration
import com.sayuj.themoviesdb.common.getTheRecyclerViewLayoutManager
import com.sayuj.themoviesdb.databinding.FragmentUpComingBinding
import com.sayuj.themoviesdb.domain.model.Movie
import com.sayuj.themoviesdb.ui.adapters.MovieAdapter
import com.sayuj.themoviesdb.ui.adapters.MoviesLoadStateAdapter
import com.sayuj.themoviesdb.ui.home.HomeFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class UpComingFragment : Fragment() {


    private val viewModel: UpComgingViewModel by viewModels()
    private val adapter =
        MovieAdapter { selectedMovie: Movie -> handleTheSelectedMovie(selectedMovie) }

    private fun handleTheSelectedMovie(selectedMovie: Movie) {
        val direction: NavDirections =
            HomeFragmentDirections.actionHomeFragmentToDetailFragment(selectedMovie)
        NavHostFragment.findNavController(this).navigate(direction)
    }

    private var _binding: FragmentUpComingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUpComingBinding.inflate(inflater, container, false)

        setUpAdapter()
        lifecycleScope.launch {
            viewModel.resultUpComing?.collectLatest {
                adapter.submitData(it)
            }
        }
        if (viewModel.hasLoadingError) {
            retry()
        }

        return binding.root
    }


    private fun setUpAdapter() {

        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = getTheRecyclerViewLayoutManager(this@UpComingFragment.context)
            addItemDecoration(getTheRecyclerViewItemDecoration(30, true))
        }
        binding.recyclerView.adapter = adapter.withLoadStateFooter(
            footer = MoviesLoadStateAdapter { retry() }
        )
        binding.retryButton.setOnClickListener { retry() }
        adapter.addLoadStateListener { loadState ->
            binding.apply {
                progressBar.isVisible = loadState.source.refresh is LoadState.Loading
                recyclerView.isVisible = loadState.source.refresh is LoadState.NotLoading
                retryButton.isVisible = loadState.source.refresh is LoadState.Error

                // Show the error, regardless of whether it came from RemoteMediator or PagingSource
                val errorState = loadState.source.append as? LoadState.Error
                    ?: loadState.source.prepend as? LoadState.Error
                    ?: loadState.append as? LoadState.Error
                    ?: loadState.prepend as? LoadState.Error
                    ?: loadState.refresh as? LoadState.Error
                errorState?.let {
                    binding.txtError.text = "\uD83D\uDE28 ${it.error.localizedMessage}"
                    viewModel.hasLoadingError = true
                }
                txtError.isVisible = loadState.source.refresh is LoadState.Error
            }
        }

    }

    private fun retry() {
        adapter.retry()
    }


    override fun onResume() {
        super.onResume()
        if (viewModel.hasLoadingError) {
            retry()
        }
    }

}
