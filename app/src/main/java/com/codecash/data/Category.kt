package com.codecash.data

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class Category(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val colorHex: String = "#2dd4bf",
    val minBudget: Double = 0.0,
    val maxBudget: Double = 0.0,
    val iconName: String = "default"
) {
    fun getColorInt(): Int = Color.parseColor(colorHex)
}