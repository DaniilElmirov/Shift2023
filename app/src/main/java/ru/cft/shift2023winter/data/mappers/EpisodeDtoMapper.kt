package ru.cft.shift2023winter.data.mappers

import ru.cft.shift2023winter.data.network.model.EpisodeDto
import ru.cft.shift2023winter.domain.entities.Episode
import javax.inject.Inject

class EpisodeDtoMapper @Inject constructor(){

    operator fun invoke(episodeDto: EpisodeDto) = Episode(
        id = episodeDto.id,
        name = episodeDto.name,
        airDate = episodeDto.airDate,
        episodeCode = episodeDto.episodeCode,
        characters = episodeDto.characters,
        url = episodeDto.url,
        created = episodeDto.created,
    )
}