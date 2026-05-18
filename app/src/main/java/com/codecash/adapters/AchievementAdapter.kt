package com.codecash.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codecash.data.DataStore
import com.codecash.databinding.ItemAchievementBinding
import java.text.SimpleDateFormat
import java.util.*

/**
 * AchievementAdapter - RecyclerView adapter for displaying user achievements/badges.
 * 
 * References:
 * - RecyclerView patterns: https://developer.android.com/guide/topics/ui/layout/recyclerview
 */
class AchievementAdapter(private val achievementIds: List<Int>) : 
    RecyclerView.Adapter<AchievementAdapter.AchievementViewHolder>() {

    private val tag = "AchievementAdapter"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
        Log.d(tag, "onCreateViewHolder: Creating achievement view holder")
        
        val binding = ItemAchievementBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return AchievementViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        try {
            val achievementId = achievementIds[position]
            val index = DataStore.achievementIds.indexOf(achievementId)
            
            if (index != -1) {
                Log.d(tag, "onBindViewHolder: Binding achievement at position $position - ${DataStore.achievementTitles[index]}")
                
                val title = DataStore.achievementTitles[index]
                val description = DataStore.achievementDescriptions[index]
                val unlockedDate = DataStore.achievementUnlockedDates[index]
                val category = DataStore.achievementCategories[index]
                
                holder.bind(title, description, unlockedDate, category)
            } else {
                Log.w(tag, "Achievement not found at index: $index")
            }
        } catch (e: Exception) {
            Log.e(tag, "Error binding achievement: ${e.message}", e)
        }
    }

    override fun getItemCount(): Int = achievementIds.size

    class AchievementViewHolder(private val binding: ItemAchievementBinding) : 
        RecyclerView.ViewHolder(binding.root) {

        private val tag = "AchievementViewHolder"
        private val sdf = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())

        fun bind(title: String, description: String, unlockedDate: Long, category: String) {
            try {
                Log.d(tag, "bind: Binding achievement: $title")
                
                binding.tvAchievementTitle.text = title
                binding.tvAchievementDescription.text = description
                binding.tvUnlockedDate.text = "Unlocked: ${sdf.format(Date(unlockedDate))}"
                
                // Set badge color based on category
                val backgroundColor = when (category) {
                    "budget" -> "#FFA500"      // Orange for budget achievements
                    "consistency" -> "#4CAF50"  // Green for consistency
                    "milestone" -> "#2196F3"    // Blue for milestones
                    else -> "#9C27B0"           // Purple for others
                }
                binding.badgeCategory.setBackgroundColor(android.graphics.Color.parseColor(backgroundColor))
                binding.badgeCategory.text = category.uppercase()
                
            } catch (e: Exception) {
                Log.e(tag, "Error binding achievement: ${e.message}", e)
            }
        }
    }
}
