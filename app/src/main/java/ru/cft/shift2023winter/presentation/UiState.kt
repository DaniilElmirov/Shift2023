package ru.cft.shift2023winter.presentation

import ru.cft.shift2023winter.domain.entities.Character

sealed interface UiState{
    object Initial : UiState

    object Loading : UiState

    data class Content(val characterList: List<Character>) : UiState

    data class Error(val message: String?) : UiState
}