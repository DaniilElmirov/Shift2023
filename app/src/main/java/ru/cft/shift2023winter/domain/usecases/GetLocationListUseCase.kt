package ru.cft.shift2023winter.domain.usecases

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.RickAndMortyRepository
import ru.cft.shift2023winter.domain.entities.Location
import javax.inject.Inject

class GetLocationListUseCase @Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) {
    fun getLocationList(): Flow<List<Location>> {
        return rickAndMortyRepository.getLocationList()
    }
}