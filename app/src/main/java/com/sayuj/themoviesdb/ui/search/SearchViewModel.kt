package com.sayuj.themoviesdb.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.sayuj.themoviesdb.domain.useCases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val useCases: UseCases) :
    ViewModel() {

    private val currentQuery:MutableLiveData<String> = MutableLiveData()

    val result = currentQuery.switchMap { searchQuery ->
        useCases.getMoviesOfSearchQueryUseCase(searchQuery).cachedIn(viewModelScope)
    }

    fun getMoviesOfSearchQuery(searchQuery: String) {
        currentQuery.value = searchQuery
    }


}

