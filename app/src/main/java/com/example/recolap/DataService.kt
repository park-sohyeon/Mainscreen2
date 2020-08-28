package com.example.recolap

import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


class DataService {
    private val BASE_URL = "http://13.209.28.207/restapi/member/" // TODO REST API 퍼블릭 IP로 변경
    var retrofitClient = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(OkHttpClient.Builder().build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    var select = retrofitClient.create(SelectAPI::class.java)
    var insert = retrofitClient.create(InsertAPI::class.java)
    var update = retrofitClient.create(UpdateAPI::class.java)
    var delete = retrofitClient.create(DeleteAPI::class.java)
}

interface SelectAPI {
    @GET("select/{id}")
    fun selectOne(@Path("id") id: Long): Call<Member?>?

    @GET("select")
    fun selectAll(): Call<List<Member?>?>?
}

interface InsertAPI {
    @POST("insert")
    fun insertOne(@Body map: Map<String?, String?>?): Call<Member?>?
}

interface UpdateAPI {
    @POST("update/{id}")
    fun updateOne(
        @Path("id") id: Long,
        @Body map: Map<String?, String?>?
    ): Call<Member?>?
}

interface DeleteAPI {
    @POST("delete/{id}")
    fun deleteOne(@Path("id") id: Long): Call<ResponseBody?>?
}