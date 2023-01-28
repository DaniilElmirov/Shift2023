package ru.cft.shift2023winter.domain.usecases

import kotlinx.coroutines.flow.Flow
import ru.cft.shift2023winter.domain.RickAndMortyRepository
import ru.cft.shift2023winter.domain.entities.Character
import javax.inject.Inject

class GetCharacterListUseCase @Inject constructor(private val rickAndMortyRepository: RickAndMortyRepository) {
    fun getCharacterList(): Flow<List<Character>> {
        return rickAndMortyRepository.getCharacterList()
    }
}