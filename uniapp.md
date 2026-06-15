////////////////////////////////////////////////////////////
// FILE: build.gradle.kts (Project)
////////////////////////////////////////////////////////////
plugins {
    id("com.android.application") version "8.8.0" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
}

////////////////////////////////////////////////////////////
// FILE: app/build.gradle.kts (Module)
////////////////////////////////////////////////////////////
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.codecash"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.codecash"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "2.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    testImplementation("junit:junit:4.13.2")
}

////////////////////////////////////////////////////////////
// FILE: app/src/main/AndroidManifest.xml
////////////////////////////////////////////////////////////
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" android:maxSdkVersion="32" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" android:maxSdkVersion="32" />
    <application
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:theme="@style/Theme.CodeCash">
        <activity android:name=".SplashActivity" android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".LoginActivity" />
        <activity android:name=".SignupActivity" />
        <activity android:name=".DashboardActivity" />
        <activity android:name=".AddTransactionActivity" />
        <activity android:name=".TransactionListActivity" />
        <activity android:name=".StatsActivity" />
        <activity android:name=".BudgetGoalsActivity" />
        <activity android:name=".AchievementsActivity" />
        <activity android:name=".PhotoViewActivity" />
        <provider
            android:name="androidx.core.content.FileProvider"
            android:authorities="${applicationId}.fileprovider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data android:name="android.support.FILE_PROVIDER_PATHS" android:resource="@xml/file_paths" />
        </provider>
    </application>
</manifest>

////////////////////////////////////////////////////////////
// FILE: data/DataStore.kt
////////////////////////////////////////////////////////////
package com.codecash.data

import java.util.*
import java.text.SimpleDateFormat

object DataStore {
    var currentUserId: Int = -1

    // Parallel Arrays (OPSC Standard)
    val userIds = ArrayList<Int>(); val userNames = ArrayList<String>(); val userEmails = ArrayList<String>(); val userPasswords = ArrayList<String>()
    val transactionIds = ArrayList<Int>(); val transactionAmounts = ArrayList<Double>(); val transactionDates = ArrayList<Long>()
    val transactionUserIds = ArrayList<Int>(); val transactionCategoryIds = ArrayList<Int>(); val transactionPhotoPaths = ArrayList<String?>()
    val transactionIsIncome = ArrayList<Boolean>()
    val categoryIds = ArrayList<Int>(); val categoryNames = ArrayList<String>(); val categoryColors = ArrayList<String>()
    val budgetGoalMaxAmounts = ArrayList<Double>(); val budgetGoalMonthYears = ArrayList<String>(); val budgetGoalUserIds = ArrayList<Int>(); val budgetGoalCategoryIds = ArrayList<Int>()
    val achievementTitles = ArrayList<String>(); val achievementUserIds = ArrayList<Int>()

    private var nextU = 1; private var nextC = 1; private var nextT = 1; private var nextG = 1

    init {
        addUser("Admin", "admin@codecash.com", "Password123")
        addCategory("Groceries", "#22c55e"); addCategory("Transport", "#3b82f6"); addCategory("Rent", "#a855f7")
    }

    fun addUser(n: String, e: String, p: String): Int {
        userIds.add(nextU); userNames.add(n); userEmails.add(e); userPasswords.add(p); return nextU++
    }

    fun findUserByEmail(email: String): Int {
        val sorted = userEmails.indices.sortedBy { userEmails[it].lowercase() }
        var low = 0; var high = sorted.size - 1
        while (low <= high) {
            val mid = (low + high) / 2
            val midVal = userEmails[sorted[mid]].lowercase()
            if (midVal == email.lowercase()) return userIds[sorted[mid]]
            if (midVal < email.lowercase()) low = mid + 1 else high = mid - 1
        }
        return -1
    }

    fun validateLogin(e: String, p: String): Int {
        val id = findUserByEmail(e)
        if (id != -1 && userPasswords[userIds.indexOf(id)] == p) { currentUserId = id; return id }
        return -1
    }

    fun addTransaction(uId: Int, amt: Double, desc: String, cat: Int, date: Long, photo: String?, inc: Boolean) {
        transactionIds.add(nextT++); transactionUserIds.add(uId); transactionAmounts.add(amt)
        transactionDates.add(date); transactionCategoryIds.add(cat); transactionPhotoPaths.add(photo); transactionIsIncome.add(inc)
    }

    fun getTransactionsForPeriod(uId: Int, start: Long, end: Long): List<Int> {
        val filtered = ArrayList<Int>()
        for (i in transactionUserIds.indices) if (transactionUserIds[i] == uId && transactionDates[i] in start..end) filtered.add(transactionIds[i])
        for (i in 0 until filtered.size - 1) for (j in 0 until filtered.size - i - 1)
            if (transactionDates[transactionIds.indexOf(filtered[j])] < transactionDates[transactionIds.indexOf(filtered[j+1])]) {
                val temp = filtered[j]; filtered[j] = filtered[j+1]; filtered[j+1] = temp
            }
        return filtered
    }

    fun addCategory(n: String, c: String = "#2dd4bf") {
        categoryIds.add(nextC++); categoryNames.add(n); categoryColors.add(c)
    }

    fun getIncomeTotal(uId: Int, s: Long, e: Long): Double = sum(uId, s, e, true)
    fun getExpenseTotal(uId: Int, s: Long, e: Long): Double = sum(uId, s, e, false)
    private fun sum(uId: Int, s: Long, e: Long, inc: Boolean): Double {
        var t = 0.0
        for (i in transactionUserIds.indices) if (transactionUserIds[i] == uId && transactionDates[i] in s..e && transactionIsIncome[i] == inc) t += transactionAmounts[i]
        return t
    }

    fun getMonthStartEnd(my: String): Pair<Long, Long> {
        val p = my.split("-"); val cal = Calendar.getInstance()
        cal.set(p[1].toInt(), p[0].toInt() - 1, 1, 0, 0, 0); val s = cal.timeInMillis
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH)); return Pair(s, cal.timeInMillis)
    }
}

////////////////////////////////////////////////////////////
// FILE: DashboardActivity.kt
////////////////////////////////////////////////////////////
package com.codecash
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityDashboardBinding
import com.codecash.utils.NavigationHelper

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAddTransaction.setOnClickListener { startActivity(Intent(this, AddTransactionActivity::class.java)) }
        binding.rvRecentTransactions.layoutManager = LinearLayoutManager(this)
        NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_home)
    }
    override fun onResume() {
        super.onResume()
        val uId = DataStore.currentUserId
        val (s, e) = DataStore.getMonthStartEnd(SimpleDateFormat("MM-yyyy", Locale.getDefault()).format(Date()))
        binding.tvBalance.text = "R${"%.2f".format(DataStore.getIncomeTotal(uId, s, e) - DataStore.getExpenseTotal(uId, s, e))}"
        val recent = DataStore.getTransactionsForPeriod(uId, 0, Long.MAX_VALUE).take(5)
        binding.rvRecentTransactions.adapter = TransactionAdapter(recent) { id ->
            if (DataStore.transactionPhotoPaths[DataStore.transactionIds.indexOf(id)] != null)
                startActivity(Intent(this, PhotoViewActivity::class.java).putExtra("transaction_id", id))
        }
    }
}

////////////////////////////////////////////////////////////
// FILE: res/values/colors.xml
////////////////////////////////////////////////////////////
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="navy_dark">#0f172a</color>
    <color name="navy_primary">#1e293b</color>
    <color name="teal_primary">#2dd4bf</color>
    <color name="white">#ffffff</color>
    <color name="red_error">#ef4444</color>
    <color name="green_success">#22c55e</color>
</resources>
