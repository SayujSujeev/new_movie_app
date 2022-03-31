package com.sayuj.themoviesdb.domain.useCases

import com.sayuj.themoviesdb.domain.model.MovieDetail
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository

class DeleteMovieDetailFromFavorites(val repository: TheMovieDbRepository) {
    suspend operator fun invoke(movieDetail: MovieDetail) {
        repository.deleteMovieFromFavorites(movieDetail)
    }
}