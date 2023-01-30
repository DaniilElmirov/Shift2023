package ru.cft.shift2023winter.data.repositories

import ru.cft.shift2023winter.data.mappers.EpisodeDtoMapper
import ru.cft.shift2023winter.data.network.api.RickAndMortyApi
import ru.cft.shift2023winter.domain.entities.Episode
import ru.cft.shift2023winter.domain.repositories.RickAndMortyEpisodeRepository
import javax.inject.Inject

class RickAndMortyEpisodeRepositoryImpl @Inject constructor(
    private val episodeDtoMapper: EpisodeDtoMapper,
    private val api: RickAndMortyApi,
) : RickAndMortyEpisodeRepository {

    override suspend fun getEpisodeList(): List<Episode> =
        api.getEpisodeResponse().results.map { episodeDtoMapper(it) }
}