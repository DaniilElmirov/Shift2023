package ru.cft.shift2023winter.domain.usecases

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.repository.RickAndMortyRepository
import ru.cft.shift2023winter.domain.entities.Character
import javax.inject.Inject

class GetCharacterListUseCase @Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) {

    operator fun invoke(): Flow<List<Character>> =
        rickAndMortyRepository.getCharacterList()
}