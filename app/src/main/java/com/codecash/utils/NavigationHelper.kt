package com.codecash.utils

import android.app.Activity
import android.content.Intent
import com.codecash.AchievementsActivity
import com.codecash.BudgetGoalsActivity
import com.codecash.DashboardActivity
import com.codecash.R
import com.codecash.SettingsActivity
import com.codecash.StatsActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

object NavigationHelper {

    fun setupBottomNavigation(
        activity: Activity,
        bottomNav: BottomNavigationView,
        activeItemId: Int
    ) {
        bottomNav.selectedItemId = activeItemId

        bottomNav.setOnItemSelectedListener { item ->
            if (item.itemId == activeItemId) return@setOnItemSelectedListener true

            val target = when (item.itemId) {
                R.id.nav_home         -> DashboardActivity::class.java
                R.id.nav_stats        -> StatsActivity::class.java
                R.id.nav_budget       -> BudgetGoalsActivity::class.java
                R.id.nav_achievements -> AchievementsActivity::class.java
                R.id.nav_settings     -> SettingsActivity::class.java
                else                  -> return@setOnItemSelectedListener false
            }

            if (activity.javaClass == target) return@setOnItemSelectedListener true
            activity.startActivity(Intent(activity, target))
            activity.finish()
            true
        }
    }
}