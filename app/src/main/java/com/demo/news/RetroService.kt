package com.demo.news

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {


    @GET("top-headlines")
    fun getDataFromAPI(
        @Query("country") country: String?,
        @Query("apiKey") apiKey: String?
    ): Call<RecyclerData>



}