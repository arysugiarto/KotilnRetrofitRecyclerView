package id.arysugiarto10.kotilnretrofitrecyclerview.service


import id.arysugiarto10.kotilnretrofitrecyclerview.model.Movie
import id.arysugiarto10.kotilnretrofitrecyclerview.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {
    @GET("movie/latest")
    fun getMovieLatest(@Query("api_key") apiKey : String) : Call<Movie>
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey: String) : Call<MovieResponse>
}