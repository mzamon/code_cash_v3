package com.example.code_cash_v3

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Duplicate/legacy instrumented test renamed to avoid class name collision.
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTestDuplicate {
    @Test
    fun useAppContextDuplicate() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.code_cash_v3", appContext.packageName)
    }
}
