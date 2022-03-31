package com.sayuj.themoviesdb.domain.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0015H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\t\u00101\u001a\u00020\rH\u00c6\u0003J\t\u00102\u001a\u00020\u000fH\u00c6\u0003J\t\u00103\u001a\u00020\u0011H\u00c6\u0003J\t\u00104\u001a\u00020\u0013H\u00c6\u0003Jm\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020<H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006="}, d2 = {"Lcom/sayuj/themoviesdb/domain/useCases/UseCases;", "", "getNowPlayingUseCase", "Lcom/sayuj/themoviesdb/domain/useCases/GetNowPlayingUseCase;", "getPopularUseCase", "Lcom/sayuj/themoviesdb/domain/useCases/GetPopularUseCase;", "getTopRatedMoviesUseCase", "Lcom/sayuj/themoviesdb/domain/useCases/GetTopRatedMoviesUseCase;", "getUpComingUseCase", "Lcom/sayuj/themoviesdb/domain/useCases/GetUpComingUseCase;", "getMovieDetailUseCase", "Lcom/sayuj/themoviesdb/domain/useCases/GetMovieDetailUseCase;", "addMovieDetailToFavorites", "Lcom/sayuj/themoviesdb/domain/useCases/AddMovieDetailToFavorites;", "deleteMovieDetailFromFavorites", "Lcom/sayuj/themoviesdb/domain/useCases/DeleteMovieDetailFromFavorites;", "getAllFavoritesMovies", "Lcom/sayuj/themoviesdb/domain/useCases/GetAllFavoritesMovies;", "deleteAllFavoritesMovies", "Lcom/sayuj/themoviesdb/domain/useCases/DeleteAllFavoritesMovies;", "getMoviesOfSearchQueryUseCase", "Lcom/sayuj/themoviesdb/domain/useCases/GetMoviesOfSearchQueryUseCase;", "(Lcom/sayuj/themoviesdb/domain/useCases/GetNowPlayingUseCase;Lcom/sayuj/themoviesdb/domain/useCases/GetPopularUseCase;Lcom/sayuj/themoviesdb/domain/useCases/GetTopRatedMoviesUseCase;Lcom/sayuj/themoviesdb/domain/useCases/GetUpComingUseCase;Lcom/sayuj/themoviesdb/domain/useCases/GetMovieDetailUseCase;Lcom/sayuj/themoviesdb/domain/useCases/AddMovieDetailToFavorites;Lcom/sayuj/themoviesdb/domain/useCases/DeleteMovieDetailFromFavorites;Lcom/sayuj/themoviesdb/domain/useCases/GetAllFavoritesMovies;Lcom/sayuj/themoviesdb/domain/useCases/DeleteAllFavoritesMovies;Lcom/sayuj/themoviesdb/domain/useCases/GetMoviesOfSearchQueryUseCase;)V", "getAddMovieDetailToFavorites", "()Lcom/sayuj/themoviesdb/domain/useCases/AddMovieDetailToFavorites;", "getDeleteAllFavoritesMovies", "()Lcom/sayuj/themoviesdb/domain/useCases/DeleteAllFavoritesMovies;", "getDeleteMovieDetailFromFavorites", "()Lcom/sayuj/themoviesdb/domain/useCases/DeleteMovieDetailFromFavorites;", "getGetAllFavoritesMovies", "()Lcom/sayuj/themoviesdb/domain/useCases/GetAllFavoritesMovies;", "getGetMovieDetailUseCase", "()Lcom/sayuj/themoviesdb/domain/useCases/GetMovieDetailUseCase;", "getGetMoviesOfSearchQueryUseCase", "()Lcom/sayuj/themoviesdb/domain/useCases/GetMoviesOfSearchQueryUseCase;", "getGetNowPlayingUseCase", "()Lcom/sayuj/themoviesdb/domain/useCases/GetNowPlayingUseCase;", "getGetPopularUseCase", "()Lcom/sayuj/themoviesdb/domain/useCases/GetPopularUseCase;", "getGetTopRatedMoviesUseCase", "()Lcom/sayuj/themoviesdb/domain/useCases/GetTopRatedMoviesUseCase;", "getGetUpComingUseCase", "()Lcom/sayuj/themoviesdb/domain/useCases/GetUpComingUseCase;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class UseCases {
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetNowPlayingUseCase getNowPlayingUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetPopularUseCase getPopularUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetTopRatedMoviesUseCase getTopRatedMoviesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetUpComingUseCase getUpComingUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetMovieDetailUseCase getMovieDetailUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.AddMovieDetailToFavorites addMovieDetailToFavorites = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.DeleteMovieDetailFromFavorites deleteMovieDetailFromFavorites = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetAllFavoritesMovies getAllFavoritesMovies = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.DeleteAllFavoritesMovies deleteAllFavoritesMovies = null;
    @org.jetbrains.annotations.NotNull
    private final com.sayuj.themoviesdb.domain.useCases.GetMoviesOfSearchQueryUseCase getMoviesOfSearchQueryUseCase = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.UseCases copy(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetNowPlayingUseCase getNowPlayingUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetPopularUseCase getPopularUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetTopRatedMoviesUseCase getTopRatedMoviesUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetUpComingUseCase getUpComingUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetMovieDetailUseCase getMovieDetailUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.AddMovieDetailToFavorites addMovieDetailToFavorites, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.DeleteMovieDetailFromFavorites deleteMovieDetailFromFavorites, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetAllFavoritesMovies getAllFavoritesMovies, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.DeleteAllFavoritesMovies deleteAllFavoritesMovies, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetMoviesOfSearchQueryUseCase getMoviesOfSearchQueryUseCase) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public UseCases(@org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetNowPlayingUseCase getNowPlayingUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetPopularUseCase getPopularUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetTopRatedMoviesUseCase getTopRatedMoviesUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetUpComingUseCase getUpComingUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetMovieDetailUseCase getMovieDetailUseCase, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.AddMovieDetailToFavorites addMovieDetailToFavorites, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.DeleteMovieDetailFromFavorites deleteMovieDetailFromFavorites, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetAllFavoritesMovies getAllFavoritesMovies, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.DeleteAllFavoritesMovies deleteAllFavoritesMovies, @org.jetbrains.annotations.NotNull
    com.sayuj.themoviesdb.domain.useCases.GetMoviesOfSearchQueryUseCase getMoviesOfSearchQueryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetNowPlayingUseCase component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetNowPlayingUseCase getGetNowPlayingUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetPopularUseCase component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetPopularUseCase getGetPopularUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetTopRatedMoviesUseCase component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetTopRatedMoviesUseCase getGetTopRatedMoviesUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetUpComingUseCase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetUpComingUseCase getGetUpComingUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetMovieDetailUseCase component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetMovieDetailUseCase getGetMovieDetailUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.AddMovieDetailToFavorites component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.AddMovieDetailToFavorites getAddMovieDetailToFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.DeleteMovieDetailFromFavorites component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.DeleteMovieDetailFromFavorites getDeleteMovieDetailFromFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetAllFavoritesMovies component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetAllFavoritesMovies getGetAllFavoritesMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.DeleteAllFavoritesMovies component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.DeleteAllFavoritesMovies getDeleteAllFavoritesMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetMoviesOfSearchQueryUseCase component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.useCases.GetMoviesOfSearchQueryUseCase getGetMoviesOfSearchQueryUseCase() {
        return null;
    }
}