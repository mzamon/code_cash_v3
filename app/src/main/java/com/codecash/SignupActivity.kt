package com.codecash

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codecash.data.DataStore
import com.codecash.databinding.ActivitySignupBinding

/**
 * SignupActivity - User registration for CodeCash app.
 * 
 * Features:
 * - Create new user account with email and password
 * - Password validation and confirmation
 * - Duplicate email checking
 * - Comprehensive error handling and logging
 * 
 * References:
 * - Android security best practices: https://developer.android.com/topic/security
 */
class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private val tag = "SignupActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing SignupActivity")
        
        try {
            binding = ActivitySignupBinding.inflate(layoutInflater)
            setContentView(binding.root)
            
            setupUI()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading signup screen", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up signup UI elements")
        
        binding.btnSignup.setOnClickListener {
            Log.d(tag, "Signup button clicked")
            attemptSignup()
        }

        binding.tvLogin.setOnClickListener {
            Log.d(tag, "Login link clicked - returning to login")
            finish()
        }

        binding.btnBack.setOnClickListener {
            Log.d(tag, "Back button clicked")
            finish()
        }
    }

    /**
     * Attempt to create new user account.
     * Validates all inputs before adding to DataStore.
     */
    private fun attemptSignup() {
        Log.d(tag, "attemptSignup: Validating signup form")
        
        try {
            val name = binding.etName.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()

            // Validate name
            if (name.isEmpty()) {
                Log.w(tag, "Validation failed: name is empty")
                binding.tilName.error = "Name required"
                return
            }
            binding.tilName.error = null
            
            // Validate email
            if (email.isEmpty()) {
                Log.w(tag, "Validation failed: email is empty")
                binding.tilEmail.error = "Email required"
                return
            }
            if (!email.contains("@")) {
                Log.w(tag, "Validation failed: invalid email format")
                binding.tilEmail.error = "Invalid email format"
                return
            }
            binding.tilEmail.error = null
            
            // Validate password - STRONG PASSWORD REQUIRED
            if (password.isEmpty()) {
                Log.w(tag, "Validation failed: password is empty")
                binding.tilPassword.error = "Password required"
                return
            }
            
            // Strong password: 8+ chars, 1 capital, 1 special character
            val passValidation = validateStrongPassword(password)
            if (!passValidation.isValid) {
                Log.w(tag, "Validation failed: ${passValidation.message}")
                binding.tilPassword.error = passValidation.message
                return
            }
            binding.tilPassword.error = null
            
            // Validate password confirmation
            if (confirmPassword.isEmpty()) {
                Log.w(tag, "Validation failed: confirm password is empty")
                binding.tilConfirmPassword.error = "Please confirm password"
                return
            }
            
            if (password != confirmPassword) {
                Log.w(tag, "Validation failed: passwords do not match")
                binding.tilConfirmPassword.error = "Passwords do not match"
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                return
            }
            binding.tilConfirmPassword.error = null

            // Check if email already exists
            Log.d(tag, "Checking if email already exists: $email")
            if (DataStore.findUserByEmail(email) != -1) {
                Log.w(tag, "Signup failed: email already registered - $email")
                binding.tilEmail.error = "Email already registered"
                Toast.makeText(this, "Email already exists", Toast.LENGTH_SHORT).show()
                return
            }

            // All validations passed - create account
            Log.d(tag, "All validations passed - creating new account for: $email")
            val userId = DataStore.addUser(name, email, password)
            Log.i(tag, "Account created successfully - userId: $userId, email: $email")
            
            Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show()
            finish()
        } catch (e: Exception) {
            Log.e(tag, "Exception during signup: ${e.message}", e)
            Toast.makeText(this, "An error occurred during signup", Toast.LENGTH_SHORT).show()
        }
    }
    
    /**
     * Validate password meets security requirements:
     * - At least 8 characters
     * - At least 1 capital letter
     * - At least 1 special character (!@#$%^&*)
     */
    private fun validateStrongPassword(password: String): PasswordValidation {
        return when {
            password.length < 8 -> {
                PasswordValidation(false, "Password: min 8 characters")
            }
            !password.any { it.isUpperCase() } -> {
                PasswordValidation(false, "Password: needs 1 capital letter")
            }
            !password.any { it in "!@#$%^&*" } -> {
                PasswordValidation(false, "Password: needs 1 special char (!@#$%^&*)")
            }
            else -> PasswordValidation(true, "")
        }
    }
    
    /**
     * Data class for password validation result
     */
    data class PasswordValidation(val isValid: Boolean, val message: String)
}