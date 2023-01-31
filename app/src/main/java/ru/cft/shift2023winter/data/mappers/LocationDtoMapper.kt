package ru.cft.shift2023winter.data.mappers

import ru.cft.shift2023winter.data.network.model.LocationDto
import ru.cft.shift2023winter.domain.entities.Location
import javax.inject.Inject

class LocationDtoMapper @Inject constructor(){

    operator fun invoke(locationDto: LocationDto) = Location(
        id = locationDto.id,
        name = locationDto.name,
        type = locationDto.type,
        dimension = locationDto.dimension,
        residents = locationDto.residents,
        url = locationDto.url,
        created = locationDto.created,
    )
}