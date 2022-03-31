package com.sayuj.themoviesdb.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u000b2\u0006\u0010\u0015\u001a\u00020\u0011H&J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180\u000bH&J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH&J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180\u000bH&J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180\u000bH&J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;", "", "addMovieToFavorites", "", "movieDetail", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "(Lcom/sayuj/themoviesdb/domain/model/MovieDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllFavoritesMovies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMovieFromFavorites", "getAllFavoritesMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "getGenreNameById", "", "genreId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "Lcom/sayuj/themoviesdb/common/Resource;", "movieId", "getMovieFromFavorites", "getMoviesNowPlaying", "Landroidx/paging/PagingData;", "getMoviesOfSearchQuery", "Landroidx/lifecycle/LiveData;", "searchQuery", "getMoviesPopular", "getMoviesTopRated", "getMoviesUpcoming", "app_debug"})
public abstract interface TheMovieDbRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGenreNameById(int genreId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesNowPlaying();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesPopular();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesTopRated();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesUpcoming();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesOfSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.sayuj.themoviesdb.common.Resource<com.sayuj.themoviesdb.domain.model.MovieDetail>> getMovieDetail(int movieId);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addMovieToFavorites(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMovieFromFavorites(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteMovieFromFavorites(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllFavoritesMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.sayuj.themoviesdb.domain.model.Movie>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllFavoritesMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}