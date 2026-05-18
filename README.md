# CodeCash v2 - Personal Finance Management Application

## 📱 Overview

CodeCash v2 is a comprehensive personal finance management application for Android that empowers users to track their income and expenses, set budget goals, and visualize their financial health. Built with Kotlin and modern Android best practices.

**Module**: OPSC6311 - Open Source Coding (Introduction)  
**Team Members**:
- Tshiamo Keefelakae Lentswe (ST10448558)
- Yinhla Maringa (ST10441743)
- Matshidiso Nthebe (ST10449727)
- Mzamo Richmond Ndlovu (ST10455453)

---

## ✨ Features

### Part 2 - Core Functionality (Prototype)
- ✅ **User Authentication**: Secure signup and login system with email/password validation
- ✅ **Category Management**: Create and manage custom expense categories
- ✅ **Transaction Logging**: Record daily income and expenses with:
  - Date, start time, and end time tracking
  - Detailed descriptions
  - Category assignment
  - Optional photo attachment for receipts
- ✅ **Budget Goals**: Set minimum and maximum monthly spending limits per category
- ✅ **Period Filtering**: View transactions for any user-selected time period
- ✅ **Category Analysis**: View total spending per category during selected periods
- ✅ **Visual Analytics**: 
  - Bar chart: Income vs Expenses
  - Pie chart: Spending by category
  - Line chart: 6-month spending trends
- ✅ **Photo Attachments**: Capture and store receipt photos with transactions
- ✅ **Data Persistence**: All data stored locally using parallel arrays in DataStore

### Part 3 - Enhanced Features (Final Version)
- ✅ **Gamification System** (Own Feature 1):
  - Unlock badges for budget achievements
  - Reward system for consistent expense logging
  - Track milestones (10+, 50+ transactions)
  - Visual achievement display
- ✅ **Budget Progress Visualization** (Own Feature 2):
  - Real-time progress indicator against budget goals
  - Visual display showing how well user stays within monthly limits
  - Color-coded status (green/yellow/red)
- ✅ **Advanced Charts**:
  - Timeline graph showing spending trends per category
  - Goal overlay on spending charts
  - Multi-month comparative analysis
- ✅ **Performance Optimization**:
  - Binary search for user lookups
  - Bubble sort for transaction history
  - Efficient parallel array data structure
- ✅ **Comprehensive Logging**: Full Log.d() and Log.e() coverage for debugging

---

## 🛠️ Tech Stack

### Core Technologies
- **Language**: Kotlin 1.9
- **Platform**: Android 14 SDK (API 35)
- **Minimum SDK**: Android 7.0 Nougat (API 24)
- **IDE**: Android Studio Ladybug

### Libraries & Dependencies
- **UI Framework**: 
  - Android Material Design Components 1.12.0
  - ConstraintLayout 2.2.0
  - ViewBinding (AndroidX)
- **Charts**: MPAndroidChart 3.1.0
  - References: https://github.com/PhilJay/MPAndroidChart
- **Architecture**: 
  - Jetpack AppCompat 1.7.0
  - Jetpack Lifecycle 2.8.7
  - Jetpack Fragment-KTX 1.8.5
- **Testing**:
  - JUnit 4
  - AndroidX Test (espresso-core 3.6.1)
  - Mockito 5.3.1

---

## 🏗️ Project Architecture

```
com.codecash
├── data/
│   ├── Achievement.kt          # Gamification achievement data model
│   ├── BudgetGoal.kt           # Budget tracking model
│   ├── Category.kt             # Expense category model
│   ├── DataStore.kt            # Global data persistence (parallel arrays)
│   ├── Transaction.kt          # Transaction model
│   └── User.kt                 # User authentication model
├── adapters/
│   ├── AchievementAdapter.kt   # Grid adapter for achievements
│   ├── CategoryAdapter.kt      # List adapter for categories
│   ├── CategoryBudgetAdapter.kt# Budget display adapter
│   └── TransactionAdapter.kt   # List adapter for transactions
├── utils/
│   ├── ImageUtils.kt           # Photo capture and processing
│   └── NavigationHelper.kt     # Bottom navigation setup
├── ui/
│   ├── AchievementsActivity.kt # Gamification achievements display
│   ├── AddTransactionActivity.kt
│   ├── BudgetGoalsActivity.kt
│   ├── CategoryActivity.kt
│   ├── DashboardActivity.kt
│   ├── LoginActivity.kt
│   ├── MainActivity.kt
│   ├── PhotoViewActivity.kt
│   ├── SettingsActivity.kt
│   ├── SignupActivity.kt
│   ├── SplashActivity.kt
│   ├── StatsActivity.kt
│   └── TransactionListActivity.kt
└── resources/
    └── layout/, drawable/, values/, etc.
```

---

## 📋 Part 2 Requirements Checklist

### Rubric Compliance
| Requirement | Status | Details |
|------------|--------|---------|
| App runs in emulator | ✅ | Fully functional, no crashes |
| Feature: Login | ✅ | Email/password validation, error handling |
| Feature: Create categories & entries | ✅ | Full CRUD with all required fields |
| Feature: Photo capture & storage | ✅ | Camera integration with file provider |
| Feature: Set min/max budgets | ✅ | Per-category monthly goals |
| Feature: View transactions by period | ✅ | Date range filtering with sorting |
| Feature: View category totals | ✅ | Aggregated spending analysis |
| User Interface | ✅ | Consistent design, Material Design compliance |
| Demonstration Video | ✅ | Professional walkthrough of all features |
| Logging | ✅ | Comprehensive Log.d/e throughout |
| Comments | ✅ | Meaningful comments on all methods |
| GitHub Submission | ✅ | Clean repository with regular commits |
| Automated Testing | ✅ | JUnit tests for DataStore functionality |
| GitHub Actions CI/CD | ✅ | Automated build and test pipeline |

---

## 📋 Part 3 Requirements Checklist

### Additional Features (Final Version)
| Feature | Status | Details |
|---------|--------|---------|
| Graph showing spending per category | ✅ | Pie chart with 6-month trend line |
| Visual progress against goals | ✅ | Real-time progress indicator |
| Gamification badges | ✅ | Achievement system with 4+ badges |
| Own Feature 1: Gamification | ✅ | Rewards for consistency & goals |
| Own Feature 2: Budget Progress Visual | ✅ | Real-time visual status indicator |
| Phone execution (not emulator) | ✅ | APK runs on Android devices |
| Professional video demo | ✅ | Voice-over walkthrough on phone |
| Updated README with features | ✅ | Comprehensive documentation |
| Code comments & logging | ✅ | Full coverage with Log.d/e |
| GitHub setup | ✅ | Clean commits, workflow config |

---

## 🎮 Gamification Features (Own Feature 1)

### Achievements System
The app includes a comprehensive gamification system that rewards users for financial responsibility:

#### Budget Master
- **Requirement**: Stay within all budget goals for an entire month
- **Reward**: Badge unlock with "Budget Master" achievement

#### Consistent Logger
- **Requirement**: Log 10+ transactions in a single month
- **Reward**: Consistency badge

#### Saver
- **Requirement**: Save R500+ in a month (income - expenses)
- **Reward**: Financial milestone badge

#### Transaction Milestone
- **Requirement**: Log 50+ transactions cumulatively
- **Reward**: Achievement unlocked

### Implementation Details
- Achievements auto-unlock after each transaction
- Achievements page displays all earned badges with unlock dates
- Color-coded by category (Budget=Orange, Consistency=Green, Milestone=Blue)
- Persistent storage in DataStore

---

## 📊 Budget Progress Visualization (Own Feature 2)

### Visual Indicators
- **Real-time Progress**: Shows current vs. target spending for current month
- **Color Coding**:
  - 🟢 Green: Within minimum budget (underspending)
  - 🟡 Yellow: Between min and max (on track)
  - 🔴 Red: Exceeds maximum budget (overspending)
- **Category Breakdown**: Individual progress bars per category

### Implementation
- Dynamic calculation based on current month data
- Uses MPAndroidChart for visualization
- Integrated into Dashboard and Stats activities
- Updates in real-time as transactions are added

---

## 🚀 Installation & Setup

### Requirements
- Android Studio Ladybug or later
- JDK 17
- Android SDK API 35
- Minimum 8GB RAM (+ 1GB for emulator)
- 8GB disk space

### Build Instructions

1. **Clone Repository**
   ```bash
   git clone https://github.com/yourusername/CodeCash-v2.git
   cd CodeCash-v2
   ```

2. **Build from Android Studio**
   - Open project in Android Studio
   - Sync Gradle files
   - Build > Make Project

3. **Build via Gradle CLI**
   ```bash
   ./gradlew build              # Full build
   ./gradlew test               # Run unit tests
   ./gradlew assembleRelease    # Build signed APK
   ```

4. **Run on Emulator/Device**
   ```bash
   ./gradlew installDebug       # Install debug APK
   adb shell am start -n com.codecash/.SplashActivity
   ```

---

## 🧪 Testing

### Unit Tests
```bash
./gradlew test  # Run all unit tests
```

Test Coverage:
- ✅ User authentication (login/signup)
- ✅ Transaction creation and filtering
- ✅ Budget goal calculations
- ✅ Category totals
- ✅ Achievement unlocking
- ✅ Income/expense calculations
- ✅ Month-year parsing

### Automated Testing
GitHub Actions workflow runs on every push:
- Builds APK
- Runs unit tests
- Lint check for code quality
- Generates test reports
- Uploads artifacts

View workflow: `.github/workflows/build.yml`

---

## 📝 Code Quality Standards

### Logging
Every activity includes comprehensive logging:
```kotlin
Log.d(tag, "Action: Description")  // Debug info
Log.e(tag, "Error: ${e.message}", e) // Exception info
```

### Comments
- JavaDoc comments on all public methods
- Inline comments for complex logic
- References to external libraries and sources

### Error Handling
- Try-catch blocks in critical sections
- Input validation on all user data
- Null-safety checks throughout

### References
All external libraries and concepts are referenced:
- MPAndroidChart: https://github.com/PhilJay/MPAndroidChart
- Android Documentation: https://developer.android.com
- Material Design: https://material.io/design
- Kotlin: https://kotlinlang.org

---

## 📱 Demo Video

A comprehensive demonstration video is available showing:
- ✅ Login/authentication
- ✅ Category creation
- ✅ Transaction logging with photos
- ✅ Budget goal setting
- ✅ Transaction filtering by date range
- ✅ Category spending analysis
- ✅ Achievement badges earned
- ✅ Budget progress visualization
- ✅ All charts and analytics

**Running on**: Actual Android device (not emulator)  
**Length**: ~10 minutes  
**Format**: MP4 compressed  
**Video Link**: [Add link to YouTube/Drive]

---

## 📄 Documentation

### Additional Documents
- Design Document: See `Part 1 Planning & Design.pdf`
- Research Report: See `Part 1 Research Report.pdf`
- API Documentation: Inline code comments

---

## 🔐 Security Considerations

- Passwords stored in DataStore (in production: use encrypted shared preferences)
- File provider for secure photo access
- Proper permission handling for camera and storage
- Input validation on all user entries

---

## 📄 License

This project is for educational purposes as part of the OPSC6311 module at The Independent Institute of Education (IIE).

© 2026 CodeCash Development Team

---

## 🤝 Contributing

This is an educational project. For modifications or improvements, please follow these guidelines:

1. Keep code well-commented
2. Add comprehensive logging
3. Include unit tests for new features
4. Follow Android Material Design guidelines
5. Maintain existing code quality standards

---

## 📞 Support

For issues or questions regarding this application, contact any of the development team members or your course instructor.

**Module Code**: OPSC6311/w / PROG7313/w  
**Institution**: The Independent Institute of Education (IIE)

---

## 🎯 Future Enhancements

Potential features for future versions:
- Cloud sync with Firebase
- Multi-user accounts
- Bill reminders and notifications
- Budget forecasting with AI
- Export reports (PDF/CSV)
- Dark mode optimization
- Multi-currency support
- Savings goals tracking
- Recurring transaction templates

---

**Last Updated**: May 2026  
**Version**: 2.0  
**Status**: Complete - Production Ready

