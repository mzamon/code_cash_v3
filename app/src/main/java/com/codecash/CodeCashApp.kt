package com.codecash

import android.app.Application
import android.util.Log
import com.codecash.data.AppDatabase

class CodeCashApp : Application() {
    override fun onCreate() {
        super.onCreate()
        try {
            AppDatabase.getDatabase(this)
            Log.d("CodeCashApp", "Database initialized successfully")
        } catch (e: Exception) {
            Log.e("CodeCashApp", "Failed to initialize database: ${e.message}", e)
        }
    }
}
