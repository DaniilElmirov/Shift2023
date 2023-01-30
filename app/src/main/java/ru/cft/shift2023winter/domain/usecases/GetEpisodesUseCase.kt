package ru.cft.shift2023winter.domain.usecases

import ru.cft.shift2023winter.domain.entities.Episode
import ru.cft.shift2023winter.domain.repositories.RickAndMortyEpisodeRepository
import javax.inject.Inject

class GetEpisodesUseCase @Inject constructor(private val rickAndMortyEpisodeRepository: RickAndMortyEpisodeRepository) {

    suspend operator fun invoke(): List<Episode> =
        rickAndMortyEpisodeRepository.getEpisodeList()
}