package ru.cft.shift2023winter.domain.repositories

import ru.cft.shift2023winter.domain.entities.Location

interface RickAndMortyLocationRepository {

    suspend fun getLocationList(): List<Location>
}