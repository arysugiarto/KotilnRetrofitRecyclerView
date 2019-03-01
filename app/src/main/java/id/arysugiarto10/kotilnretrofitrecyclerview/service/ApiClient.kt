package id.arysugiarto10.kotilnretrofitrecyclerview.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface ApiClient {
    companion object {
        fun getClient(): Retrofit{
            val BASE_URL = "https://api.themoviedb.org/3/"
            val retrofit: Retrofit = Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }
}