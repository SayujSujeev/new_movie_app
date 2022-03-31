package com.sayuj.themoviesdb.data.remoteSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/sayuj/themoviesdb/data/remoteSource/TheMovieDatabaseAPI;", "", "getGenreList", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/GenreDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/MovieDetailDto;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesOfSearchQuery", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieList/MoviesDto;", "searchQuery", "", "page", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlaying", "getPopularMovies", "getTopRatedMovies", "getUpcomingMovies", "Companion", "app_debug"})
public abstract interface TheMovieDatabaseAPI {
    @org.jetbrains.annotations.NotNull
    public static final com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "genre/movie/list")
    public abstract java.lang.Object getGenreList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.GenreDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/now_playing")
    public abstract java.lang.Object getNowPlaying(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/popular")
    public abstract java.lang.Object getPopularMovies(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/top_rated")
    public abstract java.lang.Object getTopRatedMovies(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/upcoming")
    public abstract java.lang.Object getUpcomingMovies(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "search/movie")
    public abstract java.lang.Object getMoviesOfSearchQuery(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String searchQuery, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MoviesDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/{movie-id}")
    public abstract java.lang.Object getMovieDetail(@retrofit2.http.Path(value = "movie-id")
    int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.MovieDetailDto> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/sayuj/themoviesdb/data/remoteSource/TheMovieDatabaseAPI$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
        
        private Companion() {
            super();
        }
    }
}