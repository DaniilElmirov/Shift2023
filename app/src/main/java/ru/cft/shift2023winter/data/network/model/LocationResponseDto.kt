package ru.cft.shift2023winter.data.network.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationResponseDto(
    val info: InfoDto,
    val results: List<LocationDto>,
)
