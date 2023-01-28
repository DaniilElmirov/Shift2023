package ru.cft.shift2023winter.data.network.model

import com.squareup.moshi.JsonClass
import ru.cft.shift2023winter.domain.entities.Location

@JsonClass(generateAdapter = true)
data class CharacterDto(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Location,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String,
)
