package ru.cft.shift2023winter.data.mappers

import ru.cft.shift2023winter.data.network.model.CharacterDto
import ru.cft.shift2023winter.data.network.model.CharacterLocationDto
import ru.cft.shift2023winter.domain.entities.Character
import ru.cft.shift2023winter.domain.entities.CharacterLocation
import javax.inject.Inject

class CharacterDtoMapper @Inject constructor() {

    operator fun invoke(characterDto: CharacterDto) = Character(
        id = characterDto.id,
        name = characterDto.name,
        status = characterDto.status,
        species = characterDto.species,
        type = characterDto.type,
        gender = characterDto.gender,
        location = mapCharacterLocationDtoToCharacterLocation(characterDto.location),
        origin = mapCharacterLocationDtoToCharacterLocation(characterDto.origin),
        image = characterDto.image,
        episode = characterDto.episode,
        url = characterDto.url,
        created = characterDto.created,
    )

    private fun mapCharacterLocationDtoToCharacterLocation(characterLocationDto: CharacterLocationDto) =
        CharacterLocation(
            name = characterLocationDto.name,
            url = characterLocationDto.url,
        )
}