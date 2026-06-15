package com.codecash.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userId: Int,
    val amount: Double,
    val description: String,
    val categoryId: Int,
    val date: Long,
    val startTime: Long = 0L,
    val endTime: Long = 0L,
    val photoPath: String? = null,
    val photoFileName: String? = null,
    val isIncome: Boolean = false
) {
    fun getFormattedAmount(): String = if (isIncome)
        "+R${String.format("%.2f", amount)}"
    else
        "-R${String.format("%.2f", amount)}"

    fun getDateString(): String {
        val sdf = java.text.SimpleDateFormat("dd MMM yyyy", java.util.Locale.getDefault())
        return sdf.format(java.util.Date(date))
    }
}