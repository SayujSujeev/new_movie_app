package com.sayuj.themoviesdb.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/sayuj/themoviesdb/data/TheMoviesDao;", "", "deleteAllMoviesDetail", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMovieDetail", "movieDetail", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "(Lcom/sayuj/themoviesdb/domain/model/MovieDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMovies", "", "getGenreNameById", "Lcom/sayuj/themoviesdb/domain/model/Genre;", "genreId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "movieId", "insertMovieDetail", "insertServerGenres", "genreList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TheMoviesDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovieDetail(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * from MovieDetail WHERE id=:movieId")
    public abstract java.lang.Object getMovieDetail(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.domain.model.MovieDetail> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * from MovieDetail")
    public abstract java.lang.Object getAllMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sayuj.themoviesdb.domain.model.MovieDetail>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteMovieDetail(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.model.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM MovieDetail")
    public abstract java.lang.Object deleteAllMoviesDetail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertServerGenres(@org.jetbrains.annotations.NotNull
    java.util.List<com.sayuj.themoviesdb.domain.model.Genre> genreList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * from Genre WHERE id=:genreId")
    public abstract java.lang.Object getGenreNameById(int genreId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sayuj.themoviesdb.domain.model.Genre> continuation);
}