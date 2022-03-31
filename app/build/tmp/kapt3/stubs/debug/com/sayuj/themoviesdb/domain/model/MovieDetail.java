package com.sayuj.themoviesdb.domain.model;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u001d\u001a\u00020\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "", "id", "", "title", "", "ratingCount", "releaseDate", "overview", "genresString", "posterImage", "backdropImage", "isFavorites", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBackdropImage", "()Ljava/lang/String;", "getGenresString", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "setFavorites", "(Z)V", "getOverview", "getPosterImage", "getRatingCount", "getReleaseDate", "getTitle", "toMovie", "Lcom/sayuj/themoviesdb/domain/model/Movie;", "app_debug"})
public final class MovieDetail {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ratingCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String genresString = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String posterImage = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String backdropImage = null;
    private boolean isFavorites;
    
    public MovieDetail(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String ratingCount, @org.jetbrains.annotations.Nullable
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.Nullable
    java.lang.String genresString, @org.jetbrains.annotations.Nullable
    java.lang.String posterImage, @org.jetbrains.annotations.Nullable
    java.lang.String backdropImage, boolean isFavorites) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRatingCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGenresString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackdropImage() {
        return null;
    }
    
    public final boolean isFavorites() {
        return false;
    }
    
    public final void setFavorites(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.model.Movie toMovie() {
        return null;
    }
}