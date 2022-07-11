package com.example.finaltest.Interface

import com.example.finaltest.DTO.Responeresult
import com.example.finaltest.DTO.ResultData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AuthRetrofitInterface {
    @GET("guestPlace/rank")
    fun GetlLankplace(): Call<ResultData>

    @GET("posts/{page}")
    fun getUserPage(@Path("page") page:String): Call<ResultData>
    abstract fun enqueue(callback: Callback<ResultData>)
}

