package com.sayuj.themoviesdb.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u00102\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0019\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d0\u0010H\u0016J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d0\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d0\u0010H\u0016J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d0\u0010H\u0016J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d0\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/sayuj/themoviesdb/data/repository/TheMovieDbRepositoryImpl;", "Lcom/sayuj/themoviesdb/domain/repository/TheMovieDbRepository;", "theMovieDatabaseAPI", "Lcom/sayuj/themoviesdb/data/remoteSource/TheMovieDatabaseAPI;", "dao", "Lcom/sayuj/themoviesdb/data/TheMoviesDao;", "(Lcom/sayuj/themoviesdb/data/remoteSource/TheMovieDatabaseAPI;Lcom/sayuj/themoviesdb/data/TheMoviesDao;)V", "addMovieToFavorites", "", "movieDetail", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "(Lcom/sayuj/themoviesdb/domain/model/MovieDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllFavoritesMovies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMovieFromFavorites", "getAllFavoritesMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "getGenreNameById", "", "genreId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "Lcom/sayuj/themoviesdb/common/Resource;", "movieId", "getMovieFromFavorites", "getMoviesNowPlaying", "Landroidx/paging/PagingData;", "getMoviesOfSearchQuery", "Landroidx/lifecycle/LiveData;", "searchQuery", "getMoviesPopular", "getMoviesTopRated", "getMoviesUpcoming", "Companion", "app_debug"})
public final class TheMovieDbRepositoryImpl implements com.sayuj.themoviesdb.domain.repository.TheMovieDbRepository {
    private final com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI theMovieDatabaseAPI = null;
    private final com.sayuj.themoviesdb.data.TheMoviesDao dao = null;
    @org.jetbrains.annotations.NotNull
    public static final com.sayuj.themoviesdb.data.repository.TheMovieDbRepositoryImpl.Companion Companion = null;
    public static final int PAGE_SIZE = 20;
    
    public TheMovieDbRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.data.remoteSource.TheMovieDatabaseAPI theMovieDatabaseAPI, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.data.TheMoviesDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getGenreNameById(int genreId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesNowPlaying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesPopular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesTopRated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesUpcoming() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<androidx.paging.PagingData<com.sayuj.themoviesdb.domain.model.Movie>> getMoviesOfSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.sayuj.themoviesdb.common.Resource<com.sayuj.themoviesdb.domain.model.MovieDetail>> getMovieDetail(int movieId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addMovieToFavorites(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovieFromFavorites(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteMovieFromFavorites(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllFavoritesMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.sayuj.themoviesdb.domain.model.Movie>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllFavoritesMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/sayuj/themoviesdb/data/repository/TheMovieDbRepositoryImpl$Companion;", "", "()V", "PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}