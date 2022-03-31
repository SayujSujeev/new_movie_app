package com.sayuj.themoviesdb.domain.useCases

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import androidx.paging.PagingData
import androidx.paging.map
import com.sayuj.themoviesdb.domain.model.Movie
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository

class GetMoviesOfSearchQueryUseCase (private val repository: TheMovieDbRepository) {
    operator fun invoke(searchQuery:String): LiveData<PagingData<Movie>> {
        return repository.getMoviesOfSearchQuery(searchQuery).map { pagingData ->
            pagingData.map { movie ->
                val genreListString: ArrayList<String> = arrayListOf()
                movie.genreIds.forEach {
                    val name = repository.getGenreNameById(it)
                    genreListString.add(name)
                }
                movie.genreString = genreListString.joinToString()
                movie
            }
        }
    }

}
