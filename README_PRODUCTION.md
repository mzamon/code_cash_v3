# CodeCash - Personal Budget Tracker
**Tagline: Track Every Rand. Reach Every Goal.**

---

## Project Overview

CodeCash is a production-ready Android application designed to help users manage their personal finances effectively. The app enables users to track expenses, set budget goals, view financial analytics, and earn achievement badges through consistent financial management.

**Version:** 2.0 (MVP - Part 3)  
**Target Audience:** Individual users aged 18+  
**Platform:** Android 7.0+ (API 24+)  
**Architecture:** MVVM + Repository Pattern + Room Database

---

## Part 1: Foundation & Basic Features

### Completed in Part 1:
- ✅ User authentication (Login/Registration)
- ✅ Category management (Create/Edit/Delete)
- ✅ Basic transaction recording (Add/Edit/Delete)
- ✅ DataStore implementation for in-memory data persistence
- ✅ UI layout structure with Material Design 3
- ✅ Bottom navigation and drawer navigation
- ✅ Receipt photo capture using CameraX
- ✅ Basic dashboard with financial overview

### Part 1 Feedback Addressed:
- **Feedback:** Comments were excessive and cluttered code  
  **Action:** Reduced comments to only complex logic in Part 2/3
  
- **Feedback:** Tests were minimal and low-quality  
  **Action:** Implemented comprehensive JUnit and Espresso tests in Part 3
  
- **Feedback:** Database integration incomplete  
  **Action:** Fully integrated Room database with proper migrations and DAOs

---

## Part 2: Enhanced Features & Stability

### Completed in Part 2:
- ✅ Room Database integration with 5 core entities
- ✅ Full CRUD operations for all entities via DAOs
- ✅ Budget goal setting with min/max monthly targets
- ✅ Binary search implementation for user lookup optimization
- ✅ Parallel array data structure pattern (as per rubric)
- ✅ Date/time range filtering for transactions
- ✅ Category color customization
- ✅ Income vs. Expense tracking
- ✅ Defensive error handling in all activities

### Part 2 Improvements:
- Enhanced validation to prevent crashes from invalid user input
- Implemented proper error messages and user feedback
- Added logging for debugging and monitoring
- Structured code following clean architecture principles

---

## Part 3: Production MVP Completion

### Part 3 New Features:
- ✅ **Analytics Dashboard** - MPAndroidChart integration with:
  - Daily spending trend line chart
  - Category spending breakdown pie chart
  - User-selectable date ranges
  - Dynamic data updates from Room database

- ✅ **Gamification System** - Achievement badges:
  - Budget Master - Stay within all monthly budget goals
  - Consistent Logger - Log 10+ transactions in a month
  - Saver - Save R500+ in a month
  - Transaction Milestone - Log 50+ transactions total
  - Auto-unlock when conditions are met
  - Stored in Room database

- ✅ **Enhanced Dashboard**:
  - Real-time budget calculation (remaining budget)
  - Overspending alerts and highlights
  - Monthly income vs. expenses comparison
  - Percentage of budget used indicator
  - Visual progress indicators

- ✅ **Settings Screen**:
  - Dark mode toggle with theme persistence
  - Light mode for accessibility
  - Reset application data with confirmation
  - User preferences stored in DataStore

- ✅ **Profile Screen**:
  - User information display
  - Total expenses and categories count
  - Achievements earned count
  - Edit profile functionality
  - Secure logout

---

## Key Changes from Part 1 to Part 3

### Architecture Improvements:
1. **Database Migration**: From pure DataStore to Room + DataStore hybrid (fallback)
   - All persistent data now stored in SQLite via Room
   - DataStore acts as optional cache layer
   - Queries are now database-backed, not memory-dependent

2. **Entity Model Expansion**:
   - User: Added `username` field (required by spec)
   - Transaction: Added `startTime` and `endTime` fields for time tracking
   - Achievement: New entity for gamification system
   - BudgetGoal: Enhanced with proper relationships

3. **DAO Implementation**:
   - UserDao: Added `getUserByUsername()` method
   - TransactionDao: Added date range filtering and photo path updates
   - AchievementDao: New methods for checking and retrieving achievements
   - BudgetGoalDao: Methods for retrieving monthly goals

4. **Feature Completeness**:
   - Part 1: Basic CRUD and authentication
   - Part 2: Full database integration and validation
   - Part 3: Analytics, achievements, advanced filtering, dark mode

### Code Quality Improvements:
- **Comments**: Reduced from 40+ unnecessary comments to only 8 comments for complex logic
- **Testing**: Added 25+ JUnit tests and 12+ Espresso UI tests
- **Error Handling**: Added try-catch blocks in all Activities
- **Null Safety**: Implemented defensive null checks throughout

---

## Features

### User Management
- User registration with strong password validation
- Secure login with email verification
- Duplicate username/email prevention
- User profile management and logout

### Expense Tracking
- Record expenses with amount, description, category, date, and time
- Optional receipt photo capture using CameraX
- View receipt photos in dedicated viewer
- Edit or delete expenses
- Search and filter transactions by category or date range
- View expense history with detailed information

### Category Management
- Create custom expense categories
- Assign colors to categories for visual identification
- Default categories pre-loaded: Groceries, Transport, Rent, Entertainment, Utilities, Shopping
- Prevent duplicate category names
- Edit and delete categories

### Budget Goals
- Set minimum and maximum monthly spending goals
- Set budget limits per category
- Validate that minimum ≤ maximum
- Real-time budget progress tracking
- Alerts for overspending

### Financial Analytics
- Daily spending trend chart (line graph)
- Category spending breakdown chart (pie chart)
- User-selectable date ranges
- Month-to-month comparison
- Dynamic calculations from actual database records

### Gamification & Achievements
- Automatic badge unlocking based on financial milestones
- 4+ achievement types (Budget, Consistency, Saver, Milestone)
- Achievement tracking and history
- Progress indicators for nearly-completed achievements

### Dashboard & Reports
- Real-time financial overview
- Balance calculation with month-to-month change percentage
- Income and expenses breakdown
- Recent transactions display
- Budget utilization percentage

### Settings & Preferences
- Dark mode / Light mode toggle
- Theme persistence across sessions
- Reset application data (with confirmation)
- User-friendly settings interface

---

## Technology Stack

### Core Framework
- **Language**: Kotlin 100%
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 35 (Android 15)
- **Compilation Target**: Java 17

### Architecture
- **Pattern**: MVVM (Model-View-ViewModel)
- **Database**: Room 2.6.1
- **Dependency Injection**: Manual (no DI framework for simplicity)
- **Concurrency**: Coroutines with StateFlow
- **View Binding**: ViewBinding for all Activities

### UI Components
- **Design System**: Material Design 3
- **Navigation**: Bottom Navigation + Navigation Drawer
- **Layouts**: ConstraintLayout, RecyclerView, NestedScrollView
- **Charts**: MPAndroidChart 3.1.0
- **Image**: CameraX for camera, Glide for image loading (optional)

### Storage & Data
- **Local Database**: SQLite via Room ORM
- **Preferences**: DataStore (proto-buf based)
- **File Storage**: FileProvider for secure file sharing

### Testing
- **Unit Tests**: JUnit 4.13.2
- **UI Tests**: Espresso 3.6.1
- **Mocking**: Mockito 5.3.1

### Build & Deploy
- **Build System**: Gradle Kotlin DSL (build.gradle.kts)
- **CI/CD**: GitHub Actions
- **Artifact**: Debug APK generation on every push to main

---

## Installation & Setup

### Prerequisites
- Android Studio (latest stable version)
- Android SDK 24+ 
- Java/Kotlin development environment

### Build Instructions

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd code_cash_v3
   ```

2. **Build the application**:
   ```bash
   ./gradlew build
   ```

3. **Install on device/emulator**:
   ```bash
   ./gradlew installDebug
   ```

4. **Run from Android Studio**:
   - Open the project in Android Studio
   - Click "Run 'app'" or press Shift+F10
   - Select device or create emulator

### Gradle Commands

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run unit tests
./gradlew test

# Run instrumented tests (Espresso)
./gradlew connectedAndroidTest

# Build and run all tests
./gradlew build connectedAndroidTest

# Clean build artifacts
./gradlew clean
```

---

## Testing Guide

### Unit Tests (JUnit)

Tests located in `app/src/test/java/com/codecash/`

#### Test Coverage:
- **Authentication Tests**: Valid/invalid login, empty credentials
- **Registration Tests**: Successful signup, duplicate username prevention, email validation
- **Category Tests**: Create, edit, delete categories with duplicate prevention
- **Transaction Tests**: Create, edit, delete with validation
- **Budget Tests**: Remaining budget calculation, percentage calculation, overspending detection
- **Achievement Tests**: Unlock conditions, badge tracking, progress calculation

#### Running Unit Tests:
```bash
./gradlew test

# Run specific test class
./gradlew test --tests com.codecash.data.LoginTest

# Run with verbose output
./gradlew test --info
```

### UI Tests (Espresso)

Tests located in `app/src/androidTest/java/com/codecash/`

#### Test Coverage:
- **Login Flow**: Navigate to login, enter credentials, verify dashboard appears
- **Registration Flow**: Complete signup form, verify user creation
- **Add Expense Flow**: Add new expense, verify in recent list
- **Navigation Flow**: Test all bottom navigation transitions
- **Category Management**: Create and delete categories via UI
- **Expense Details**: View, edit, delete expenses from list

#### Running UI Tests:
```bash
# Run on connected device or emulator
./gradlew connectedAndroidTest

# Run specific test class
./gradlew connectedAndroidTest --tests com.codecash.LoginActivityTest

# Run with verbose output
./gradlew connectedAndroidTest --info
```

### Test Results
- **Total Unit Tests**: 25+
- **Total UI Tests**: 12+
- **Target Coverage**: 80%+ of critical paths
- **CI/CD Status**: All tests must pass before merge to main

---

## GitHub Actions CI/CD

### Workflow Configuration

**File**: `.github/workflows/android-build.yml`

### Workflow Steps:
1. Checkout code from repository
2. Set up JDK 17 environment
3. Configure Gradle caching for faster builds
4. Run all unit tests (JUnit)
5. Build debug APK
6. Upload APK as artifact
7. Report build status

### Trigger Conditions:
- Runs on every push to `main` branch
- Runs on pull requests to `main` branch

### Build Artifacts:
- Debug APK available in GitHub Actions artifacts
- Named: `app-debug.apk`
- Retention: 90 days (default GitHub policy)

### Sample Workflow File:
```yaml
name: Android Build

on:
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v3
    
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
    
    - name: Run unit tests
      run: ./gradlew test
    
    - name: Build debug APK
      run: ./gradlew assembleDebug
    
    - name: Upload APK
      uses: actions/upload-artifact@v3
      with:
        name: app-debug
        path: app/build/outputs/apk/debug/app-debug.apk
```

---

## Project Structure

```
code_cash_v3/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/codecash/
│   │   │   │   ├── data/                    # Room entities, DAOs, database, DataStore
│   │   │   │   │   ├── Entities.kt
│   │   │   │   │   ├── Daos.kt
│   │   │   │   │   ├── AppDatabase.kt
│   │   │   │   │   ├── DataStore.kt
│   │   │   │   │   ├── User.kt
│   │   │   │   │   ├── Category.kt
│   │   │   │   │   ├── Transaction.kt
│   │   │   │   │   ├── BudgetGoal.kt
│   │   │   │   │   └── Achievement.kt
│   │   │   │   ├── adapters/                # RecyclerView adapters
│   │   │   │   │   ├── TransactionAdapter.kt
│   │   │   │   │   ├── CategoryAdapter.kt
│   │   │   │   │   └── AchievementAdapter.kt
│   │   │   │   ├── utils/                   # Utility functions
│   │   │   │   │   ├── NavigationHelper.kt
│   │   │   │   │   └── ImageUtils.kt
│   │   │   │   ├── LoginActivity.kt         # Authentication screens
│   │   │   │   ├── SignupActivity.kt
│   │   │   │   ├── SplashActivity.kt
│   │   │   │   ├── DashboardActivity.kt     # Main screens
│   │   │   │   ├── AddTransactionActivity.kt
│   │   │   │   ├── TransactionListActivity.kt
│   │   │   │   ├── CategoryActivity.kt
│   │   │   │   ├── BudgetGoalsActivity.kt
│   │   │   │   ├── StatsActivity.kt         # Analytics screen
│   │   │   │   ├── AchievementsActivity.kt  # Gamification screen
│   │   │   │   ├── SettingsActivity.kt      # Settings & preferences
│   │   │   │   ├── PhotoViewActivity.kt     # Receipt viewer
│   │   │   │   ├── ChatbotActivity.kt       # AI assistance
│   │   │   │   └── CodeCashApp.kt           # Application class
│   │   │   ├── res/
│   │   │   │   ├── layout/                  # XML layouts for all screens
│   │   │   │   ├── drawable/                # Vector drawables and icons
│   │   │   │   ├── values/                  # Colors, strings, themes
│   │   │   │   ├── values-night/            # Night mode themes
│   │   │   │   ├── menu/                    # Menu configurations
│   │   │   │   └── xml/                     # Configuration files
│   │   │   └── AndroidManifest.xml
│   │   ├── test/java/com/codecash/          # Unit tests
│   │   │   ├── data/
│   │   │   │   ├── LoginTest.kt
│   │   │   │   ├── RegistrationTest.kt
│   │   │   │   ├── CategoryTest.kt
│   │   │   │   ├── ExpenseTest.kt
│   │   │   │   ├── BudgetTest.kt
│   │   │   │   └── AchievementTest.kt
│   │   │   └── ...
│   │   └── androidTest/java/com/codecash/  # UI tests
│   │       ├── LoginActivityTest.kt
│   │       ├── DashboardActivityTest.kt
│   │       ├── AddExpenseActivityTest.kt
│   │       └── ...
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── .github/
│   └── workflows/
│       └── android-build.yml                # GitHub Actions CI/CD
├── build.gradle.kts                         # Root build configuration
├── settings.gradle.kts                      # Project settings
├── gradle.properties                        # Gradle properties
├── gradlew                                  # Gradle wrapper (Unix)
├── gradlew.bat                              # Gradle wrapper (Windows)
└── README_PRODUCTION.md                     # This file
```

---

## Database Schema

### Entities (Room)

#### UserEntity
```kotlin
@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val fullName: String,
    val username: String,
    val email: String,
    val password: String,
    val biometricEnabled: Boolean = false,
    val createdDate: Long = System.currentTimeMillis()
)
```

#### CategoryEntity
```kotlin
@Entity(tableName = "categories")
data class Category(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val colorHex: String = "#2dd4bf",
    val minBudget: Double = 0.0,
    val maxBudget: Double = 0.0,
    val iconName: String = "default"
)
```

#### TransactionEntity
```kotlin
@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: Int,
    val amount: Double,
    val description: String,
    val categoryId: Int,
    val date: Long,
    val startTime: Long = 0L,
    val endTime: Long = 0L,
    val photoPath: String? = null,
    val isIncome: Boolean = false
)
```

#### BudgetGoalEntity
```kotlin
@Entity(tableName = "budget_goals")
data class BudgetGoal(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: Int,
    val categoryId: Int,
    val minAmount: Double,
    val maxAmount: Double,
    val monthYear: String
)
```

#### AchievementEntity
```kotlin
@Entity(tableName = "achievements")
data class Achievement(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: Int,
    val title: String,
    val description: String,
    val unlockedDate: Long,
    val category: String
)
```

---

## API Reference

### Key DAOs

#### UserDao
- `getUserByEmail(email: String): User?`
- `getUserByUsername(username: String): User?`
- `getUserById(id: Int): User?`
- `insert(user: User): Long`
- `update(user: User)`
- `deleteById(id: Int)`

#### TransactionDao
- `getForPeriod(userId: Int, start: Long, end: Long): List<Transaction>`
- `getForUser(userId: Int): List<Transaction>`
- `getById(id: Int): Transaction?`
- `insert(transaction: Transaction): Long`
- `update(transaction: Transaction)`
- `updatePhotoPath(id: Int, path: String?)`
- `deleteById(id: Int)`

#### AchievementDao
- `getForUser(userId: Int): List<Achievement>`
- `hasAchievement(userId: Int, title: String): Boolean`
- `insert(achievement: Achievement): Long`

---

## Troubleshooting

### Common Issues

**Issue**: App crashes on launch
- **Solution**: Ensure Room database initializes properly. Check `AppDatabase.getDatabase(context)` is called in Application.onCreate()

**Issue**: Login always fails
- **Solution**: Verify email and password are not empty. Check DataStore/Room for test user data.

**Issue**: Photos not appearing in transactions
- **Solution**: Verify CameraX permissions are granted. Check FileProvider configuration in AndroidManifest.xml

**Issue**: Analytics graphs show no data
- **Solution**: Ensure transactions exist for the selected date range. Check Room database has transaction records.

**Issue**: Achievements not unlocking
- **Solution**: Call `DataStore.checkAndUnlockAchievements(userId)` after each transaction. Verify conditions are met.

### Debug Tips
- Enable verbose logging: `adb logcat | grep CodeCash`
- Use Android Studio's Database Inspector to view Room tables
- Check `logcat` for exceptions and stack traces

---

## Deployment

### Release Build

1. **Generate signed APK**:
   ```bash
   ./gradlew assembleRelease
   ```

2. **Output location**: `app/build/outputs/apk/release/app-release.apk`

3. **Sign and align**:
   - Use Android Studio's "Build > Generate Signed Bundle / APK"
   - Select Release build variant
   - Provide keystore credentials
   - Generate APK

4. **Upload to Play Store** (optional):
   - Go to Google Play Console
   - Create new app entry
   - Upload signed APK
   - Fill metadata and screenshots
   - Submit for review

---

## Author & Contributors

**Project**: CodeCash - OPSC6311 Final POE  
**Submission Date**: June 2026  
**Team Members**:
- Tshiamo Keefelakae Lentswe (st10448558@codecash.com)
- Yinhla Maringa (st10441743@codecash.com)
- Matshidiso Nthebe (st10449727@codecash.com)
- Mzamo Richmond Ndlovu (st10455453@codecash.com)

---

## License

This project is developed as part of OPSC6311 assessment and is subject to institutional policies.

---

## References & Resources

### Android Development
- [Android Developer Documentation](https://developer.android.com)
- [Kotlin Official Documentation](https://kotlinlang.org/docs)
- [Room Database Guide](https://developer.android.com/training/data-storage/room)
- [Material Design 3](https://m3.material.io)

### Libraries & Tools
- [Jetpack Architecture Components](https://developer.android.com/jetpack)
- [MPAndroidChart Documentation](https://github.com/PhilJay/MPAndroidChart)
- [CameraX Developer Guide](https://developer.android.com/training/camerax)
- [Espresso Testing Framework](https://developer.android.com/training/testing/espresso)

### Best Practices
- [Android Security Best Practices](https://developer.android.com/topic/security)
- [Clean Architecture Principles](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
- [MVVM Pattern Guide](https://developer.android.com/jetpack/guide)

---

**Last Updated**: June 15, 2026  
**Status**: Production Ready - MVP Complete
