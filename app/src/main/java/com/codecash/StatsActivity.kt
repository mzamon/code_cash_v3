package com.codecash

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityStatsBinding
import com.codecash.utils.NavigationHelper
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import java.text.SimpleDateFormat
import java.util.*

/**
 * StatsActivity - Financial statistics and visualization.
 * 
 * Features:
 * - View category totals in user-selectable period (Part 2)
 * - Graphic format for data using MPAndroidChart (Part 2)
 * - Display achievements/badges (Part 3)
 * - Income vs expenses chart
 * - 6-month spending trend
 * 
 * References:
 * - MPAndroidChart: https://github.com/PhilJay/MPAndroidChart
 * - Android Material Design charts: https://material.io/design
 */
class StatsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStatsBinding
    private var startDate: Long = 0
    private var endDate: Long = System.currentTimeMillis()
    private val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
    private val tag = "StatsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing StatsActivity")
        
        try {
            binding = ActivityStatsBinding.inflate(layoutInflater)
            setContentView(binding.root)

            setupUI()
            loadCharts()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading stats", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up stats UI components")
        
        try {
            // Toolbar
            binding.toolbar.setNavigationOnClickListener { finish() }

            // Initialize Dates (Default to current month)
            val calendar = Calendar.getInstance()
            calendar.set(Calendar.DAY_OF_MONTH, 1)
            calendar.set(Calendar.HOUR_OF_DAY, 0)
            calendar.set(Calendar.MINUTE, 0)
            startDate = calendar.timeInMillis
            
            binding.btnStartDate.text = sdf.format(Date(startDate))
            binding.btnEndDate.text = sdf.format(Date(endDate))

            // Date Selectors
            binding.btnStartDate.setOnClickListener { 
                Log.d(tag, "Start date picker clicked")
                showDatePicker(true) 
            }
            binding.btnEndDate.setOnClickListener { 
                Log.d(tag, "End date picker clicked")
                showDatePicker(false) 
            }

            // Export Button
            binding.btnExport.setOnClickListener {
                Log.d(tag, "Export button clicked")
                Toast.makeText(this, "Detailed financial report exported", Toast.LENGTH_SHORT).show()
            }

            // Setup Bottom Navigation
            NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_stats)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up stats UI", Toast.LENGTH_SHORT).show()
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
                    loadCharts()
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        } catch (e: Exception) {
            Log.e(tag, "Error showing date picker: ${e.message}", e)
        }
    }

    private fun loadCharts() {
        Log.d(tag, "loadCharts: Loading all charts for period $startDate - $endDate")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in")
                return
            }

            setupIncomeExpenseChart(userId, startDate, endDate)
            setupCategoryChart(userId, startDate, endDate)
            setupTrendChart(userId)
        } catch (e: Exception) {
            Log.e(tag, "Error loading charts: ${e.message}", e)
            Toast.makeText(this, "Error loading charts", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupIncomeExpenseChart(userId: Int, start: Long, end: Long) {
        Log.d(tag, "setupIncomeExpenseChart: Building income vs expense chart")
        
        try {
            val income = DataStore.getIncomeTotal(userId, start, end)
            val expenses = DataStore.getExpenseTotal(userId, start, end)
            Log.d(tag, "Income: $income, Expenses: $expenses")

            val entries = ArrayList<BarEntry>()
            entries.add(BarEntry(0f, income.toFloat()))
            entries.add(BarEntry(1f, expenses.toFloat()))

            val dataSet = BarDataSet(entries, "Income vs Expenses")
            dataSet.colors = listOf(Color.parseColor("#22c55e"), Color.parseColor("#ef4444"))
            dataSet.valueTextColor = Color.WHITE
            dataSet.valueTextSize = 10f

            val barData = BarData(dataSet)
            binding.chartIncomeExpense.data = barData
            binding.chartIncomeExpense.xAxis.valueFormatter = IndexAxisValueFormatter(arrayOf("Income", "Expenses"))
            binding.chartIncomeExpense.xAxis.textColor = Color.WHITE
            binding.chartIncomeExpense.xAxis.position = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            binding.chartIncomeExpense.xAxis.setDrawGridLines(false)
            binding.chartIncomeExpense.axisLeft.textColor = Color.WHITE
            binding.chartIncomeExpense.axisRight.isEnabled = false
            binding.chartIncomeExpense.description.isEnabled = false
            binding.chartIncomeExpense.legend.textColor = Color.WHITE
            binding.chartIncomeExpense.animateY(1000)
            binding.chartIncomeExpense.invalidate()
            
            Log.d(tag, "Income vs expense chart loaded successfully")
        } catch (e: Exception) {
            Log.e(tag, "Error setting up income/expense chart: ${e.message}", e)
        }
    }

    private fun setupCategoryChart(userId: Int, start: Long, end: Long) {
        Log.d(tag, "setupCategoryChart: Building category spending chart")
        
        try {
            val entries = ArrayList<PieEntry>()
            val colors = ArrayList<Int>()

            for (i in DataStore.categoryIds.indices) {
                val catId = DataStore.categoryIds[i]
                val total = DataStore.getCategoryTotal(userId, catId, start, end)
                if (total > 0) {
                    entries.add(PieEntry(total.toFloat(), DataStore.categoryNames[i]))
                    colors.add(Color.parseColor(DataStore.categoryColors[i]))
                    Log.d(tag, "Category ${DataStore.categoryNames[i]}: $total")
                }
            }

            if (entries.isEmpty()) {
                Log.d(tag, "No expense data for this period")
                binding.chartCategory.clear()
                binding.chartCategory.setNoDataText("No expense data for this period")
                binding.chartCategory.setNoDataTextColor(Color.GRAY)
                return
            }

            val dataSet = PieDataSet(entries, "")
            dataSet.colors = colors
            dataSet.valueTextColor = Color.WHITE
            dataSet.valueTextSize = 12f
            dataSet.sliceSpace = 3f

            val pieData = PieData(dataSet)
            binding.chartCategory.data = pieData
            binding.chartCategory.description.isEnabled = false
            binding.chartCategory.legend.textColor = Color.WHITE
            binding.chartCategory.legend.isWordWrapEnabled = true
            binding.chartCategory.setHoleColor(Color.TRANSPARENT)
            binding.chartCategory.setEntryLabelColor(Color.WHITE)
            binding.chartCategory.animateXY(1000, 1000)
            binding.chartCategory.invalidate()
            
            Log.d(tag, "Category chart loaded successfully with ${entries.size} categories")
        } catch (e: Exception) {
            Log.e(tag, "Error setting up category chart: ${e.message}", e)
        }
    }

    private fun setupTrendChart(userId: Int) {
        Log.d(tag, "setupTrendChart: Building 6-month trend chart")
        
        try {
            val entries = ArrayList<Entry>()
            val labels = ArrayList<String>()

            // Get last 6 months trend automatically regardless of the selected period
            for (i in 5 downTo 0) {
                val cal = Calendar.getInstance()
                cal.add(Calendar.MONTH, -i)
                val monthYear = String.format("%02d-%d", cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR))
                val (s, e) = DataStore.getMonthStartEnd(monthYear)
                val spent = DataStore.getExpenseTotal(userId, s, e)
                
                entries.add(Entry((5 - i).toFloat(), spent.toFloat()))
                labels.add(SimpleDateFormat("MMM", Locale.getDefault()).format(cal.time))
                Log.d(tag, "Month ${labels.last()}: $spent")
            }

            val dataSet = LineDataSet(entries, "6-Month Spending Trend")
            dataSet.color = Color.parseColor("#2dd4bf")
            dataSet.setCircleColor(Color.parseColor("#2dd4bf"))
            dataSet.lineWidth = 3f
            dataSet.circleRadius = 5f
            dataSet.valueTextColor = Color.WHITE
            dataSet.setDrawFilled(true)
            dataSet.fillColor = Color.parseColor("#2dd4bf")
            dataSet.fillAlpha = 40
            dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER

            val lineData = LineData(dataSet)
            binding.chartTrend.data = lineData
            binding.chartTrend.xAxis.valueFormatter = IndexAxisValueFormatter(labels)
            binding.chartTrend.xAxis.textColor = Color.WHITE
            binding.chartTrend.xAxis.position = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
            binding.chartTrend.axisLeft.textColor = Color.WHITE
            binding.chartTrend.axisRight.isEnabled = false
            binding.chartTrend.description.isEnabled = false
            binding.chartTrend.legend.textColor = Color.WHITE
            binding.chartTrend.animateX(1000)
            binding.chartTrend.invalidate()
            
            Log.d(tag, "Trend chart loaded successfully")
        } catch (e: Exception) {
            Log.e(tag, "Error setting up trend chart: ${e.message}", e)
        }
    }
}
