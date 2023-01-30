package ru.cft.shift2023winter.data.mappers

import ru.cft.shift2023winter.data.network.model.CharacterDto
import ru.cft.shift2023winter.domain.entities.Character

class CharacterDtoMapper {

    operator fun invoke(characterDto: CharacterDto) = Character(
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
}