package com.sayuj.themoviesdb.ui.home.tabLayoutPages.upComing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.sayuj.themoviesdb.domain.model.Movie
import com.sayuj.themoviesdb.domain.useCases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class UpComgingViewModel @Inject constructor(private val useCases: UseCases) :
    ViewModel() {

    var hasLoadingError: Boolean = false


    var resultUpComing: Flow<PagingData<Movie>>? = null

    init {
        val newResult: Flow<PagingData<Movie>> =
            useCases.getUpComingUseCase().cachedIn(viewModelScope)
        resultUpComing = newResult
    }

}