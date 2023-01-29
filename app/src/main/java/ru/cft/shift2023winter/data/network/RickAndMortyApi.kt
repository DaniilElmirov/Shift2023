package ru.cft.shift2023winter.data.network

import retrofit2.http.GET
import ru.cft.shift2023winter.data.network.model.CharacterResponseDto
import ru.cft.shift2023winter.data.network.model.EpisodeResponseDto
import ru.cft.shift2023winter.data.network.model.LocationResponseDto

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacterList(): CharacterResponseDto

    @GET("episode")
    suspend fun getEpisodeList(): EpisodeResponseDto

    @GET("location")
    suspend fun getLocationList(): LocationResponseDto
}