package ru.cft.shift2023winter.data.mapper

import ru.cft.shift2023winter.data.network.model.CharacterDto
import ru.cft.shift2023winter.data.network.model.EpisodeDto
import ru.cft.shift2023winter.data.network.model.LocationDto
import ru.cft.shift2023winter.domain.entities.Character
import ru.cft.shift2023winter.domain.entities.Episode
import ru.cft.shift2023winter.domain.entities.Location

class Mapper {
    fun mapCharacterDtoToCharacter(characterDto: CharacterDto) = Character(
        id = characterDto.id,
        name = characterDto.name,
        status = characterDto.status,
        species = characterDto.species,
        type = characterDto.type,
        gender = characterDto.gender,
        location = characterDto.location,
        origin = characterDto.origin,
        image = characterDto.image,
        episode = characterDto.episode,
        url = characterDto.url,
        created = characterDto.created,
    )

    fun mapEpisodeDtoToEpisode(episodeDto: EpisodeDto) = Episode(
        id = episodeDto.id,
        name = episodeDto.name,
        airDate = episodeDto.airDate,
        episodeCode = episodeDto.episodeCode,
        characters = episodeDto.characters,
        url = episodeDto.url,
        created = episodeDto.created,
    )

    fun mapLocationDtoToLocation(locationDto: LocationDto) = Location(
        id = locationDto.id,
        name = locationDto.name,
        type = locationDto.type,
        dimension = locationDto.dimension,
        residents = locationDto.residents,
        url = locationDto.url,
        created = locationDto.created,
    )
}