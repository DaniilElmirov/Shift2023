package ru.cft.shift2023winter.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiFactory {
    private const val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val api = retrofit.create(RickAndMortyApi::class.java)
}