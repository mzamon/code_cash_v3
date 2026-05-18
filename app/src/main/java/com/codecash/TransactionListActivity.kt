package com.codecash

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityTransactionListBinding
import com.codecash.utils.NavigationHelper
import java.text.SimpleDateFormat
import java.util.*

/**
 * TransactionListActivity - View and filter transaction history.
 * 
 * Features:
 * - View all transactions in selectable period (Part 2)
 * - Date range filtering
 * - Bubble sort applied by DataStore for consistency
 * - Photo viewing for receipt attachments
 * - Error handling and comprehensive logging
 * 
 * References:
 * - RecyclerView: https://developer.android.com/guide/topics/ui/layout/recyclerview
 * - Date filtering patterns in Android
 */
class TransactionListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransactionListBinding
    private var startDate: Long = 0
    private var endDate: Long = System.currentTimeMillis()
    private val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
    private val tag = "TransactionListActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing TransactionListActivity")
        
        try {
            binding = ActivityTransactionListBinding.inflate(layoutInflater)
            setContentView(binding.root)

            setupUI()
            loadTransactions()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading transactions", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up transaction list UI")
        
        try {
            // Toolbar configuration
            binding.toolbar.setNavigationOnClickListener { 
                Log.d(tag, "Back button clicked")
                finish() 
            }

            // Date Filter initialization (defaults to current month)
            val calendar = Calendar.getInstance()
            calendar.set(Calendar.DAY_OF_MONTH, 1)
            calendar.set(Calendar.HOUR_OF_DAY, 0)
            calendar.set(Calendar.MINUTE, 0)
            startDate = calendar.timeInMillis
            
            binding.btnStartDate.text = sdf.format(Date(startDate))
            binding.btnEndDate.text = sdf.format(Date(endDate))
            Log.d(tag, "Date filter initialized - Start: ${sdf.format(Date(startDate))}, End: ${sdf.format(Date(endDate))}")

            binding.btnStartDate.setOnClickListener { 
                Log.d(tag, "Start date picker clicked")
                showDatePicker(true) 
            }
            binding.btnEndDate.setOnClickListener { 
                Log.d(tag, "End date picker clicked")
                showDatePicker(false) 
            }

            // RecyclerView setup
            binding.rvTransactions.layoutManager = LinearLayoutManager(this)

            // Navigation setup
            NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_home)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up UI", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showDatePicker(isStartDate: Boolean) {
        Log.d(tag, "showDatePicker: isStartDate=$isStartDate")
        
        try {
            val calendar = Calendar.getInstance()
            calendar.timeInMillis = if (isStartDate) startDate else endDate

            DatePickerDialog(
                this,
                { _, year, month, day ->
                    val selectedCal = Calendar.getInstance()
                    if (isStartDate) {
                        selectedCal.set(year, month, day, 0, 0, 0)
                        startDate = selectedCal.timeInMillis
                        binding.btnStartDate.text = sdf.format(selectedCal.time)
                        Log.d(tag, "Start date changed to: ${sdf.format(selectedCal.time)}")
                    } else {
                        selectedCal.set(year, month, day, 23, 59, 59)
                        endDate = selectedCal.timeInMillis
                        binding.btnEndDate.text = sdf.format(selectedCal.time)
                        Log.d(tag, "End date changed to: ${sdf.format(selectedCal.time)}")
                    }
                    loadTransactions()
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        } catch (e: Exception) {
            Log.e(tag, "Error showing date picker: ${e.message}", e)
        }
    }

    /**
     * Load and display transactions for selected period.
     * Uses DataStore bubble sort for consistency.
     */
    private fun loadTransactions() {
        Log.d(tag, "loadTransactions: Fetching transactions for period $startDate - $endDate")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in")
                return
            }

            // Fetch filtered and bubble-sorted transactions from DataStore (as per rubric)
            val transactionIdList = DataStore.getTransactionsForPeriod(userId, startDate, endDate)
            Log.d(tag, "Fetched ${transactionIdList.size} transactions for user $userId")

            if (transactionIdList.isEmpty()) {
                Log.d(tag, "No transactions found for this period")
                binding.tvEmpty.visibility = View.VISIBLE
                binding.rvTransactions.visibility = View.GONE
                binding.tvEmpty.text = "No transactions in this period"
            } else {
                binding.tvEmpty.visibility = View.GONE
                binding.rvTransactions.visibility = View.VISIBLE
                
                val adapter = TransactionAdapter(transactionIdList) { transactionId ->
                    Log.d(tag, "Transaction clicked: $transactionId")
                    
                    // Check if transaction has a photo
                    val index = DataStore.transactionIds.indexOf(transactionId)
                    if (index != -1 && DataStore.transactionPhotoPaths.getOrNull(index) != null) {
                        Log.d(tag, "Photo found for transaction, opening photo view")
                        val intent = Intent(this, PhotoViewActivity::class.java)
                        intent.putExtra("transaction_id", transactionId)
                        startActivity(intent)
                    } else {
                        Log.d(tag, "No photo attached to this transaction")
                        Toast.makeText(this, "No photo attached to this entry", Toast.LENGTH_SHORT).show()
                    }
                }
                binding.rvTransactions.adapter = adapter
            }
        } catch (e: Exception) {
            Log.e(tag, "Error loading transactions: ${e.message}", e)
            Toast.makeText(this, "Error loading transactions: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}
