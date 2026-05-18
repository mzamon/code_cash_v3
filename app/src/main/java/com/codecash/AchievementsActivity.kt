package com.codecash

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.codecash.adapters.AchievementAdapter
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityAchievementsBinding
import com.codecash.utils.NavigationHelper

/**
 * AchievementsActivity - Display badges and achievements unlocked by user.
 * 
 * Part 3 Requirement: Gamification elements - badges for meeting goals.
 * 
 * Features:
 * - Grid display of earned achievements
 * - Achievement descriptions and unlock dates
 * - Reward tracking for consistent expense logging
 * - Badges for budget goal achievements
 * 
 * References:
 * - Gamification design: https://www.interaction-design.org/literature/articles/gamification
 * - Achievement systems in mobile apps
 */
class AchievementsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAchievementsBinding
    private val tag = "AchievementsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing AchievementsActivity")
        
        try {
            binding = ActivityAchievementsBinding.inflate(layoutInflater)
            setContentView(binding.root)

            setupUI()
            loadAchievements()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading achievements", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up achievements UI")
        
        try {
            // Toolbar
            binding.toolbar.setNavigationOnClickListener { 
                Log.d(tag, "Back button clicked")
                finish() 
            }

            // GridLayoutManager for achievements display
            binding.rvAchievements.layoutManager = GridLayoutManager(this, 2)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up achievements UI", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadAchievements() {
        Log.d(tag, "loadAchievements: Fetching user achievements")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in")
                return
            }

            val achievements = DataStore.getUserAchievements(userId)
            Log.d(tag, "Loaded ${achievements.size} achievements for user $userId")

            // Display user stats
            val allTransactions = DataStore.getTransactionsForUser(userId)
            val currentMonth = DataStore.getCurrentMonthYear()
            val (start, end) = DataStore.getMonthStartEnd(currentMonth)
            val monthExpenses = DataStore.getExpenseTotal(userId, start, end)

            binding.tvStats.text = """
                Total Transactions: ${allTransactions.size}
                This Month's Expenses: R${"%.2f".format(monthExpenses)}
                Achievements Earned: ${achievements.size}
            """.trimIndent()

            // Setup adapter
            val adapter = AchievementAdapter(achievements)
            binding.rvAchievements.adapter = adapter

        } catch (e: Exception) {
            Log.e(tag, "Error loading achievements: ${e.message}", e)
            Toast.makeText(this, "Error loading achievements: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}
