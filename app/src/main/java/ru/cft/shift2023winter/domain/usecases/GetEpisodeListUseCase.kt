package ru.cft.shift2023winter.domain.usecases

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.RickAndMortyRepository
import ru.cft.shift2023winter.domain.entities.Episode
import javax.inject.Inject

class GetEpisodeListUseCase @Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) {
    fun getEpisodeList(): Flow<List<Episode>> {
        return rickAndMortyRepository.getEpisodeList()
    }
}