package com.sayuj.themoviesdb.domain.useCases

import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository

class DeleteAllFavoritesMovies(private val repository: TheMovieDbRepository) {
    suspend operator fun invoke() {
        repository.deleteAllFavoritesMovies()
    }

}