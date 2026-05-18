package com.codecash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityDashboardBinding
import com.codecash.utils.NavigationHelper

/**
 * DashboardActivity - Main dashboard showing financial overview.
 * 
 * Features:
 * - Display balance, income, and expenses for current month
 * - Show recent transactions list
 * - Navigation to transaction management features
 * - Budget goal progress tracking
 * 
 * References:
 * - RecyclerView best practices: https://developer.android.com/guide/topics/ui/layout/recyclerview
 * - Android Material Design: https://material.io/design
 */
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private val tag = "DashboardActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing DashboardActivity")
        
        try {
            binding = ActivityDashboardBinding.inflate(layoutInflater)
            setContentView(binding.root)
            
            setupUI()
            setupBottomNavigation()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading dashboard", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume: Updating dashboard data")
        
        try {
            updateDashboardData()
        } catch (e: Exception) {
            Log.e(tag, "Error updating dashboard on resume: ${e.message}", e)
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up dashboard UI components")
        
        try {
            // Welcome text
            val userName = DataStore.getCurrentUserName()
            binding.tvWelcome.text = "Welcome back, $userName!"
            Log.d(tag, "User name set: $userName")

            // RecyclerView setup
            binding.rvRecentTransactions.layoutManager = LinearLayoutManager(this)

            // View more button
            binding.tvViewMore.setOnClickListener {
                Log.d(tag, "View more transactions clicked")
                startActivity(Intent(this, TransactionListActivity::class.java))
            }

            // Add transaction button
            binding.btnAddTransaction.setOnClickListener {
                Log.d(tag, "Add transaction button clicked")
                startActivity(Intent(this, AddTransactionActivity::class.java))
            }
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up dashboard UI", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateDashboardData() {
        Log.d(tag, "updateDashboardData: Fetching financial data")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in, redirecting to login")
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
                return
            }

            // Calculate totals for current month
            val currentMonth = DataStore.getCurrentMonthYear()
            Log.d(tag, "Current month: $currentMonth")
            
            val (start, end) = DataStore.getMonthStartEnd(currentMonth)

            val income = DataStore.getIncomeTotal(userId, start, end)
            val expenses = DataStore.getExpenseTotal(userId, start, end)
            val balance = income - expenses

            Log.d(tag, "Financial totals - Income: $income, Expenses: $expenses, Balance: $balance")

            // Update UI with formatted currency
            binding.tvBalance.text = "R${String.format("%.2f", balance)}"
            binding.tvIncome.text = "R${String.format("%.2f", income)}"
            binding.tvExpenses.text = "R${String.format("%.2f", expenses)}"

            // Load recent transactions (sorted by date newest first via DataStore logic)
            val allTransactionIds = DataStore.getTransactionsForPeriod(userId, 0, Long.MAX_VALUE)
            Log.d(tag, "Total transactions for user: ${allTransactionIds.size}")
            
            val recentIds = if (allTransactionIds.size > 5) allTransactionIds.take(5) else allTransactionIds
            Log.d(tag, "Displaying ${recentIds.size} recent transactions")
            
            val adapter = TransactionAdapter(recentIds) { transactionId ->
                Log.d(tag, "Transaction clicked: $transactionId")
                // Handle transaction click (optional: view/edit)
                val index = DataStore.transactionIds.indexOf(transactionId)
                val photoPath = DataStore.transactionPhotoPaths.getOrNull(index)
                
                if (photoPath != null) {
                    Log.d(tag, "Photo found for transaction, navigating to photo view")
                    val intent = Intent(this, PhotoViewActivity::class.java)
                    intent.putExtra("transaction_id", transactionId)
                    startActivity(intent)
                } else {
                    Log.d(tag, "No photo associated with transaction")
                }
            }
            binding.rvRecentTransactions.adapter = adapter
            
            // Check and unlock achievements
            Log.d(tag, "Checking for achievement conditions")
            DataStore.checkAndUnlockAchievements(userId)
            
        } catch (e: Exception) {
            Log.e(tag, "Error updating dashboard data: ${e.message}", e)
            Toast.makeText(this, "Error loading financial data", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupBottomNavigation() {
        Log.d(tag, "setupBottomNavigation: Configuring navigation")
        try {
            NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_home)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up bottom navigation: ${e.message}", e)
        }
    }
}
