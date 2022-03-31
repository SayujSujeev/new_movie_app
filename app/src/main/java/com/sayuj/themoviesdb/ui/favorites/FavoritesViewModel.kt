package com.sayuj.themoviesdb.ui.favorites

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sayuj.themoviesdb.domain.model.Movie
import com.sayuj.themoviesdb.domain.useCases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(private val useCases: UseCases) :
    ViewModel() {

    var resultFavorites: MutableLiveData<List<Movie>> = MutableLiveData()
    fun getAllFavoritesMovies() {
        viewModelScope.launch {
            useCases.getAllFavoritesMovies().collect {
                resultFavorites.value = it
            }
        }
    }

    fun deleteAllFavoritesMovies() {
        viewModelScope.launch {
            useCases.deleteAllFavoritesMovies()
            getAllFavoritesMovies()
        }
    }
}