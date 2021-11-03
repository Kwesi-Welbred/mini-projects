package com.example.movieapp.data.api

import com.example.movieapp.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {
    //this is where we declare our API endpoints

    //https://api.themoviedb.org/3/movie/popular?api_key=92011820a117b4d9672355794c2285e9
    // https://api.themoviedb.org/3/movie/299534?api_key=92011820a117b4d9672355794c2285e9
    // https://image.tmdb.org/t/p/w342/or06FN3Dka5tukK1e9sl16pB3iy.jpg


    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>//observable class for movie details
}