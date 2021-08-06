package com.demo.news

import com.google.gson.annotations.SerializedName

data class RecyclerList (val items: ArrayList<RecyclerData>)
//data class RecyclerList (val status: String, val totalResults: Int, val modelArticle: ArrayList<ModelArticle>)
data class RecyclerData(
    @SerializedName("status")
    val status: String = "",

    @SerializedName("totalResults")
    val totalResults: Int = 0,

    @SerializedName("articles")
    val modelArticle: ArrayList<ModelArticle>?
)
//data class Owner(val avatar_url: String)

