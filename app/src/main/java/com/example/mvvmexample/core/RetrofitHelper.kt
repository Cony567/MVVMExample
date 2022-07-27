package com.example.mvvmexample.core
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
object RetrofitHelper {
    fun getRetrofit():Retrofit{

        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}