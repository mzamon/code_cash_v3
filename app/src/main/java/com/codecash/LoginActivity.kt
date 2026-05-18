package com.codecash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityLoginBinding

/**
 * LoginActivity - Handles user authentication for CodeCash app.
 * 
 * Features:
 * - Secure login with email and password validation
 * - Error handling for invalid credentials
 * - Navigation to signup for new users
 * - Comprehensive logging for debugging
 * 
 * References:
 * - Android security best practices: https://developer.android.com/topic/security
 * - Input validation patterns in Kotlin
 */
class LoginActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityLoginBinding
    private val tag = "LoginActivity"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing LoginActivity")
        
        try {
            binding = ActivityLoginBinding.inflate(layoutInflater)
            setContentView(binding.root)
            
            setupUI()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading login screen", Toast.LENGTH_SHORT).show()
        }
    }
    
    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up login UI elements")
        
        binding.btnLogin.setOnClickListener {
            Log.d(tag, "Login button clicked")
            attemptLogin()
        }
        
        binding.tvSignup.setOnClickListener {
            Log.d(tag, "Signup link clicked - navigating to SignupActivity")
            startActivity(Intent(this, SignupActivity::class.java))
        }
        
        binding.tvForgotPassword.setOnClickListener {
            Log.d(tag, "Forgot password clicked")
            Toast.makeText(this, "Contact support to reset password", Toast.LENGTH_SHORT).show()
        }
    }
    
    /**
     * Attempt to log in user with provided email and password.
     * Validates input and checks against DataStore.
     */
    private fun attemptLogin() {
        Log.d(tag, "attemptLogin: Validating credentials")
        
        try {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            
            // Validate email input
            if (email.isEmpty()) {
                Log.w(tag, "Validation failed: email is empty")
                binding.tilEmail.error = "Email required"
                return
            }
            binding.tilEmail.error = null
            
            // Validate password input
            if (password.isEmpty()) {
                Log.w(tag, "Validation failed: password is empty")
                binding.tilPassword.error = "Password required"
                return
            }
            binding.tilPassword.error = null
            
            Log.d(tag, "Validation passed - attempting authentication for: $email")
            
            // Attempt login
            val userId = DataStore.validateLogin(email, password)
            
            if (userId != -1) {
                Log.i(tag, "Login successful for userId: $userId")
                Toast.makeText(this, "Welcome back!", Toast.LENGTH_SHORT).show()
                
                // Navigate to dashboard
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            } else {
                Log.w(tag, "Login failed: Invalid credentials for email: $email")
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Log.e(tag, "Exception during login attempt: ${e.message}", e)
            Toast.makeText(this, "An error occurred during login", Toast.LENGTH_SHORT).show()
        }
    }
}