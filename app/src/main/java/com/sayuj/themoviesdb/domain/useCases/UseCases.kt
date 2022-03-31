package com.sayuj.themoviesdb.domain.useCases

data class UseCases(
    val getNowPlayingUseCase: GetNowPlayingUseCase,
    val getPopularUseCase: GetPopularUseCase,
    val getTopRatedMoviesUseCase: GetTopRatedMoviesUseCase,
    val getUpComingUseCase: GetUpComingUseCase,
    val getMovieDetailUseCase: GetMovieDetailUseCase,
    val addMovieDetailToFavorites: AddMovieDetailToFavorites,
    val deleteMovieDetailFromFavorites: DeleteMovieDetailFromFavorites,
    val getAllFavoritesMovies: GetAllFavoritesMovies,
    val deleteAllFavoritesMovies: DeleteAllFavoritesMovies,
    val getMoviesOfSearchQueryUseCase: GetMoviesOfSearchQueryUseCase,
)