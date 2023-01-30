package ru.cft.shift2023winter.domain.usecases

import ru.cft.shift2023winter.domain.entities.Location
import ru.cft.shift2023winter.domain.repositories.RickAndMortyLocationRepository
import javax.inject.Inject

class GetLocationListUseCase @Inject constructor(private val rickAndMortyLocationRepository: RickAndMortyLocationRepository) {

    suspend operator fun invoke(): List<Location> =
        rickAndMortyLocationRepository.getLocationList()
}