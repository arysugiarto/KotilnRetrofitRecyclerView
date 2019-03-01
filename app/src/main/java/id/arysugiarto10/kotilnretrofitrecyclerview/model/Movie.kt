package id.arysugiarto10.kotilnretrofitrecyclerview.model

import android.support.v7.widget.DialogTitle
import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("original_title") val originalTitle : String?,
    @SerializedName("overview") val overlayView : String?,
    @SerializedName("poster_path") val posterPath : String?)