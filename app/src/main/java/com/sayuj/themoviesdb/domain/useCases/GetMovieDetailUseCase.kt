package com.sayuj.themoviesdb.domain.useCases

import com.sayuj.themoviesdb.common.Resource
import com.sayuj.themoviesdb.domain.model.MovieDetail
import com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository
import kotlinx.coroutines.flow.Flow

class GetMovieDetailUseCase(val repository: TheMovieDbRepository) {
    operator fun invoke(movieId: Int): Flow<Resource<MovieDetail>> {
        return repository.getMovieDetail(movieId)
    }
}