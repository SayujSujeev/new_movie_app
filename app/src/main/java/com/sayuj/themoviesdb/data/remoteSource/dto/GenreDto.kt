package com.sayuj.themoviesdb.data.remoteSource.dto

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.sayuj.themoviesdb.domain.model.Genre

class GenreDto(
    @SerializedName("genres")
    @Expose
    var genres: List<Genre>
)