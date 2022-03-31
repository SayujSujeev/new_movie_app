package com.sayuj.themoviesdb.domain.useCases

import com.sayuj.themoviesdb.domain.model.Movie
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository
import kotlinx.coroutines.flow.Flow

class GetAllFavoritesMovies(private val repository: TheMovieDbRepository) {
    suspend operator fun invoke(): Flow<List<Movie>> {
        return repository.getAllFavoritesMovies()
    }
}