package ru.cft.shift2023winter.data.network.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacterLocationDto(
    val name: String,
    val url: String,
)
