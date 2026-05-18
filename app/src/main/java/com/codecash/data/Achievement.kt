package com.codecash.data

import java.util.*

/**
 * Data model for gamification achievements/badges.
 * Part 3 requirement: Track badges for meeting budget goals and consistent logging.
 * 
 * References:
 * - Gamification design patterns: https://www.interaction-design.org/literature/articles/gamification
 * - Achievement systems in Android apps
 */
data class Achievement(
    val id: Int,
    val userId: Int,
    val title: String,
    val description: String,
    val iconResId: String,
    val unlockedDate: Long,
    val category: String // "budget", "consistency", "milestone"
)
