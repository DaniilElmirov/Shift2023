package ru.cft.shift2023winter.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.cft.shift2023winter.data.mapper.Mapper
import ru.cft.shift2023winter.data.network.api.RickAndMortyApi
import ru.cft.shift2023winter.domain.repository.RickAndMortyRepository
import ru.cft.shift2023winter.domain.entities.Character
import ru.cft.shift2023winter.domain.entities.Episode
import ru.cft.shift2023winter.domain.entities.Location
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val mapper: Mapper,
    private val api: RickAndMortyApi,
) : RickAndMortyRepository {

    override fun getCharacterList(): Flow<List<Character>> {
        return flow {
            val characterList = api.getCharacterResponse().results

            emit(
                characterList.map {
                    mapper.mapCharacterDtoToCharacter(it)
                }
            )
        }
    }

    override fun getLocationList(): Flow<List<Location>> {
        return flow {
            val locationList = api.getLocationResponse().results

            emit(
                locationList.map {
                    mapper.mapLocationDtoToLocation(it)
                }
            )
        }
    }

    override fun getEpisodeList(): Flow<List<Episode>> {
        return flow {
            val episodeList = api.getEpisodeResponse().results

            emit(
                episodeList.map {
                    mapper.mapEpisodeDtoToEpisode(it)
                }
            )
        }
    }
}