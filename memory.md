# CodeCash Project Memory

This is the memory file of the app to track project state, memory, and save credits.

## Project Overview
- **Project Name:** CodeCash
- **Goal:** Personal finance and budget tracking application with gamification (Part 3).
- **Architecture:** Android with Kotlin, View Binding, Parallel Arrays for Data Storage (`DataStore.kt`).

## Key Fixes & Changes

### 1. Navigation & UI Fixes
- **AchievementsActivity:** Fixed `Unresolved reference 'bottomNav'` by defining the `BottomNavigationView` ID directly in `activity_achievements.xml`.
- **Bottom Navigation Setup:** Standardized `NavigationHelper.setupBottomNavigation()` calls across all activities.

### 2. Critical Stability Fixes
- **Bitmap Drawing Crash:** Fixed `java.lang.RuntimeException: Canvas: trying to draw too large bitmap` by replacing the oversized `logo.png` with a vector-based `logo_splash.xml` in `logo_rounded.xml`.
- **App Icons:** Updated `AndroidManifest.xml` and adaptive icon definitions to use the unified `logo_rounded` drawable.

### 3. Feature Implementations
- **ChatbotEngine:** Implemented `ChatbotEngine.kt` with 50+ responses using parallel arrays for keyword matching.
- **ChatbotActivity:** Integrated with `ChatbotEngine` for keyword-based financial guidance.
- **Achievements:** Verified `AchievementsActivity` loads data correctly from `DataStore`.

## Current Status
- **Splash Screen:** Navigates to `LoginActivity` after 2.5s.
- **Authentication:** `DataStore` contains seed users for testing (e.g., `admin@codecash.com`).
- **Chatbot:** Accessible and functional with keyword-based responses.

## Pending Tasks / To-Do
- [ ] Add a Floating Action Button or Menu item to launch the Chatbot from the Dashboard.
- [ ] Verify `TransactionAdapter` and `AchievementAdapter` are correctly implemented.
- [ ] Perform a full end-to-end test of the budget tracking flow.
