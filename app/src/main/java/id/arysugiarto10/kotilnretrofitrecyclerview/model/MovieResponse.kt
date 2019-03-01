package id.arysugiarto10.kotilnretrofitrecyclerview.model

import java.util.ArrayList

data class MovieResponse(
    var page: Int,
    val results : ArrayList<Movie>,
    val totalResult : Int,
    val totalPage : Int
)