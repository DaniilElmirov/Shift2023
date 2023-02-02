package ru.cft.shift2023winter.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CharacterLocation(
    val name: String,
    val url: String,
) : Parcelable
