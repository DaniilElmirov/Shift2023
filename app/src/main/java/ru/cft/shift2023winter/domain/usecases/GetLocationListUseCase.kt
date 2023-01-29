package ru.cft.shift2023winter.domain.usecases

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.repository.RickAndMortyRepository
import ru.cft.shift2023winter.domain.entities.Location
import javax.inject.Inject

class GetLocationListUseCase @Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) {

    operator fun invoke(): Flow<List<Location>> =
        rickAndMortyRepository.getLocationList()
}