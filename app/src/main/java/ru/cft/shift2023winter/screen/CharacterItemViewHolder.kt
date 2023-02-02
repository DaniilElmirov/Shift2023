package ru.cft.shift2023winter.screen

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.cft.shift2023winter.R

class CharacterItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val characterName: TextView = view.findViewById(R.id.character_name)
    val characterImage: ImageView = view.findViewById(R.id.character_image)
}