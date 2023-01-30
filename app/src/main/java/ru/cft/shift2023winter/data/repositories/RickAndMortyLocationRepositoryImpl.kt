package ru.cft.shift2023winter.data.repositories

import ru.cft.shift2023winter.data.mappers.LocationDtoMapper
import ru.cft.shift2023winter.data.network.api.RickAndMortyApi
import ru.cft.shift2023winter.domain.entities.Location
import ru.cft.shift2023winter.domain.repositories.RickAndMortyLocationRepository
import javax.inject.Inject

class RickAndMortyLocationRepositoryImpl @Inject constructor(
    private val locationDtoMapper: LocationDtoMapper,
    private val api: RickAndMortyApi,
): RickAndMortyLocationRepository {

    override suspend fun getLocationList(): List<Location> {
        val locationDtoList = api.getLocationResponse().results

        val locationList = locationDtoList.map {
            locationDtoMapper(it)
        }

        return locationList
    }
}