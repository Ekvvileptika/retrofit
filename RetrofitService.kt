package com.example.myapplication.retrofit

import com.example.myapplication.activityResult.TempDataModel
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {
    @GET("/posts")
    suspend fun getPosts(): Response<List<TempDataModel>>
}