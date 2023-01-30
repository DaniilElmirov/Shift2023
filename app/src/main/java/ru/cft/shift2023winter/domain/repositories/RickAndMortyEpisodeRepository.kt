package ru.cft.shift2023winter.domain.repositories

import ru.cft.shift2023winter.domain.entities.Episode

interface RickAndMortyEpisodeRepository {

    suspend fun getEpisodeList(): List<Episode>
}