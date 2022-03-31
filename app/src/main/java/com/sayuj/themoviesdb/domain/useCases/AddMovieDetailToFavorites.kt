package com.sayuj.themoviesdb.domain.useCases

import com.sayuj.themoviesdb.domain.model.MovieDetail
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository

class AddMovieDetailToFavorites(val repository: TheMovieDbRepository) {
    suspend operator fun invoke(movieDetail: MovieDetail) {
        repository.addMovieToFavorites(movieDetail)
    }
}