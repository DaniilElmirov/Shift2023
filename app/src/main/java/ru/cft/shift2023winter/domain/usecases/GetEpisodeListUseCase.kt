package ru.cft.shift2023winter.domain.usecases

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.entities.Episode
import ru.cft.shift2023winter.domain.repository.RickAndMortyRepository
import javax.inject.Inject

class GetEpisodeListUseCase @Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) {

    operator fun invoke(): Flow<List<Episode>> =
        rickAndMortyRepository.getEpisodeList()
}