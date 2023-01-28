package ru.cft.shift2023winter.data.network

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import ru.cft.shift2023winter.data.network.model.CharacterResponseDto
import ru.cft.shift2023winter.data.network.model.EpisodeResponseDto
import ru.cft.shift2023winter.data.network.model.LocationResponseDto

interface RickAndMortyApi {
    @GET("/character")
    fun getCharacterList(): Flow<CharacterResponseDto>

    @GET("/episode")
    fun getEpisodeList(): Flow<EpisodeResponseDto>

    @GET("/location")
    fun getLocationList(): Flow<LocationResponseDto>
}