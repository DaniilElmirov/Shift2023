package ru.cft.shift2023winter.domain

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.entities.Character
import ru.cft.shift2023winter.domain.entities.Episode
import ru.cft.shift2023winter.domain.entities.Location

interface RickAndMortyRepository {
    fun getCharacterList(): Flow<List<Character>>

    fun getLocationList(): Flow<List<Location>>

    fun getEpisodeList(): Flow<List<Episode>>
}