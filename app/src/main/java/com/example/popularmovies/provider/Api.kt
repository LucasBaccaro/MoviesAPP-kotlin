package com.example.popularmovies.provider

import com.example.popularmovies.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "19d7ece696873f8281f91f25e05531e0",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "19d7ece696873f8281f91f25e05531e0",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}