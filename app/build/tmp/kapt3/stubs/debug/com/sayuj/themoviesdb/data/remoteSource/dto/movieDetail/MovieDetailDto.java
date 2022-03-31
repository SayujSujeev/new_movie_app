package com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u00c9\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010%J\u0006\u0010g\u001a\u00020hR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b>\u00104\"\u0004\b?\u00106R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010,\"\u0004\bA\u0010.R \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R \u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010L\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.R&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00109\"\u0004\bP\u0010;R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00109\"\u0004\bR\u0010;R \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010,\"\u0004\bT\u0010.R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\bW\u00104\"\u0004\bX\u00106R&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u00109\"\u0004\bZ\u0010;R \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010,\"\u0004\b\\\u0010.R \u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R \u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010,\"\u0004\b`\u0010.R\"\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\ba\u0010\'\"\u0004\bb\u0010)R\"\u0010#\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010L\u001a\u0004\bc\u0010I\"\u0004\bd\u0010KR\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\be\u00104\"\u0004\bf\u00106\u00a8\u0006i"}, d2 = {"Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/MovieDetailDto;", "", "adult", "", "backdropPath", "", "belongsToCollection", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/BelongsToCollection;", "budget", "", "genres", "", "Lcom/sayuj/themoviesdb/domain/model/Genre;", "homepage", "id", "imdbId", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "productionCompanies", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/ProductionCompany;", "productionCountries", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/ProductionCountry;", "releaseDate", "revenue", "runtime", "spokenLanguages", "Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/SpokenLanguage;", "status", "tagline", "title", "video", "voteAverage", "voteCount", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/BelongsToCollection;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAdult", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getBelongsToCollection", "()Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/BelongsToCollection;", "setBelongsToCollection", "(Lcom/sayuj/themoviesdb/data/remoteSource/dto/movieDetail/BelongsToCollection;)V", "getBudget", "()Ljava/lang/Integer;", "setBudget", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "getHomepage", "setHomepage", "getId", "setId", "getImdbId", "setImdbId", "getOriginalLanguage", "setOriginalLanguage", "getOriginalTitle", "setOriginalTitle", "getOverview", "setOverview", "getPopularity", "()Ljava/lang/Double;", "setPopularity", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPosterPath", "setPosterPath", "getProductionCompanies", "setProductionCompanies", "getProductionCountries", "setProductionCountries", "getReleaseDate", "setReleaseDate", "getRevenue", "setRevenue", "getRuntime", "setRuntime", "getSpokenLanguages", "setSpokenLanguages", "getStatus", "setStatus", "getTagline", "setTagline", "getTitle", "setTitle", "getVideo", "setVideo", "getVoteAverage", "setVoteAverage", "getVoteCount", "setVoteCount", "toMovieDetail", "Lcom/sayuj/themoviesdb/domain/model/MovieDetail;", "app_debug"})
public final class MovieDetailDto {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "adult")
    private java.lang.Boolean adult;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "belongs_to_collection")
    private com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.BelongsToCollection belongsToCollection;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "budget")
    private java.lang.Integer budget;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.sayuj.themoviesdb.domain.model.Genre> genres;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private java.lang.String homepage;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private java.lang.String imdbId;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private java.lang.String originalTitle;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private java.lang.Double popularity;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCompany> productionCompanies;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    private java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCountry> productionCountries;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private java.lang.Integer revenue;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private java.lang.Integer runtime;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    private java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.SpokenLanguage> spokenLanguages;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private java.lang.String tagline;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "video")
    private java.lang.Boolean video;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private java.lang.Double voteAverage;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private java.lang.Integer voteCount;
    
    public MovieDetailDto() {
        super();
    }
    
    public MovieDetailDto(@org.jetbrains.annotations.Nullable
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable
    com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.BelongsToCollection belongsToCollection, @org.jetbrains.annotations.Nullable
    java.lang.Integer budget, @org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.domain.model.Genre> genres, @org.jetbrains.annotations.Nullable
    java.lang.String homepage, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable
    java.lang.String overview, @org.jetbrains.annotations.Nullable
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCompany> productionCompanies, @org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCountry> productionCountries, @org.jetbrains.annotations.Nullable
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable
    java.lang.Integer revenue, @org.jetbrains.annotations.Nullable
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.SpokenLanguage> spokenLanguages, @org.jetbrains.annotations.Nullable
    java.lang.String status, @org.jetbrains.annotations.Nullable
    java.lang.String tagline, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable
    java.lang.Integer voteCount) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    public final void setAdult(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.BelongsToCollection getBelongsToCollection() {
        return null;
    }
    
    public final void setBelongsToCollection(@org.jetbrains.annotations.Nullable
    com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.BelongsToCollection p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getBudget() {
        return null;
    }
    
    public final void setBudget(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sayuj.themoviesdb.domain.model.Genre> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.domain.model.Genre> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final void setHomepage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    public final void setOriginalLanguage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    public final void setOriginalTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    public final void setPopularity(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCompany> getProductionCompanies() {
        return null;
    }
    
    public final void setProductionCompanies(@org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCompany> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCountry> getProductionCountries() {
        return null;
    }
    
    public final void setProductionCountries(@org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.ProductionCountry> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRevenue() {
        return null;
    }
    
    public final void setRevenue(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    public final void setRuntime(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.SpokenLanguage> getSpokenLanguages() {
        return null;
    }
    
    public final void setSpokenLanguages(@org.jetbrains.annotations.Nullable
    java.util.List<com.sayuj.themoviesdb.data.remoteSource.dto.movieDetail.SpokenLanguage> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTagline() {
        return null;
    }
    
    public final void setTagline(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    public final void setVideo(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    public final void setVoteAverage(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    public final void setVoteCount(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sayuj.themoviesdb.domain.model.MovieDetail toMovieDetail() {
        return null;
    }
}