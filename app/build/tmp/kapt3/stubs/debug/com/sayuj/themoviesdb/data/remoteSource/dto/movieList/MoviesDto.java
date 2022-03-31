package com.sayuj.themoviesdb.data.remoteSource.dto.movieList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJB\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieList/MoviesDto;", "", "page", "", "movieDtos", "", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieList/MovieDto;", "totalPages", "totalResults", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMovieDtos", "()Ljava/util/List;", "setMovieDtos", "(Ljava/util/List;)V", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotalPages", "setTotalPages", "getTotalResults", "setTotalResults", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieList/MoviesDto;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MoviesDto {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "page")
    private java.lang.Integer page;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MovieDto> movieDtos;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private java.lang.Integer totalPages;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private java.lang.Integer totalResults;
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MoviesDto copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MovieDto> movieDtos, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
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
    
    public MoviesDto(@org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MovieDto> movieDtos, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MovieDto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MovieDto> getMovieDtos() {
        return null;
    }
    
    public final void setMovieDtos(@org.jetbrains.annotations.NotNull
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieList.MovieDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    public final void setTotalPages(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    public final void setTotalResults(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
}