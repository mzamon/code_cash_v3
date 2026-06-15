package com.codecash.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Environment
import android.util.Log
import com.codecash.data.DataStore
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Custom Feature Note: Files are named {Username}_{dd}_{MM}_{yyyy}_{HH}_{mm}.jpg
 * This makes each photo uniquely identifiable, traceable to its owner, and sortable.
 * Storage: app-private external directory — no storage permission required on API 29+.
 */
object ImageUtils {

    private const val TAG = "ImageUtils"

    @Throws(IOException::class)
    fun createImageFile(context: Context): File {
        val rawName = DataStore.getCurrentUserName()
        val username = rawName
            .replace(" ", "")
            .replace(Regex("[^a-zA-Z0-9]"), "")
            .take(20)
            .ifEmpty { "User" }

        val timestamp = SimpleDateFormat("dd_MM_yyyy_HH_mm", Locale.getDefault()).format(Date())
        val fileName = "${username}_${timestamp}"

        // App-private directory — scoped storage safe, no WRITE_EXTERNAL_STORAGE needed
        val storageDir: File = File(
            context.getExternalFilesDir(Environment.DIRECTORY_PICTURES),
            "CodeCash"
        ).also { if (!it.exists()) it.mkdirs() }

        return File.createTempFile(fileName, ".jpg", storageDir)
    }

    fun loadPhoto(path: String?): Bitmap? {
        if (path == null) return null
        return try {
            val file = File(path)
            if (!file.exists()) return null
            val opts = BitmapFactory.Options().apply { inJustDecodeBounds = true }
            BitmapFactory.decodeFile(path, opts)
            opts.inSampleSize = calcSampleSize(opts, 1024, 1024)
            opts.inJustDecodeBounds = false
            BitmapFactory.decodeFile(path, opts)
        } catch (e: Exception) {
            Log.e(TAG, "loadPhoto failed: ${e.message}")
            null
        }
    }

    fun deletePhoto(path: String?) {
        path?.let { try { File(it).delete() } catch (e: Exception) { /* ignore */ } }
    }

    private fun calcSampleSize(opts: BitmapFactory.Options, rW: Int, rH: Int): Int {
        var s = 1
        if (opts.outHeight > rH || opts.outWidth > rW) {
            val hH = opts.outHeight / 2; val hW = opts.outWidth / 2
            while (hH / s >= rH && hW / s >= rW) s *= 2
        }
        return s
    }
}