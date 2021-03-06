package com.sayuj.themoviesdb.data.remoteSource.dto.movieList

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class MoviesDto(
    @SerializedName("page")
    @Expose
    var page: Int? = null,
    @SerializedName("results")
    @Expose
    var movieDtos: List<MovieDto>,
    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null,
    @SerializedName("total_results")
    @Expose
    var totalResults: Int? = null
)
