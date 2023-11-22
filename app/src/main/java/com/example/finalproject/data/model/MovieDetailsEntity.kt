package com.example.finalproject.data.model

import com.google.gson.annotations.SerializedName

data class MovieDetailsEntity(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("overview")
    val description: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("vote_count")
    val voteCount: Int,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("vote_average")
    val rating: Float,
)