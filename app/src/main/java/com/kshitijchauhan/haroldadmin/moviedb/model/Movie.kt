package com.kshitijchauhan.haroldadmin.moviedb.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @field:Json(name="poster_path") val posterPath: String?,
    @field:Json(name="adult") val isAdultMovie: Boolean,
    @field:Json(name="overview") val overview: String,
    @field:Json(name="release_date") val releaseDate: String,
    @field:Json(name="genre_ids") val genreIds: List<String>,
    @field:Json(name="id") val id: Int,
    @field:Json(name="original_title") val originalTitle: String,
    @field:Json(name="original_language") val originalLanguage: String,
    @field:Json(name="title") val title: String,
    @field:Json(name="backdrop_path") val backdropPath: String?,
    @field:Json(name="popularity") val popularity: Double,
    @field:Json(name="vote_count") val voteCount: Int,
    @field:Json(name="video") val video: Boolean,
    @field:Json(name="vote_average") val voteAverage: Double): Parcelable