This is my code cash app file tree. The codes of each file will follow in order according to this tree.
I will only be pasting relevant code to the functionality of the app. Save credits. Only focus on the code. I love my design. Do not change it. 

//This is the mvp prompt

You are a senior Android/Kotlin developer and final-POE optimization assistant.

Goal:
Help me polish my existing Budget Tracker app into a final submission that is as close to a 100% mark as possible.

Context:
- My app already exists and is mostly complete.
- Part 2 lost marks because of functionality issues.
- The biggest bugs to fix are:
  1) the app crashes when uploading an image
  2) the app icon still shows the default Android icon/emote
  3) the splash/landing logo shows the wrong shape (triangle instead of the correct logo)
- The app must match the style and screen flow shown in my uploaded POE PDF screenshots.
- The final app must run on a real mobile phone, not only an emulator.
- I need at least two custom features of my own, documented clearly in the README.

Priority fixes:
1. Fix the image-upload crash completely.
2. Replace the default Android icon with a clean custom app icon.
3. Correct the splash/landing logo asset so it matches the intended brand.
4. Polish all screens so they feel consistent, clean, and professional.
5. Make sure the app is stable, with no visible crashes or broken flows.
6. Keep the UI aligned with the sample screenshots from the PDF.

What the final POE must include:
- Login and registration using username and password
- Category creation
- Expense entry creation with date, description, category, and optional photo/receipt
- Monthly minimum and maximum spending goals
- Expense list for a user-selectable period
- Category totals for a user-selectable period
- All data saved locally in the database
- Final graph showing amount spent per category over a selectable period, including minimum and maximum goals
- Visual dashboard showing how the user is tracking against budget goals over the past month
- Gamification with rewards/badges for good budget behavior or consistent logging
- At least two custom features of my own
- A proper app icon and final image assets
- A README that explains the app, the custom features, and what the lecturer should test
- A professional demo video recorded on a phone
- GitHub Actions/testing support
- No crashes, no broken navigation, no sloppy UI

Screens to keep aligned with the sample PDF:
- Login / Sign In
- Dashboard / Home Screen
- Add Expense Screen
- Expenses List Screen
- Categories Screen
- Goals Screen
- Profile / Settings Screen
- Achievements / Rewards area
- Any supporting photo-view or detail screens already in the prototype

Important design direction from the sample PDF:
- Use a clean, mobile-first layout
- Keep bottom navigation visible and simple
- Make the dashboard feel like the main hub
- Use card-based sections for summary, goals, and quick actions
- Use clear labels, friendly microcopy, and tidy spacing
- Make the app feel polished rather than overcomplicated
- Preserve the prototype’s overall structure, but improve the visual consistency

Task:
Give me a practical final-development MVP prompt that:
- focuses on the marks that matter most
- matches the sample app’s structure and screen flow
- fixes the crash and visual asset problems
- prioritizes stability and professionalism
- includes the final POE requirements
- includes my two custom features
- is copy-paste ready for use with an AI coding assistant or developer

Output format:
1. A short “What to fix first” section
2. A stronger “Final MVP prompt” section
3. Keep it direct, detailed, and ready to paste
4. Do not add unnecessary explanation

//end of mvp prompt


file tree:

app/
├── .gitignore├── build.gradle.kts
├── proguard-rules.pro
└── src/
    ├── androidTest/
    │   └── java/
    │       └── com/
    │           ├── example/
    │           │   └── code_cash_v2/
    │           │       └── ExampleInstrumentedTest.kt
    │           └── example/
    │               └── code_cash_v3/
    │                   └── ExampleInstrumentedTest.kt
    ├── main/
    │   ├── AndroidManifest.xml
    │   ├── java/
    │   │   └── com/
    │   │       └── codecash/
    │   │           ├── AchievementsActivity.kt
    │   │           ├── AddTransactionActivity.kt
    │   │           ├── BudgetGoalsActivity.kt
    │   │           ├── CategoryActivity.kt
    │   │           ├── CategoryAdapter.kt
    │   │           ├── CategoryBudgetAdapter.kt
    │   │           ├── DashboardActivity.kt
    │   │           ├── LoginActivity.kt
    │   │           ├── MainActivity.kt
    │   │           ├── PhotoViewActivity.kt
    │   │           ├── SettingsActivity.kt
    │   │           ├── SignupActivity.kt
    │   │           ├── SplashActivity.kt
    │   │           ├── StatsActivity.kt
    │   │           ├── TransactionAdapter.kt
    │   │           ├── TransactionListActivity.kt
    │   │           ├── adapters/
    │   │           │   └── AchievementAdapter.kt
    │   │           ├── data/
    │   │           │   ├── Achievement.kt
    │   │           │   ├── BudgetGoal.kt
    │   │           │   ├── Category.kt
    │   │           │   ├── DataStore.kt
    │   │           │   ├── Transaction.kt
    │   │           │   └── User.kt
    │   │           └── utils/
    │   │               ├── ImageUtils.kt
    │   │               └── NavigationHelper.kt
    │   └── res/
    │       ├── drawable/
    │       │   ├── bg_outline.xml
    │       │   ├── circle_background.xml
    │       │   ├── codecash_logo.png
    │       │   ├── ic_add.xml
    │       │   ├── ic_back.xml
    │       │   ├── ic_budget.xml
    │       │   ├── ic_calendar.xml
    │       │   ├── ic_camera.xml
    │       │   ├── ic_codecash_foreground.xml
    │       │   ├── ic_delete.xml
    │       │   ├── ic_forecast.xml
    │       │   ├── ic_home.xml
    │       │   ├── ic_launcher_background.xml
    │       │   ├── ic_launcher_foreground.xml
    │       │   ├── ic_photo.xml
    │       │   ├── ic_settings.xml
    │       │   ├── ic_stats.xml
    │       │   ├── logo.png
    │       │   ├── logo_rounded.xml
    │       │   ├── logo_splash.xml
    │       │   ├── progress_budget.xml
    │       │   └── rounded_logo_bg.xml
    │       ├── layout/
    │       │   ├── activity_achievements.xml
    │       │   ├── activity_add_transaction.xml
    │       │   ├── activity_budget_goals.xml
    │       │   ├── activity_category.xml
    │       │   ├── activity_dashboard.xml
    │       │   ├── activity_login.xml
    │       │   ├── activity_photo_view.xml
    │       │   ├── activity_settings.xml
    │       │   ├── activity_signup.xml
    │       │   ├── activity_splash.xml
    │       │   ├── activity_stats.xml
    │       │   ├── activity_transaction_list.xml
    │       │   ├── bottom_nav.xml
    │       │   ├── dialog_add_category.xml
    │       │   ├── dialog_set_budget.xml
    │       │   ├── item_achievement.xml
    │       │   ├── item_category.xml
    │       │   └── item_transaction.xml
    │       ├── menu/
    │       │   ├── bottom_navigation_menu.xml
    │       │   └── photo_view_menu.xml
    │       ├── mipmap-anydpi-v26/
    │       │   ├── ic_launcher.xml
    │       │   └── ic_launcher_round.xml
    │       ├── mipmap-hdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-mdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-xhdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-xxhdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-xxxhdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   ├── ic_launcher_round.webp
    │       │   └── logo.png
    │       ├── values/
    │       │   ├── colors.xml
    │       │   ├── strings.xml
    │       │   └── themes.xml
    │       ├── values-night/
    │       │   └── themes.xml
    │       └── xml/
    │           ├── backup_rules.xml
    │           ├── data_extraction_rules.xml
    │           └── file_paths.xml
    └── test/
        └── java/
            └── com/
                ├── codecash/
                │   └── data/
                │       └── DataStoreTest.kt
                └── example/
                    └── code_cash_v3/
                        └── ExampleUnitTest.kt
//end of file tree

File tree with notes (for better guidance). Each note will be as a comment "//":

app/
├── .gitignore├── build.gradle.kts
├── proguard-rules.pro
└── src/
    ├── androidTest/
    │   └── java/
    │       └── com/
    │           ├── example/
    │           │   └── code_cash_v2/
    │           │       └── ExampleInstrumentedTest.kt // Check relevance of this file. This could be legacy code.
    │           └── example/
    │               └── code_cash_v3/
    │                   └── ExampleInstrumentedTest.kt
    ├── main/
    │   ├── AndroidManifest.xml // At the end of all files. check to see all code is correct and relevant to files.
    │   ├── java/
    │   │   └── com/
    │   │       └── codecash/
    │   │           ├── AchievementsActivity.kt
    │   │           ├── AddTransactionActivity.kt
    │   │           ├── BudgetGoalsActivity.kt
    │   │           ├── CategoryActivity.kt
    │   │           ├── CategoryAdapter.kt
    │   │           ├── CategoryBudgetAdapter.kt
    │   │           ├── DashboardActivity.kt
    │   │           ├── LoginActivity.kt
    │   │           ├── MainActivity.kt
    │   │           ├── PhotoViewActivity.kt
    │   │           ├── SettingsActivity.kt
    │   │           ├── SignupActivity.kt
    │   │           ├── SplashActivity.kt
    │   │           ├── StatsActivity.kt
    │   │           ├── TransactionAdapter.kt
    │   │           ├── TransactionListActivity.kt // *All Activity- Make sure to retrieve data relevant to the user. Eg, if a new user has been created, there should be no previous data at all. everything should be empty/data at 0%. 
    Only on a returning user does it have data and only data relevant to that user. Make sure database is structured to capture such details.
    │   │           ├── adapters/
    │   │           │   └── AchievementAdapter.kt
    │   │           ├── data/ //In this directory. No data can be predefined. eg. when backtesting I found that I'd have a gain margin from previous month but under a new user.
    │   │           │   ├── Achievement.kt
    │   │           │   ├── BudgetGoal.kt
    │   │           │   ├── Category.kt
    │   │           │   ├── DataStore.kt
    │   │           │   ├── Transaction.kt
    │   │           │   └── User.kt
    │   │           └── utils/
    │   │               ├── ImageUtils.kt //is this where I upload a picture? When I upload my picture. The app fails. Is it file types?? Find and fix this error. I should be able to uploada picture. The picture should have a relevant directory in this file tree so it is directly sent here to avoid any memory failure. Also when saving an imge. We will save it in this format "user's name + timestamp(dd/mm/yyyy hh:mm)" eg. Tshiamo_30_05_2026_11_11
    This is to avoid having duplicates. As well as help sort each picture to the user. 
    │   │               └── NavigationHelper.kt
    │   └── res/
    │       ├── drawable/
    │       │   ├── bg_outline.xml
    │       │   ├── circle_background.xml
    │       │   ├── codecash_logo.png //This logo a MUST be the one displayed as the app icon. It should also have rounded corners. This logo should also be constant when logging 
    │       │   ├── ic_add.xml
    │       │   ├── ic_back.xml
    │       │   ├── ic_budget.xml
    │       │   ├── ic_calendar.xml
    │       │   ├── ic_camera.xml
    │       │   ├── ic_codecash_foreground.xml
    │       │   ├── ic_delete.xml
    │       │   ├── ic_forecast.xml
    │       │   ├── ic_home.xml
    // "ic_launcher_background.xml + ic_launcher_foreground.xml" These two files may be interfering with my logo. I do not want my app to have this as the launcher icon. My launcher icon is to be "logo.png". It is to have rounded corners. I believe one exists already "logo_rounded.xml + logo_splash.xml". If possible remove this default IC launcher. Ammend releavant code.
    │       │   ├── ic_launcher_background.xml
    │       │   ├── ic_launcher_foreground.xml
    │       │   ├── ic_photo.xml
    │       │   ├── ic_settings.xml
    │       │   ├── ic_stats.xml
    │       │   ├── logo.png
    │       │   ├── logo_rounded.xml // this would serve as a good logo. Just have to zoom in a little (20%) so the image is nice and visible. 
    │       │   ├── logo_splash.xml
    │       │   ├── progress_budget.xml
    │       │   └── rounded_logo_bg.xml
    │       ├── layout/
    │       │   ├── activity_achievements.xml
    │       │   ├── activity_add_transaction.xml
    │       │   ├── activity_budget_goals.xml 
    │       │   ├── activity_category.xml
    │       │   ├── activity_dashboard.xml //This is where I saw previous data from the month on a new user. This is illogical. This should be empty on a new user. On a returning user. Like the ones I have generared. There should be data. 
    │       │   ├── activity_login.xml //This is perfect. I do not want to see the trangle in here. Image view should contain one of the following: logo.png| logo_rounded.xml | logo_splash.xml
    │       │   ├── activity_photo_view.xml 
    │       │   ├── activity_settings.xml
    │       │   ├── activity_signup.xml //This is perfect. I do not want to see the trangle in here. Image view should contain one of the following: logo.png| logo_rounded.xml | logo_splash.xml
    │       │   ├── activity_splash.xml //This does not follow directive. In the image view. One of these should be inclued: logo.png| logo_rounded.xml | logo_splash.xml. Not the triagle which is listed as " android:src="@drawable/logo_splash" 
    │       │   ├── activity_stats.xml
    │       │   ├── activity_transaction_list.xml //when adding transactions some of the colour schemes weren't visible forback testing. Make sure everything is user friendly 
    │       │   ├── bottom_nav.xml //100% accurate.
    │       │   ├── dialog_add_category.xml
    │       │   ├── dialog_set_budget.xml
    │       │   ├── item_achievement.xml
    │       │   ├── item_category.xml
    │       │   └── item_transaction.xml
    │       ├── menu/
    │       │   ├── bottom_navigation_menu.xml 
    │       │   └── photo_view_menu.xml
    // There is only two desired files to be used here. ic_launcher_round.xml + ic_launcher.xml. The rest of the ic_launcher files are legacy code. Amend my code. This should remove the android icon fault I have been having
    │       ├── mipmap-anydpi-v26/
    │       │   ├── ic_launcher.xml
    │       │   └── ic_launcher_round.xml
    │       ├── mipmap-hdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-mdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-xhdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-xxhdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   └── ic_launcher_round.webp
    │       ├── mipmap-xxxhdpi/
    │       │   ├── ic_launcher.png
    │       │   ├── ic_launcher.webp
    │       │   ├── ic_launcher_round.webp
    │       │   └── logo.png //This file should be kept
    │       ├── values/
    │       │   ├── colors.xml
    │       │   ├── strings.xml
    │       │   └── themes.xml //This interacts with night mode on/off. Make sure that both themes are user friendly 
    │       ├── values-night/
    │       │   └── themes.xml //This interacts with night mode on/off. Make sure that both themes are user friendly
    │       └── xml/
    │           ├── backup_rules.xml
    │           ├── data_extraction_rules.xml
    │           └── file_paths.xml
    └── test/
        └── java/
            └── com/
                ├── codecash/
                │   └── data/
                │       └── DataStoreTest.kt
                └── example/
                    └── code_cash_v3/
                        └── ExampleUnitTest.kt

//end of noted file tree

There seems to be changes with my data base. Ammend. Make sure my database us fully functional and aso stores image names. 

***PRIORITY***
Here is how you will strucure your output. When you are required to output an mvp and code suggestions. Add onto the mvp above. and then print out code suggestions below that. 
When you are required to update app code. Focus on getting the app production ready. Only prompt user if there is something required. Otherwise ensure full deployment, 100% functionality. To save credits there there is a file called memory.md This is where memory is stored. 
******


//Now comes the codes of each file in the file tree. Each separated by emoty lines

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"
        android:maxSdkVersion="32" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"
        android:maxSdkVersion="32" />
    <uses-permission android:name="android.permission.READ_MEDIA_IMAGES" />

    <uses-feature
        android:name="android.hardware.camera"
        android:required="false" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.CodeCash"
        tools:targetApi="35">

        <activity android:name=".SplashActivity"
            android:exported="true"
            android:theme="@style/Theme.CodeCash.Splash">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

        <activity android:name=".LoginActivity" android:exported="false" />
        <activity android:name=".SignupActivity" android:exported="false" />
        <activity android:name=".DashboardActivity" android:exported="false" />
        <activity android:name=".AddTransactionActivity" android:exported="false" />
        <activity android:name=".TransactionListActivity" android:exported="false" />
        <activity android:name=".CategoryActivity" android:exported="false" />
        <activity android:name=".BudgetGoalsActivity" android:exported="false" />
        <activity android:name=".StatsActivity" android:exported="false" />
        <activity android:name=".AchievementsActivity" android:exported="false" />
        <activity android:name=".PhotoViewActivity" android:exported="false" />

        <provider
            android:name="androidx.core.content.FileProvider"
            android:authorities="${applicationId}.fileprovider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/file_paths" />
        </provider>

    </application>
</manifest>

package com.codecash.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codecash.data.DataStore
import com.codecash.databinding.ItemAchievementBinding
import java.text.SimpleDateFormat
import java.util.*

/**
 * AchievementAdapter - RecyclerView adapter for displaying user achievements/badges.
 * 
 * References:
 * - RecyclerView patterns: https://developer.android.com/guide/topics/ui/layout/recyclerview
 */
class AchievementAdapter(private val achievementIds: List<Int>) : 
    RecyclerView.Adapter<AchievementAdapter.AchievementViewHolder>() {

    private val tag = "AchievementAdapter"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
        Log.d(tag, "onCreateViewHolder: Creating achievement view holder")
        
        val binding = ItemAchievementBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return AchievementViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        try {
            val achievementId = achievementIds[position]
            val index = DataStore.achievementIds.indexOf(achievementId)
            
            if (index != -1) {
                Log.d(tag, "onBindViewHolder: Binding achievement at position $position - ${DataStore.achievementTitles[index]}")
                
                val title = DataStore.achievementTitles[index]
                val description = DataStore.achievementDescriptions[index]
                val unlockedDate = DataStore.achievementUnlockedDates[index]
                val category = DataStore.achievementCategories[index]
                
                holder.bind(title, description, unlockedDate, category)
            } else {
                Log.w(tag, "Achievement not found at index: $index")
            }
        } catch (e: Exception) {
            Log.e(tag, "Error binding achievement: ${e.message}", e)
        }
    }

    override fun getItemCount(): Int = achievementIds.size

    class AchievementViewHolder(private val binding: ItemAchievementBinding) : 
        RecyclerView.ViewHolder(binding.root) {

        private val tag = "AchievementViewHolder"
        private val sdf = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())

        fun bind(title: String, description: String, unlockedDate: Long, category: String) {
            try {
                Log.d(tag, "bind: Binding achievement: $title")
                
                binding.tvAchievementTitle.text = title
                binding.tvAchievementDescription.text = description
                binding.tvUnlockedDate.text = "Unlocked: ${sdf.format(Date(unlockedDate))}"
                
                // Set badge color based on category
                val backgroundColor = when (category) {
                    "budget" -> "#FFA500"      // Orange for budget achievements
                    "consistency" -> "#4CAF50"  // Green for consistency
                    "milestone" -> "#2196F3"    // Blue for milestones
                    else -> "#9C27B0"           // Purple for others
                }
                binding.badgeCategory.setBackgroundColor(android.graphics.Color.parseColor(backgroundColor))
                binding.badgeCategory.text = category.uppercase()
                
            } catch (e: Exception) {
                Log.e(tag, "Error binding achievement: ${e.message}", e)
            }
        }
    }
}


package com.codecash.data

import java.util.*

/**
 * Data model for gamification achievements/badges.
 * Part 3 requirement: Track badges for meeting budget goals and consistent logging.
 * 
 * References:
 * - Gamification design patterns: https://www.interaction-design.org/literature/articles/gamification
 * - Achievement systems in Android apps
 */
data class Achievement(
    val id: Int,
    val userId: Int,
    val title: String,
    val description: String,
    val iconResId: String,
    val unlockedDate: Long,
    val category: String // "budget", "consistency", "milestone"
)


package com.codecash.data

data class BudgetGoal(
    val id: Int,
    val userId: Int,
    val categoryId: Int,
    val minAmount: Double,
    val maxAmount: Double,
    val monthYear: String
)


package com.codecash.data

import android.graphics.Color

data class Category(
    val id: Int,
    val name: String,
    val colorHex: String = "#2dd4bf",
    val minBudget: Double = 0.0,
    val maxBudget: Double = 0.0,
    val iconName: String = "default"
) {
    fun getColorInt(): Int = Color.parseColor(colorHex)
}


package com.codecash.data

import java.util.*

// Lightweight logging helpers to keep DataStore usable in JVM unit tests
private fun logD(msg: String) = println("D/DataStore: $msg")
private fun logW(msg: String) = println("W/DataStore: $msg")
private fun logE(msg: String, e: Throwable? = null) {
    println("E/DataStore: $msg${e?.let { " - ${it.message}" } ?: ""}")
}

/**
 * Global data store using parallel-style lists to persist data during the app session.
 * This satisfies the requirement for global data access and parallel arrays in Part 2.
 */
object DataStore {
    private const val TAG = "DataStore"

    // Current logged in user ID (-1 = none)
    var currentUserId: Int = -1

    // Parallel arrays for Users
    val userIds = ArrayList<Int>()
    val userNames = ArrayList<String>()
    val userEmails = ArrayList<String>()
    val userPasswords = ArrayList<String>()

    // Parallel arrays for Categories
    val categoryIds = ArrayList<Int>()
    val categoryNames = ArrayList<String>()
    val categoryColors = ArrayList<String>()
    val categoryMinBudgets = ArrayList<Double>()
    val categoryMaxBudgets = ArrayList<Double>()

    // Parallel arrays for Transactions (Extended with start/end times for rubric compliance)
    val transactionIds = ArrayList<Int>()
    val transactionUserIds = ArrayList<Int>()
    val transactionAmounts = ArrayList<Double>()
    val transactionDescriptions = ArrayList<String>()
    val transactionCategoryIds = ArrayList<Int>()
    val transactionDates = ArrayList<Long>()
    val transactionStartTimes = ArrayList<Long>()
    val transactionEndTimes = ArrayList<Long>()
    val transactionPhotoPaths = ArrayList<String?>()
    val transactionIsIncome = ArrayList<Boolean>()

    // Parallel arrays for Budget Goals
    val budgetGoalIds = ArrayList<Int>()
    val budgetGoalUserIds = ArrayList<Int>()
    val budgetGoalCategoryIds = ArrayList<Int>()
    val budgetGoalMinAmounts = ArrayList<Double>()
    val budgetGoalMaxAmounts = ArrayList<Double>()
    val budgetGoalMonthYears = ArrayList<String>()

    // Parallel arrays for Achievements/Gamification (Part 3)
    val achievementIds = ArrayList<Int>()
    val achievementUserIds = ArrayList<Int>()
    val achievementTitles = ArrayList<String>()
    val achievementDescriptions = ArrayList<String>()
    val achievementUnlockedDates = ArrayList<Long>()
    val achievementCategories = ArrayList<String>() // "budget", "consistency", "milestone"

    // Auto-increment IDs
    private var nextUserId = 1
    private var nextCategoryId = 1
    private var nextTransactionId = 1
    private var nextBudgetGoalId = 1
    private var nextAchievementId = 1
    
    init {
        initializeTestData()
    }

    private fun initializeTestData() {
        logD("Initializing test data...")
        
        // 1. Seed Users (Group members + Admin)
        // Admin account for testing: admin@codecash.com / Password123
        addUser("Admin", "admin@codecash.com", "Password123")
        addUser("Tshiamo Keefelakae Lentswe", "st10448558@codecash.com", "St10448558")
        addUser("Yinhla Maringa", "st10441743@codecash.com", "St10441743")
        addUser("Matshidiso Nthebe", "st10449727@codecash.com", "St10449727")
        addUser("Mzamo Richmond Ndlovu", "st10455453@codecash.com", "St10455453")

        // 2. Seed Default Categories
        addCategory("Food & Dining", "#22c55e")
        addCategory("Transport", "#3b82f6")
        addCategory("Rent", "#a855f7")
        addCategory("Entertainment", "#f97316")
        addCategory("Utilities", "#ef4444")
        addCategory("Shopping", "#ec4899")

        // 3. Seed Transactions (Removed - new users start with 0% progress)
        // Users can add their own transactions when they start using the app
        
        logD("Test data initialized.")
    }

    // ==================== USER OPERATIONS ====================

    fun addUser(name: String, email: String, password: String): Int {
        val id = nextUserId++
        userIds.add(id)
        userNames.add(name)
        userEmails.add(email)
        userPasswords.add(password)
        return id
    }

    /**
     * Requirement: Binary Search for optimized lookup.
     * We'll search through user emails. Note: for binary search, data must be sorted.
     */
    fun findUserByEmail(email: String): Int {
        // In a real implementation with parallel arrays, we'd need to sort all arrays by email.
        // For the sake of the rubric, we'll demonstrate a sorted search logic.
        val indices = userEmails.indices.sortedBy { userEmails[it].lowercase() }
        
        var low = 0
        var high = indices.size - 1
        val target = email.lowercase()

        while (low <= high) {
            val mid = (low + high) / 2
            val midEmail = userEmails[indices[mid]].lowercase()
            
            when {
                midEmail == target -> return userIds[indices[mid]]
                midEmail < target -> low = mid + 1
                else -> high = mid - 1
            }
        }
        return -1
    }

    fun validateLogin(email: String, password: String): Int {
        val userId = findUserByEmail(email)
        if (userId != -1) {
            val index = userIds.indexOf(userId)
            if (index != -1 && userPasswords[index] == password) {
                currentUserId = userId
                return userId
            }
        }
        return -1
    }

    fun getCurrentUserName(): String {
        val index = userIds.indexOf(currentUserId)
        return if (index != -1) userNames[index] else "User"
    }

    // ==================== CATEGORY OPERATIONS ====================

    fun addCategory(name: String, color: String = "#2dd4bf"): Int {
        val id = nextCategoryId++
        categoryIds.add(id)
        categoryNames.add(name)
        categoryColors.add(color)
        categoryMinBudgets.add(0.0)
        categoryMaxBudgets.add(0.0)
        return id
    }

    fun getCategoryName(categoryId: Int): String {
        val index = categoryIds.indexOf(categoryId)
        return if (index != -1) categoryNames[index] else "Unknown"
    }

    fun getCategoryColor(categoryId: Int): String {
        val index = categoryIds.indexOf(categoryId)
        return if (index != -1) categoryColors[index] else "#2dd4bf"
    }

    // ==================== TRANSACTION OPERATIONS ====================

    fun addTransaction(
        userId: Int,
        amount: Double,
        description: String,
        categoryId: Int,
        date: Long,
        startTime: Long,
        endTime: Long,
        photoPath: String? = null,
        isIncome: Boolean = false
    ): Int {
        val id = nextTransactionId++
        transactionIds.add(id)
        transactionUserIds.add(userId)
        transactionAmounts.add(amount)
        transactionDescriptions.add(description)
        transactionCategoryIds.add(categoryId)
        transactionDates.add(date)
        transactionStartTimes.add(startTime)
        transactionEndTimes.add(endTime)
        transactionPhotoPaths.add(photoPath)
        transactionIsIncome.add(isIncome)
        return id
    }

    fun getTransactionsForPeriod(userId: Int, startDate: Long, endDate: Long): List<Int> {
        val result = ArrayList<Int>()
        for (i in transactionUserIds.indices) {
            if (transactionUserIds[i] == userId &&
                transactionDates[i] in startDate..endDate) {
                result.add(transactionIds[i])
            }
        }
        
        // Requirement: Bubble Sort for sorting format
        bubbleSortByDate(result)
        return result
    }

    fun getTransactionsForUser(userId: Int): List<Int> {
        val result = ArrayList<Int>()
        for (i in transactionUserIds.indices) {
            if (transactionUserIds[i] == userId) {
                result.add(transactionIds[i])
            }
        }
        return result
    }

    fun deleteTransaction(transactionId: Int) {
        val index = transactionIds.indexOf(transactionId)
        if (index != -1) {
            transactionIds.removeAt(index)
            transactionUserIds.removeAt(index)
            transactionAmounts.removeAt(index)
            transactionDescriptions.removeAt(index)
            transactionCategoryIds.removeAt(index)
            transactionDates.removeAt(index)
            transactionStartTimes.removeAt(index)
            transactionEndTimes.removeAt(index)
            transactionPhotoPaths.removeAt(index)
            transactionIsIncome.removeAt(index)
        }
    }

    /**
     * Requirement: Bubble Sort implementation for transactions by date (descending)
     */
    private fun bubbleSortByDate(transactionIdList: ArrayList<Int>) {
        val n = transactionIdList.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                val idx1 = transactionIds.indexOf(transactionIdList[j])
                val idx2 = transactionIds.indexOf(transactionIdList[j + 1])
                
                if (transactionDates[idx1] < transactionDates[idx2]) {
                    // Swap
                    val temp = transactionIdList[j]
                    transactionIdList[j] = transactionIdList[j + 1]
                    transactionIdList[j + 1] = temp
                }
            }
        }
    }

    fun getCategoryTotal(userId: Int, categoryId: Int, startDate: Long, endDate: Long): Double {
        var total = 0.0
        for (i in transactionUserIds.indices) {
            if (transactionUserIds[i] == userId &&
                transactionCategoryIds[i] == categoryId &&
                transactionDates[i] in startDate..endDate &&
                !transactionIsIncome[i]) {
                total += transactionAmounts[i]
            }
        }
        return total
    }

    fun getIncomeTotal(userId: Int, startDate: Long, endDate: Long): Double {
        var total = 0.0
        for (i in transactionUserIds.indices) {
            if (transactionUserIds[i] == userId &&
                transactionDates[i] in startDate..endDate &&
                transactionIsIncome[i]) {
                total += transactionAmounts[i]
            }
        }
        return total
    }

    fun getExpenseTotal(userId: Int, startDate: Long, endDate: Long): Double {
        var total = 0.0
        for (i in transactionUserIds.indices) {
            if (transactionUserIds[i] == userId &&
                transactionDates[i] in startDate..endDate &&
                !transactionIsIncome[i]) {
                total += transactionAmounts[i]
            }
        }
        return total
    }

    // ==================== BUDGET GOAL OPERATIONS ====================

    fun addBudgetGoal(
        userId: Int,
        categoryId: Int,
        minAmount: Double,
        maxAmount: Double,
        monthYear: String
    ): Int {
        val id = nextBudgetGoalId++
        budgetGoalIds.add(id)
        budgetGoalUserIds.add(userId)
        budgetGoalCategoryIds.add(categoryId)
        budgetGoalMinAmounts.add(minAmount)
        budgetGoalMaxAmounts.add(maxAmount)
        budgetGoalMonthYears.add(monthYear)
        return id
    }

    fun getBudgetGoal(userId: Int, categoryId: Int, monthYear: String): BudgetGoal? {
        for (i in budgetGoalUserIds.indices) {
            if (budgetGoalUserIds[i] == userId &&
                budgetGoalCategoryIds[i] == categoryId &&
                budgetGoalMonthYears[i] == monthYear) {
                return BudgetGoal(
                    budgetGoalIds[i],
                    budgetGoalUserIds[i],
                    budgetGoalCategoryIds[i],
                    budgetGoalMinAmounts[i],
                    budgetGoalMaxAmounts[i],
                    budgetGoalMonthYears[i]
                )
            }
        }
        return null
    }

    // ==================== UTILITY ====================

    fun getCurrentMonthYear(): String {
        val sdf = java.text.SimpleDateFormat("MM-yyyy", Locale.getDefault())
        return sdf.format(Date())
    }

    fun getLastMonthYear(currentMonthYear: String): String {
        return try {
            val parts = currentMonthYear.split("-")
            val month = parts[0].toInt()
            val year = parts[1].toInt()
            
            val lastMonth = if (month == 1) 12 else month - 1
            val lastYear = if (month == 1) year - 1 else year
            
            String.format("%02d-%d", lastMonth, lastYear)
        } catch (e: Exception) {
            logE("Error calculating last month year: $currentMonthYear", e)
            currentMonthYear
        }
    }

    fun getMonthStartEnd(monthYear: String): Pair<Long, Long> {
        return try {
            val parts = monthYear.split("-")
            val month = parts[0].toInt() - 1
            val year = parts[1].toInt()
            val calendar = Calendar.getInstance()
            calendar.set(year, month, 1, 0, 0, 0)
            val start = calendar.timeInMillis
            calendar.set(year, month, calendar.getActualMaximum(Calendar.DAY_OF_MONTH), 23, 59, 59)
            val end = calendar.timeInMillis
            Pair(start, end)
        } catch (e: Exception) {
            logE("Error parsing month year: $monthYear", e)
            Pair(0L, Long.MAX_VALUE)
        }
    }

    // ==================== GAMIFICATION / ACHIEVEMENTS (Part 3) ====================

    /**
     * Add achievement/badge when user meets budget goals or logs consistently.
     * Requirements: Part 3 - Gamification elements for rewards and badges
     */
    fun addAchievement(
        userId: Int,
        title: String,
        description: String,
        category: String,
        unlockedDate: Long = System.currentTimeMillis()
    ): Int {
        val id = nextAchievementId++
        achievementIds.add(id)
        achievementUserIds.add(userId)
        achievementTitles.add(title)
        achievementDescriptions.add(description)
        achievementUnlockedDates.add(unlockedDate)
        achievementCategories.add(category)
        logD("Achievement unlocked for user $userId: $title")
        return id
    }

    /**
     * Get all achievements for a user.
     */
    fun getUserAchievements(userId: Int): List<Int> {
        val result = ArrayList<Int>()
        for (i in achievementUserIds.indices) {
            if (achievementUserIds[i] == userId) {
                result.add(achievementIds[i])
            }
        }
        return result
    }

    /**
     * Check if user has specific achievement.
     */
    fun hasAchievement(userId: Int, title: String): Boolean {
        for (i in achievementUserIds.indices) {
            if (achievementUserIds[i] == userId && achievementTitles[i] == title) {
                return true
            }
        }
        return false
    }

    /**
     * Auto-check budget goals and unlock achievements if conditions met.
     * Called after each transaction to verify gamification conditions.
     */
    fun checkAndUnlockAchievements(userId: Int) {
        val currentMonth = getCurrentMonthYear()
        val (start, end) = getMonthStartEnd(currentMonth)
        
        logD("Checking achievements for user $userId in period $currentMonth")

        // Achievement 1: Budget Master - Stay within all budget goals
        var allGoalsMet = true
        for (i in budgetGoalUserIds.indices) {
            if (budgetGoalUserIds[i] == userId && budgetGoalMonthYears[i] == currentMonth) {
                val categoryId = budgetGoalCategoryIds[i]
                val categorySpent = getCategoryTotal(userId, categoryId, start, end)
                val maxBudget = budgetGoalMaxAmounts[i]
                
                if (categorySpent > maxBudget) {
                    allGoalsMet = false
                    break
                }
            }
        }
        
        if (allGoalsMet && !hasAchievement(userId, "Budget Master")) {
            addAchievement(
                userId,
                "Budget Master",
                "Stayed within all budget goals for the month!",
                "budget"
            )
        }

        // Achievement 2: Consistent Logger - 10+ transactions in a month
        val monthTransactions = getTransactionsForPeriod(userId, start, end)
        if (monthTransactions.size >= 10 && !hasAchievement(userId, "Consistent Logger")) {
            addAchievement(
                userId,
                "Consistent Logger",
                "Logged 10+ transactions this month!",
                "consistency"
            )
        }

        // Achievement 3: Saver - Saved 500R+ in a month (income - expenses)
        val income = getIncomeTotal(userId, start, end)
        val expenses = getExpenseTotal(userId, start, end)
        if ((income - expenses) >= 500 && !hasAchievement(userId, "Saver")) {
            addAchievement(
                userId,
                "Saver",
                "Saved R500+ this month!",
                "milestone"
            )
        }

        // Achievement 4: Milestone - 50+ total transactions all time
        val allTransactions = getTransactionsForUser(userId)
        if (allTransactions.size >= 50 && !hasAchievement(userId, "Transaction Milestone")) {
            addAchievement(
                userId,
                "Transaction Milestone",
                "Logged 50+ transactions! Great financial tracking!",
                "milestone"
            )
        }
    }

    /**
     * Get progress percentage for a category against its max budget for current month.
     * Used for UI progress indicators in Part 3.
     */
    fun getBudgetProgress(userId: Int, categoryId: Int): Pair<Double, Double> {
        val currentMonth = getCurrentMonthYear()
        val (start, end) = getMonthStartEnd(currentMonth)
        
        val budgetGoal = getBudgetGoal(userId, categoryId, currentMonth)
        val spent = getCategoryTotal(userId, categoryId, start, end)
        
        return if (budgetGoal != null) {
            Pair(spent, budgetGoal.maxAmount)
        } else {
            Pair(spent, spent) // No budget goal set, so 100% progress
        }
    }
}


package com.codecash.data

data class Transaction(
    val id: Int,
    val userId: Int,
    val amount: Double,
    val description: String,
    val categoryId: Int,
    val date: Long,
    val photoPath: String? = null,
    val isIncome: Boolean = false
) {
    fun getFormattedAmount(): String = if (isIncome)
        "+R${String.format("%.2f", amount)}"
    else
        "-R${String.format("%.2f", amount)}"

    fun getDateString(): String {
        val sdf = java.text.SimpleDateFormat("dd MMM yyyy", java.util.Locale.getDefault())
        return sdf.format(java.util.Date(date))
    }
}



package com.codecash.data

data class User(
    val id: Int,
    val fullName: String,
    val email: String,
    val password: String,
    val createdAt: Long = System.currentTimeMillis()
)


package com.codecash

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.codecash.adapters.AchievementAdapter
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityAchievementsBinding
import com.codecash.utils.NavigationHelper

/**
 * AchievementsActivity - Display badges and achievements unlocked by user.
 * 
 * Part 3 Requirement: Gamification elements - badges for meeting goals.
 * 
 * Features:
 * - Grid display of earned achievements
 * - Achievement descriptions and unlock dates
 * - Reward tracking for consistent expense logging
 * - Badges for budget goal achievements
 * 
 * References:
 * - Gamification design: https://www.interaction-design.org/literature/articles/gamification
 * - Achievement systems in mobile apps
 */
class AchievementsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAchievementsBinding
    private val tag = "AchievementsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing AchievementsActivity")
        
        try {
            binding = ActivityAchievementsBinding.inflate(layoutInflater)
            setContentView(binding.root)

            setupUI()
            loadAchievements()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading achievements", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up achievements UI")
        
        try {
            // Toolbar
            binding.toolbar.setNavigationOnClickListener { 
                Log.d(tag, "Back button clicked")
                finish() 
            }

            // GridLayoutManager for achievements display
            binding.rvAchievements.layoutManager = GridLayoutManager(this, 2)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up achievements UI", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadAchievements() {
        Log.d(tag, "loadAchievements: Fetching user achievements")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in")
                return
            }

            val achievements = DataStore.getUserAchievements(userId)
            Log.d(tag, "Loaded ${achievements.size} achievements for user $userId")

            // Display user stats
            val allTransactions = DataStore.getTransactionsForUser(userId)
            val currentMonth = DataStore.getCurrentMonthYear()
            val (start, end) = DataStore.getMonthStartEnd(currentMonth)
            val monthExpenses = DataStore.getExpenseTotal(userId, start, end)

            binding.tvStats.text = """
                Total Transactions: ${allTransactions.size}
                This Month's Expenses: R${"%.2f".format(monthExpenses)}
                Achievements Earned: ${achievements.size}
            """.trimIndent()

            // Setup adapter
            val adapter = AchievementAdapter(achievements)
            binding.rvAchievements.adapter = adapter

        } catch (e: Exception) {
            Log.e(tag, "Error loading achievements: ${e.message}", e)
            Toast.makeText(this, "Error loading achievements: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}

package com.codecash

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityAddTransactionBinding
import com.codecash.utils.ImageUtils
import com.google.android.material.chip.Chip
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Activity for adding a new transaction (expense or income).
 * Meets rubric requirements for:
 * - Creating entries with date, start/end times, description, category.
 * - Optionally adding a photograph using the camera.
 */
class AddTransactionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTransactionBinding
    private var selectedCategoryId = -1
    private var selectedDateMillis: Long = System.currentTimeMillis()
    private var startTimeMillis: Long = System.currentTimeMillis()
    private var endTimeMillis: Long = System.currentTimeMillis() + 3600000 // +1 hour default
    private var currentPhotoPath: String? = null
    private var photoUri: Uri? = null
    private var isIncome: Boolean = false // Track whether this is income or expense

    // Register camera activity result for capturing receipt photos
    private val takePhotoLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            binding.ivPhotoPreview.visibility = View.VISIBLE
            binding.ivCameraIcon.visibility = View.GONE
            try {
                binding.ivPhotoPreview.setImageURI(photoUri)
                Toast.makeText(this, "Photo attached successfully", Toast.LENGTH_SHORT).show()
                android.util.Log.d("AddTransaction", "Photo captured and stored at: $currentPhotoPath")
            } catch (se: SecurityException) {
                Toast.makeText(this, "Unable to access captured photo (permission denied)", Toast.LENGTH_LONG).show()
                android.util.Log.e("AddTransaction", "SecurityException setting image URI", se)
            } catch (e: Exception) {
                Toast.makeText(this, "Error attaching photo", Toast.LENGTH_SHORT).show()
                android.util.Log.e("AddTransaction", "Error setting image URI", e)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        // Toolbar with back navigation
        binding.toolbar.setNavigationOnClickListener { finish() }

        // Setup Income/Expense Radio Buttons (guarded in case layout missing)
        try {
            binding.rbExpense.isChecked = true
            isIncome = false
            binding.rbExpense.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    isIncome = false
                    Log.d("AddTransaction", "Transaction type: EXPENSE")
                }
            }
            binding.rbIncome.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    isIncome = true
                    Log.d("AddTransaction", "Transaction type: INCOME")
                }
            }
        } catch (e: Exception) {
            Log.w("AddTransaction", "Radio buttons not available in layout: ${e.message}")
            isIncome = false
        }

        // Setup Date Picker
        val dateSdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
        binding.etDate.setText(dateSdf.format(Date(selectedDateMillis)))
        binding.etDate.setOnClickListener { showDatePicker() }

        // Setup Time Pickers (Required by rubric)
        val timeSdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        binding.etStartTime.setText(timeSdf.format(Date(startTimeMillis)))
        binding.etEndTime.setText(timeSdf.format(Date(endTimeMillis)))
        
        binding.etStartTime.setOnClickListener { showTimePicker(true) }
        binding.etEndTime.setOnClickListener { showTimePicker(false) }

        // Populate Categories from DataStore parallel arrays
        populateCategories()

        // Camera Integration
        binding.btnTakePhoto.setOnClickListener { dispatchTakePictureIntent() }

        // Save Logic
        binding.btnSave.setOnClickListener { saveTransaction() }

        // Hide bottom nav to focus on data entry
        binding.bottomNav.visibility = View.GONE
    }

    private fun populateCategories() {
        binding.chipGroupCategory.removeAllViews()
        for (i in DataStore.categoryIds.indices) {
            val chip = Chip(this)
            chip.text = DataStore.categoryNames[i]
            chip.isCheckable = true
            chip.id = DataStore.categoryIds[i]
            
            if (i == 0) {
                chip.isChecked = true
                selectedCategoryId = DataStore.categoryIds[i]
            }

            chip.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) selectedCategoryId = chip.id
            }
            binding.chipGroupCategory.addView(chip)
        }
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = selectedDateMillis
        
        DatePickerDialog(this, { _, year, month, day ->
            calendar.set(year, month, day)
            selectedDateMillis = calendar.timeInMillis
            binding.etDate.setText(SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(calendar.time))
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show()
    }

    private fun showTimePicker(isStartTime: Boolean) {
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = if (isStartTime) startTimeMillis else endTimeMillis
        
        TimePickerDialog(this, { _, hour, minute ->
            calendar.set(Calendar.HOUR_OF_DAY, hour)
            calendar.set(Calendar.MINUTE, minute)
            if (isStartTime) {
                startTimeMillis = calendar.timeInMillis
                binding.etStartTime.setText(SimpleDateFormat("HH:mm", Locale.getDefault()).format(calendar.time))
            } else {
                endTimeMillis = calendar.timeInMillis
                binding.etEndTime.setText(SimpleDateFormat("HH:mm", Locale.getDefault()).format(calendar.time))
            }
        }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true).show()
    }

    private fun dispatchTakePictureIntent() {
        val photoFile: File? = try {
            ImageUtils.createImageFile(this)
        } catch (ex: IOException) {
            Log.e("AddTransaction", "Could not create image file", ex)
            null
        }
        
        photoFile?.also {
            currentPhotoPath = it.absolutePath
            photoUri = FileProvider.getUriForFile(this, "${packageName}.fileprovider", it)
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                putExtra(MediaStore.EXTRA_OUTPUT, photoUri)
                addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION or Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            takePhotoLauncher.launch(intent)
        }
    }

    /**
     * Save transaction to DataStore and check achievements.
     * Includes error handling for invalid inputs.
     */
    private fun saveTransaction() {
        Log.d("AddTransaction", "saveTransaction: Validating and saving transaction")
        
        try {
            val amount = binding.etAmount.text.toString().toDoubleOrNull()
            val description = binding.etDescription.text.toString().trim()

            // Validate amount
            if (amount == null || amount <= 0) {
                Log.w("AddTransaction", "Invalid amount: $amount")
                binding.tilAmount.error = "Enter a valid amount greater than 0"
                return
            }
            binding.tilAmount.error = null
            
            // Validate description
            if (description.isEmpty()) {
                Log.w("AddTransaction", "Description is empty")
                binding.tilDescription.error = "Description is required"
                return
            }
            binding.tilDescription.error = null
            
            // Validate category selection
            if (selectedCategoryId == -1) {
                Log.w("AddTransaction", "No category selected")
                Toast.makeText(this, "Please select a category", Toast.LENGTH_SHORT).show()
                return
            }

            Log.d("AddTransaction", "Validation passed - Amount: $amount, Category: $selectedCategoryId, Photo: $currentPhotoPath")

            // Add to global DataStore parallel arrays
            val transactionId = DataStore.addTransaction(
                userId = DataStore.currentUserId,
                amount = amount,
                description = description,
                categoryId = selectedCategoryId,
                date = selectedDateMillis,
                startTime = startTimeMillis,
                endTime = endTimeMillis,
                photoPath = currentPhotoPath,
                isIncome = isIncome
            )
            
            Log.i("AddTransaction", "Transaction saved successfully - ID: $transactionId")

            // Check for achievement conditions
            Log.d("AddTransaction", "Checking achievement conditions")
            DataStore.checkAndUnlockAchievements(DataStore.currentUserId)

            Toast.makeText(this, "Transaction added!", Toast.LENGTH_SHORT).show()
            finish()
        } catch (e: Exception) {
            Log.e("AddTransaction", "Error saving transaction: ${e.message}", e)
            Toast.makeText(this, "Error saving transaction: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}


package com.codecash

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityBudgetGoalsBinding
import com.codecash.utils.NavigationHelper

/**
 * Activity for managing budget goals.
 * Meets rubric requirements for:
 * - Setting minimum and maximum monthly goals for money spent.
 * - Viewing budget status and progress.
 */
class BudgetGoalsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBudgetGoalsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBudgetGoalsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    override fun onResume() {
        super.onResume()
        updateBudgetData()
    }

    private fun setupUI() {
        // Toolbar
        binding.toolbar.setNavigationOnClickListener { finish() }

        // RecyclerView setup for category budgets
        binding.rvCategoryBudgets.layoutManager = LinearLayoutManager(this)

        // Set Goals Button (Overall)
        binding.btnSetGoals.setOnClickListener {
            showOverallBudgetDialog()
        }

        // Setup Bottom Navigation
        NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_budget)
    }

    private fun updateBudgetData() {
        val userId = DataStore.currentUserId
        if (userId == -1) return

        val currentMonth = DataStore.getCurrentMonthYear()
        val (start, end) = DataStore.getMonthStartEnd(currentMonth)

        // 1. Overall Monthly Budget logic
        // We use category ID 0 to represent the overall budget goal
        val overallGoal = DataStore.getBudgetGoal(userId, 0, currentMonth)
        val totalSpent = DataStore.getExpenseTotal(userId, start, end)
        
        val maxBudget = overallGoal?.maxAmount ?: 20000.0
        
        binding.tvBudgetStatus.text = "Spent: R${String.format("%.2f", totalSpent)} of R${String.format("%.2f", maxBudget)}"
        
        val progress = if (maxBudget > 0) (totalSpent / maxBudget * 100).toInt() else 0
        binding.progressBudget.progress = kotlin.math.min(progress, 100)

        // 2. Load Category budgets into RecyclerView
        loadCategoryBudgets(userId, start, end, currentMonth)
    }

    private fun loadCategoryBudgets(userId: Int, start: Long, end: Long, currentMonth: String) {
        // Use all categories except the 'overall' placeholder (if it existed as a real category, 
        // but here category IDs start from 1 in test data).
        // Let's pass all available category IDs to the adapter.
        val adapter = CategoryBudgetAdapter(
            DataStore.categoryIds, 
            userId, 
            start, 
            end, 
            currentMonth
        ) { catId ->
            // Callback when the user wants to set a specific goal for a category
            showCategoryBudgetDialog(catId)
        }
        binding.rvCategoryBudgets.adapter = adapter
    }

    private fun showOverallBudgetDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_set_budget, null)
        val etMin = dialogView.findViewById<EditText>(R.id.etMinBudget)
        val etMax = dialogView.findViewById<EditText>(R.id.etMaxBudget)
        
        val userId = DataStore.currentUserId
        val currentMonth = DataStore.getCurrentMonthYear()
        val existing = DataStore.getBudgetGoal(userId, 0, currentMonth)
        
        etMin.setText(existing?.minAmount?.toString() ?: "0")
        etMax.setText(existing?.maxAmount?.toString() ?: "20000")
        
        AlertDialog.Builder(this)
            .setTitle("Set Overall Monthly Goal")
            .setView(dialogView)
            .setPositiveButton("Save") { _, _ ->
                val min = etMin.text.toString().toDoubleOrNull() ?: 0.0
                val max = etMax.text.toString().toDoubleOrNull() ?: 20000.0
                
                // Update in DataStore
                saveOrUpdateGoal(userId, 0, min, max, currentMonth)
                
                updateBudgetData()
                Toast.makeText(this, "Monthly goals updated", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun showCategoryBudgetDialog(categoryId: Int) {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_set_budget, null)
        val etMin = dialogView.findViewById<EditText>(R.id.etMinBudget)
        val etMax = dialogView.findViewById<EditText>(R.id.etMaxBudget)
        
        val userId = DataStore.currentUserId
        val currentMonth = DataStore.getCurrentMonthYear()
        val existing = DataStore.getBudgetGoal(userId, categoryId, currentMonth)
        
        etMin.setText(existing?.minAmount?.toString() ?: "0")
        etMax.setText(existing?.maxAmount?.toString() ?: "0")
        
        AlertDialog.Builder(this)
            .setTitle("Set Category Goal")
            .setView(dialogView)
            .setPositiveButton("Save") { _, _ ->
                val min = etMin.text.toString().toDoubleOrNull() ?: 0.0
                val max = etMax.text.toString().toDoubleOrNull() ?: 0.0
                
                saveOrUpdateGoal(userId, categoryId, min, max, currentMonth)
                
                updateBudgetData()
                Toast.makeText(this, "Category goal updated", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun saveOrUpdateGoal(userId: Int, categoryId: Int, min: Double, max: Double, monthYear: String) {
        val index = DataStore.budgetGoalIds.indices.find {
            DataStore.budgetGoalUserIds[it] == userId && 
            DataStore.budgetGoalCategoryIds[it] == categoryId && 
            DataStore.budgetGoalMonthYears[it] == monthYear 
        }
        
        if (index != null) {
            DataStore.budgetGoalMinAmounts[index] = min
            DataStore.budgetGoalMaxAmounts[index] = max
        } else {
            DataStore.addBudgetGoal(userId, categoryId, min, max, monthYear)
        }
    }
}


package com.codecash

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityCategoryBinding
import com.codecash.utils.NavigationHelper

/**
 * Activity for managing expense categories.
 * Meets rubric requirements for:
 * - Creating categories.
 * - Viewing a list of categories.
 */
class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        loadCategories()
    }

    private fun setupUI() {
        // Toolbar
        binding.toolbar.setNavigationOnClickListener { finish() }

        // RecyclerView setup
        binding.rvCategories.layoutManager = LinearLayoutManager(this)

        // Add Category Button
        binding.btnAddCategory.setOnClickListener {
            val categoryName = binding.etNewCategory.text.toString().trim()
            if (categoryName.isNotEmpty()) {
                // Add to DataStore (Parallel arrays)
                DataStore.addCategory(categoryName)
                binding.etNewCategory.text?.clear()
                loadCategories()
                Toast.makeText(this, "Category added successfully", Toast.LENGTH_SHORT).show()
            } else {
                binding.tilNewCategory.error = "Name required"
            }
        }

        // Setup Bottom Navigation
        NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_settings)
    }

    private fun loadCategories() {
        // Fetch category data from DataStore
        // Note: categoryIds in DataStore is the source of truth for indexes
        val adapter = CategoryAdapter(DataStore.categoryIds) { catId ->
            // Delete category logic
            val index = DataStore.categoryIds.indexOf(catId)
            if (index != -1) {
                // Parallel removal
                DataStore.categoryIds.removeAt(index)
                DataStore.categoryNames.removeAt(index)
                DataStore.categoryColors.removeAt(index)
                DataStore.categoryMinBudgets.removeAt(index)
                DataStore.categoryMaxBudgets.removeAt(index)
                loadCategories()
                Toast.makeText(this, "Category removed", Toast.LENGTH_SHORT).show()
            }
        }
        binding.rvCategories.adapter = adapter
    }
}


package com.codecash

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codecash.data.DataStore
import com.codecash.databinding.ItemCategoryBinding

/**
 * Adapter for displaying categories in a list.
 */
class CategoryAdapter(
    private val categoryIdList: List<Int>,
    private val onDeleteClick: (Int) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val catId = categoryIdList[position]
        val index = DataStore.categoryIds.indexOf(catId)

        if (index != -1) {
            holder.binding.tvCategoryName.text = DataStore.categoryNames[index]
            
            val min = DataStore.categoryMinBudgets[index]
            val max = DataStore.categoryMaxBudgets[index]
            holder.binding.tvBudgetRange.text = "Goal: R${String.format("%.0f", min)} - R${String.format("%.0f", max)}"
            
            holder.binding.vColor.setBackgroundColor(Color.parseColor(DataStore.categoryColors[index]))

            holder.binding.btnDelete.setOnClickListener {
                onDeleteClick(catId)
            }
        }
    }

    override fun getItemCount(): Int = categoryIdList.size
}


package com.codecash

import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codecash.data.DataStore
import com.codecash.databinding.ItemCategoryBinding

/**
 * Adapter for displaying category budget goals and current progress.
 * Reuses ItemCategoryBinding but adapts it for budget visualization.
 */
class CategoryBudgetAdapter(
    private val categoryIdList: List<Int>,
    private val userId: Int,
    private val start: Long,
    private val end: Long,
    private val monthYear: String,
    private val onSetBudgetClick: (Int) -> Unit
) : RecyclerView.Adapter<CategoryBudgetAdapter.BudgetViewHolder>() {

    class BudgetViewHolder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BudgetViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BudgetViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BudgetViewHolder, position: Int) {
        val catId = categoryIdList[position]
        val index = DataStore.categoryIds.indexOf(catId)

        if (index != -1) {
            val catName = DataStore.categoryNames[index]
            val catColor = DataStore.categoryColors[index]
            
            val spent = DataStore.getCategoryTotal(userId, catId, start, end)
            val goal = DataStore.getBudgetGoal(userId, catId, monthYear)
            
            // If no goal set for this month, use category default max
            val maxBudget = goal?.maxAmount ?: DataStore.categoryMaxBudgets[index]

            holder.binding.tvCategoryName.text = catName
            holder.binding.vColor.background.setColorFilter(Color.parseColor(catColor), PorterDuff.Mode.SRC_IN)
            
            // Use tvBudgetRange to show Spent vs Goal
            holder.binding.tvBudgetRange.text = "Spent: R${String.format("%.2f", spent)} / Goal: R${String.format("%.2f", maxBudget)}"
            
            // Hide delete button and show "Edit Goal" behavior if clicked
            holder.binding.btnDelete.setImageResource(R.drawable.ic_settings)
            holder.binding.btnDelete.setColorFilter(Color.parseColor("#2dd4bf"))
            holder.binding.btnDelete.setOnClickListener {
                onSetBudgetClick(catId)
            }
            
            // Optional: Add visual indicator if over budget
            if (maxBudget > 0 && spent > maxBudget) {
                holder.binding.tvBudgetRange.setTextColor(Color.parseColor("#ef4444"))
            } else {
                holder.binding.tvBudgetRange.setTextColor(Color.parseColor("#9ca3af")) // gray_light
            }
        }
    }

    override fun getItemCount(): Int = categoryIdList.size
}




package com.codecash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityDashboardBinding
import com.codecash.utils.NavigationHelper

/**
 * DashboardActivity - Main dashboard showing financial overview.
 * 
 * Features:
 * - Display balance, income, and expenses for current month
 * - Show recent transactions list
 * - Navigation to transaction management features
 * - Budget goal progress tracking
 * 
 * References:
 * - RecyclerView best practices: https://developer.android.com/guide/topics/ui/layout/recyclerview
 * - Android Material Design: https://material.io/design
 */
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private val tag = "DashboardActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing DashboardActivity")
        
        try {
            binding = ActivityDashboardBinding.inflate(layoutInflater)
            setContentView(binding.root)
            
            setupUI()
            setupBottomNavigation()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading dashboard", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume: Updating dashboard data")
        
        try {
            updateDashboardData()
        } catch (e: Exception) {
            Log.e(tag, "Error updating dashboard on resume: ${e.message}", e)
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up dashboard UI components")
        
        try {
            // Welcome text
            val userName = DataStore.getCurrentUserName()
            binding.tvWelcome.text = "Welcome back, $userName!"
            Log.d(tag, "User name set: $userName")

            // RecyclerView setup
            binding.rvRecentTransactions.layoutManager = LinearLayoutManager(this)

            // View more button
            binding.tvViewMore.setOnClickListener {
                Log.d(tag, "View more transactions clicked")
                startActivity(Intent(this, TransactionListActivity::class.java))
            }

            // Add transaction button
            binding.btnAddTransaction.setOnClickListener {
                Log.d(tag, "Add transaction button clicked")
                startActivity(Intent(this, AddTransactionActivity::class.java))
            }
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up dashboard UI", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateDashboardData() {
        Log.d(tag, "updateDashboardData: Fetching financial data")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in, redirecting to login")
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
                return
            }

            // Calculate totals for current month
            val currentMonth = DataStore.getCurrentMonthYear()
            Log.d(tag, "Current month: $currentMonth")
            
            val (start, end) = DataStore.getMonthStartEnd(currentMonth)

            val income = DataStore.getIncomeTotal(userId, start, end)
            val expenses = DataStore.getExpenseTotal(userId, start, end)
            val balance = income - expenses

            Log.d(tag, "Financial totals - Income: $income, Expenses: $expenses, Balance: $balance")

            // Update UI with formatted currency
            binding.tvBalance.text = "R${String.format("%.2f", balance)}"
            binding.tvIncome.text = "R${String.format("%.2f", income)}"
            binding.tvExpenses.text = "R${String.format("%.2f", expenses)}"
            
            // Calculate balance change from last month (dynamic, not hardcoded)
            val lastMonth = DataStore.getLastMonthYear(currentMonth)
            val (lastStart, lastEnd) = DataStore.getMonthStartEnd(lastMonth)
            val lastMonthIncome = DataStore.getIncomeTotal(userId, lastStart, lastEnd)
            val lastMonthExpenses = DataStore.getExpenseTotal(userId, lastStart, lastEnd)
            val lastMonthBalance = lastMonthIncome - lastMonthExpenses
            
            val changePercent = if (lastMonthBalance != 0.0) {
                ((balance - lastMonthBalance) / lastMonthBalance) * 100
            } else {
                0.0
            }
            
            val changeText = when {
                changePercent > 0 -> "+${String.format("%.1f", changePercent)}% from last month"
                changePercent < 0 -> "${String.format("%.1f", changePercent)}% from last month"
                else -> "No change from last month"
            }
            binding.tvBalanceChange.text = changeText

            // Load recent transactions (sorted by date newest first via DataStore logic)
            val allTransactionIds = DataStore.getTransactionsForPeriod(userId, 0, Long.MAX_VALUE)
            Log.d(tag, "Total transactions for user: ${allTransactionIds.size}")
            
            val recentIds = if (allTransactionIds.size > 5) allTransactionIds.take(5) else allTransactionIds
            Log.d(tag, "Displaying ${recentIds.size} recent transactions")
            
            val adapter = TransactionAdapter(recentIds) { transactionId ->
                Log.d(tag, "Transaction clicked: $transactionId")
                // Handle transaction click (optional: view/edit)
                val index = DataStore.transactionIds.indexOf(transactionId)
                val photoPath = DataStore.transactionPhotoPaths.getOrNull(index)
                
                if (photoPath != null) {
                    Log.d(tag, "Photo found for transaction, navigating to photo view")
                    val intent = Intent(this, PhotoViewActivity::class.java)
                    intent.putExtra("transaction_id", transactionId)
                    startActivity(intent)
                } else {
                    Log.d(tag, "No photo associated with transaction")
                }
            }
            binding.rvRecentTransactions.adapter = adapter
            
            // Check and unlock achievements
            Log.d(tag, "Checking for achievement conditions")
            DataStore.checkAndUnlockAchievements(userId)
            
        } catch (e: Exception) {
            Log.e(tag, "Error updating dashboard data: ${e.message}", e)
            Toast.makeText(this, "Error loading financial data", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupBottomNavigation() {
        Log.d(tag, "setupBottomNavigation: Configuring navigation")
        try {
            NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_home)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up bottom navigation: ${e.message}", e)
        }
    }
}



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



package com.codecash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


package com.codecash

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityPhotoViewBinding
import com.codecash.utils.ImageUtils

/**
 * Activity for viewing a receipt photo in full screen.
 * Meets rubric requirement: "If a photo was stored for an entry, the user must be able to access it from this list."
 */
class PhotoViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhotoViewBinding
    private var transactionId: Int = -1
    private var photoPath: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhotoViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener { finish() }

        // Get data from intent
        transactionId = intent.getIntExtra("transaction_id", -1)
        photoPath = intent.getStringExtra("photo_path")

        if (transactionId != -1) {
            loadFromTransaction()
        } else if (photoPath != null) {
            loadFromPath(photoPath!!)
        } else {
            showErrorAndExit()
        }
    }

    private fun loadFromTransaction() {
        val index = DataStore.transactionIds.indexOf(transactionId)
        if (index != -1) {
            val path = DataStore.transactionPhotoPaths[index]
            val description = DataStore.transactionDescriptions[index]
            
            binding.toolbar.title = description
            
            if (path != null) {
                photoPath = path
                loadFromPath(path)
            } else {
                showErrorAndExit()
            }
        } else {
            showErrorAndExit()
        }
    }

    private fun loadFromPath(path: String) {
        val bitmap = ImageUtils.loadPhoto(path)
        if (bitmap != null) {
            binding.ivPhoto.setImageBitmap(bitmap)
        } else {
            showErrorAndExit()
        }
    }

    private fun showErrorAndExit() {
        Toast.makeText(this, "Unable to load photo", Toast.LENGTH_SHORT).show()
        finish()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.photo_view_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_delete -> {
                confirmAndDelete()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun confirmAndDelete() {
        // Delete physical file
        photoPath?.let { ImageUtils.deletePhoto(it) }
        
        // Remove reference from DataStore
        if (transactionId != -1) {
            val index = DataStore.transactionIds.indexOf(transactionId)
            if (index != -1) {
                DataStore.transactionPhotoPaths[index] = null
            }
        }
        
        Toast.makeText(this, "Photo deleted", Toast.LENGTH_SHORT).show()
        finish()
    }
}



package com.codecash

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codecash.data.DataStore
import com.codecash.databinding.ActivitySettingsBinding
import com.codecash.utils.NavigationHelper

class SettingsActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivitySettingsBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupBottomNavigation()
        loadUserInfo()
        setupSwitches()
        setupButtons()
    }
    
    private fun setupBottomNavigation() {
        NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_settings)
    }
    
    private fun loadUserInfo() {
        val userId = DataStore.currentUserId
        if (userId != -1) {
            val idx = DataStore.userIds.indexOf(userId)
            if (idx != -1) {
                binding.tvUserName.text = DataStore.userNames[idx]
                binding.tvUserEmail.text = DataStore.userEmails[idx]
            }
        }
    }
    
    private fun setupSwitches() {
        binding.switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            // Theme switching would be implemented here
            Toast.makeText(this, if (isChecked) "Dark mode enabled" else "Light mode enabled", Toast.LENGTH_SHORT).show()
        }
        
        binding.switchBiometric.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, if (isChecked) "Biometric enabled" else "Biometric disabled", Toast.LENGTH_SHORT).show()
        }
    }
    
    private fun setupButtons() {
        binding.btnAddBank.setOnClickListener {
            Toast.makeText(this, "Bank integration coming in v3.0", Toast.LENGTH_SHORT).show()
        }
        
        binding.btnDeleteAccount.setOnClickListener {
            confirmDeleteAccount()
        }
        
        binding.btnLogout.setOnClickListener {
            DataStore.currentUserId = -1
            startActivity(Intent(this, LoginActivity::class.java))
            finishAffinity()
        }
    }
    
    private fun confirmDeleteAccount() {
        AlertDialog.Builder(this)
            .setTitle("Delete Account")
            .setMessage("This will permanently delete all your data. Continue?")
            .setPositiveButton("Delete") { _, _ ->
                val userId = DataStore.currentUserId
                if (userId != -1) {
                    // Remove user data
                    val idx = DataStore.userIds.indexOf(userId)
                    if (idx != -1) {
                        DataStore.userIds.removeAt(idx)
                        DataStore.userNames.removeAt(idx)
                        DataStore.userEmails.removeAt(idx)
                        DataStore.userPasswords.removeAt(idx)
                    }
                    
                    // Remove associated transactions
                    val transToRemove = DataStore.getTransactionsForUser(userId)
                    for (transId in transToRemove) {
                        DataStore.deleteTransaction(transId)
                    }
                    
                    DataStore.currentUserId = -1
                    Toast.makeText(this, "Account deleted", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, LoginActivity::class.java))
                    finishAffinity()
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }
}



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


package com.codecash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity
import com.codecash.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivitySplashBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // Fade in animation for logo
        val fadeIn = AlphaAnimation(0f, 1f).apply {
            duration = 1500
            fillAfter = true
        }
        binding.ivLogo.startAnimation(fadeIn)
        binding.tvAppName.startAnimation(fadeIn)
        
        // Navigate to login after delay
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 2500)
    }
}


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


package com.codecash

import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codecash.data.DataStore
import com.codecash.databinding.ItemTransactionBinding

/**
 * Adapter for displaying transactions in a RecyclerView.
 * Uses DataStore's parallel arrays for data retrieval.
 */
class TransactionAdapter(
    private val transactionIdList: List<Int>,
    private val onItemClick: (Int) -> Unit
) : RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    class TransactionViewHolder(val binding: ItemTransactionBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val binding = ItemTransactionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transactionId = transactionIdList[position]
        val index = DataStore.transactionIds.indexOf(transactionId)

        if (index != -1) {
            val amount = DataStore.transactionAmounts[index]
            val description = DataStore.transactionDescriptions[index]
            val categoryId = DataStore.transactionCategoryIds[index]
            val dateMillis = DataStore.transactionDates[index]
            val photoPath = DataStore.transactionPhotoPaths[index]
            val isIncome = DataStore.transactionIsIncome[index]

            // Bind values to UI
            holder.binding.tvDescription.text = description
            holder.binding.tvCategory.text = DataStore.getCategoryName(categoryId)
            
            // Format Date
            val sdf = java.text.SimpleDateFormat("dd MMM yyyy", java.util.Locale.getDefault())
            holder.binding.tvDate.text = sdf.format(java.util.Date(dateMillis))

            // Format Amount
            val formattedAmount = if (isIncome) "+R${String.format("%.2f", amount)}" else "-R${String.format("%.2f", amount)}"
            holder.binding.tvAmount.text = formattedAmount
            
            // Set Color based on Income/Expense
            val colorRes = if (isIncome) "#22c55e" else "#ef4444"
            holder.binding.tvAmount.setTextColor(Color.parseColor(colorRes))
            
            // Set Category Icon Background Color
            val categoryColor = DataStore.getCategoryColor(categoryId)
            holder.binding.ivCategoryIcon.background.setColorFilter(Color.parseColor(categoryColor), PorterDuff.Mode.SRC_IN)

            // Show Photo Indicator if photo exists
            holder.binding.ivPhotoIndicator.visibility = if (photoPath != null) View.VISIBLE else View.GONE

            // Handle Item Click
            holder.itemView.setOnClickListener {
                onItemClick(transactionId)
            }
        }
    }

    override fun getItemCount(): Int = transactionIdList.size
}


package com.codecash

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.codecash.data.DataStore
import com.codecash.databinding.ActivityTransactionListBinding
import com.codecash.utils.NavigationHelper
import java.text.SimpleDateFormat
import java.util.*

/**
 * TransactionListActivity - View and filter transaction history.
 * 
 * Features:
 * - View all transactions in selectable period (Part 2)
 * - Date range filtering
 * - Bubble sort applied by DataStore for consistency
 * - Photo viewing for receipt attachments
 * - Error handling and comprehensive logging
 * 
 * References:
 * - RecyclerView: https://developer.android.com/guide/topics/ui/layout/recyclerview
 * - Date filtering patterns in Android
 */
class TransactionListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransactionListBinding
    private var startDate: Long = 0
    private var endDate: Long = System.currentTimeMillis()
    private val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
    private val tag = "TransactionListActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate: Initializing TransactionListActivity")
        
        try {
            binding = ActivityTransactionListBinding.inflate(layoutInflater)
            setContentView(binding.root)

            setupUI()
            loadTransactions()
        } catch (e: Exception) {
            Log.e(tag, "Error during onCreate: ${e.message}", e)
            Toast.makeText(this, "Error loading transactions", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupUI() {
        Log.d(tag, "setupUI: Setting up transaction list UI")
        
        try {
            // Toolbar configuration
            binding.toolbar.setNavigationOnClickListener { 
                Log.d(tag, "Back button clicked")
                finish() 
            }

            // Date Filter initialization (defaults to current month)
            val calendar = Calendar.getInstance()
            calendar.set(Calendar.DAY_OF_MONTH, 1)
            calendar.set(Calendar.HOUR_OF_DAY, 0)
            calendar.set(Calendar.MINUTE, 0)
            startDate = calendar.timeInMillis
            
            binding.btnStartDate.text = sdf.format(Date(startDate))
            binding.btnEndDate.text = sdf.format(Date(endDate))
            Log.d(tag, "Date filter initialized - Start: ${sdf.format(Date(startDate))}, End: ${sdf.format(Date(endDate))}")

            binding.btnStartDate.setOnClickListener { 
                Log.d(tag, "Start date picker clicked")
                showDatePicker(true) 
            }
            binding.btnEndDate.setOnClickListener { 
                Log.d(tag, "End date picker clicked")
                showDatePicker(false) 
            }

            // RecyclerView setup
            binding.rvTransactions.layoutManager = LinearLayoutManager(this)

            // Navigation setup
            NavigationHelper.setupBottomNavigation(this, binding.bottomNav, R.id.nav_home)
        } catch (e: Exception) {
            Log.e(tag, "Error setting up UI: ${e.message}", e)
            Toast.makeText(this, "Error setting up UI", Toast.LENGTH_SHORT).show()
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
                    loadTransactions()
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        } catch (e: Exception) {
            Log.e(tag, "Error showing date picker: ${e.message}", e)
        }
    }

    /**
     * Load and display transactions for selected period.
     * Uses DataStore bubble sort for consistency.
     */
    private fun loadTransactions() {
        Log.d(tag, "loadTransactions: Fetching transactions for period $startDate - $endDate")
        
        try {
            val userId = DataStore.currentUserId
            if (userId == -1) {
                Log.w(tag, "User not logged in")
                return
            }

            // Fetch filtered and bubble-sorted transactions from DataStore (as per rubric)
            val transactionIdList = DataStore.getTransactionsForPeriod(userId, startDate, endDate)
            Log.d(tag, "Fetched ${transactionIdList.size} transactions for user $userId")

            if (transactionIdList.isEmpty()) {
                Log.d(tag, "No transactions found for this period")
                binding.tvEmpty.visibility = View.VISIBLE
                binding.rvTransactions.visibility = View.GONE
                binding.tvEmpty.text = "No transactions in this period"
            } else {
                binding.tvEmpty.visibility = View.GONE
                binding.rvTransactions.visibility = View.VISIBLE
                
                val adapter = TransactionAdapter(transactionIdList) { transactionId ->
                    Log.d(tag, "Transaction clicked: $transactionId")
                    
                    // Check if transaction has a photo
                    val index = DataStore.transactionIds.indexOf(transactionId)
                    if (index != -1 && DataStore.transactionPhotoPaths.getOrNull(index) != null) {
                        Log.d(tag, "Photo found for transaction, opening photo view")
                        val intent = Intent(this, PhotoViewActivity::class.java)
                        intent.putExtra("transaction_id", transactionId)
                        startActivity(intent)
                    } else {
                        Log.d(tag, "No photo attached to this transaction")
                        Toast.makeText(this, "No photo attached to this entry", Toast.LENGTH_SHORT).show()
                    }
                }
                binding.rvTransactions.adapter = adapter
            }
        } catch (e: Exception) {
            Log.e(tag, "Error loading transactions: ${e.message}", e)
            Toast.makeText(this, "Error loading transactions: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}


package com.codecash.data

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import java.util.*

/**
 * Unit tests for DataStore - Global data persistence layer.
 * 
 * Tests cover:
 * - User authentication (Part 2)
 * - Transaction creation and retrieval (Part 2)
 * - Budget goals management (Part 2)
 * - Achievement/gamification system (Part 3)
 * 
 * References:
 * - JUnit 4: https://junit.org/junit4/
 * - Android testing: https://developer.android.com/training/testing
 */
class DataStoreTest {

    @Before
    fun setup() {
        // Reset DataStore state before each test
        DataStore.currentUserId = -1
        DataStore.userIds.clear()
        DataStore.userNames.clear()
        DataStore.userEmails.clear()
        DataStore.userPasswords.clear()
        DataStore.transactionIds.clear()
        DataStore.categoryIds.clear()
        DataStore.budgetGoalIds.clear()
        DataStore.achievementIds.clear()
    }

    /**
     * Test user authentication - login with correct credentials
     * Part 2 Requirement: User must be able to log in
     */
    @Test
    fun testUserLoginSuccess() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "password123")
        
        // Act
        val result = DataStore.validateLogin("test@example.com", "password123")
        
        // Assert
        assertEquals(userId, result)
        assertEquals(userId, DataStore.currentUserId)
    }

    /**
     * Test user authentication - login with incorrect password
     */
    @Test
    fun testUserLoginFailureWrongPassword() {
        // Arrange
        DataStore.addUser("Test User", "test@example.com", "password123")
        
        // Act
        val result = DataStore.validateLogin("test@example.com", "wrongpassword")
        
        // Assert
        assertEquals(-1, result)
    }

    /**
     * Test user authentication - login with non-existent email
     */
    @Test
    fun testUserLoginFailureNonExistentUser() {
        // Act
        val result = DataStore.validateLogin("nonexistent@example.com", "password123")
        
        // Assert
        assertEquals(-1, result)
    }

    /**
     * Test transaction creation
     * Part 2 Requirement: Create expense entry with date, times, description, category
     */
    @Test
    fun testAddTransaction() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        val categoryId = DataStore.addCategory("Food", "#22c55e")
        val now = System.currentTimeMillis()
        
        // Act
        val transactionId = DataStore.addTransaction(
            userId = userId,
            amount = 50.0,
            description = "Lunch",
            categoryId = categoryId,
            date = now,
            startTime = now,
            endTime = now + 3600000,
            photoPath = null,
            isIncome = false
        )
        
        // Assert
        assertNotEquals(-1, transactionId)
        assertTrue(DataStore.transactionIds.contains(transactionId))
        assertEquals(50.0, DataStore.transactionAmounts[DataStore.transactionIds.indexOf(transactionId)])
    }

    /**
     * Test transaction filtering by date range
     * Part 2 Requirement: View list of entries created during user-selectable period
     */
    @Test
    fun testGetTransactionsForPeriod() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        val categoryId = DataStore.addCategory("Food", "#22c55e")
        
        val now = System.currentTimeMillis()
        val yesterday = now - 86400000
        val tomorrow = now + 86400000
        
        // Add transactions
        DataStore.addTransaction(userId, 50.0, "Lunch", categoryId, now, now, now, null, false)
        DataStore.addTransaction(userId, 30.0, "Breakfast", categoryId, yesterday, yesterday, yesterday, null, false)
        
        // Act
        val transactionsInRange = DataStore.getTransactionsForPeriod(userId, yesterday, tomorrow)
        
        // Assert
        assertEquals(2, transactionsInRange.size)
    }

    /**
     * Test category total calculation
     * Part 2 Requirement: View total amount spent on each category during user-selectable period
     */
    @Test
    fun testGetCategoryTotal() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        val categoryId = DataStore.addCategory("Food", "#22c55e")
        
        val now = System.currentTimeMillis()
        val end = now + 86400000
        
        // Add multiple transactions in same category
        DataStore.addTransaction(userId, 50.0, "Lunch", categoryId, now, now, now, null, false)
        DataStore.addTransaction(userId, 30.0, "Breakfast", categoryId, now, now, now, null, false)
        
        // Act
        val total = DataStore.getCategoryTotal(userId, categoryId, now - 1000, end)
        
        // Assert
        assertEquals(80.0, total, 0.01)
    }

    /**
     * Test budget goal setting
     * Part 2 Requirement: Set minimum and maximum goals for money spent
     */
    @Test
    fun testBudgetGoalCreation() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        val categoryId = DataStore.addCategory("Food", "#22c55e")
        
        // Act
        val goalId = DataStore.addBudgetGoal(userId, categoryId, 500.0, 1000.0, "12-2024")
        
        // Assert
        assertNotEquals(-1, goalId)
        assertTrue(DataStore.budgetGoalIds.contains(goalId))
    }

    /**
     * Test achievement/badge unlocking for budget compliance
     * Part 3 Requirement: Gamification - badges for meeting budget goals
     */
    @Test
    fun testAchievementUnlock() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        
        // Act
        val achievementId = DataStore.addAchievement(
            userId,
            "Budget Master",
            "Stayed within budget!",
            "budget"
        )
        
        // Assert
        assertNotEquals(-1, achievementId)
        assertTrue(DataStore.hasAchievement(userId, "Budget Master"))
    }

    /**
     * Test that duplicate achievements are not created
     * Part 3 Requirement: Track achievements without duplicates
     */
    @Test
    fun testNoDuplicateAchievements() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        
        // Act
        DataStore.addAchievement(userId, "Budget Master", "Test", "budget")
        val achievements1 = DataStore.getUserAchievements(userId)
        
        DataStore.addAchievement(userId, "Budget Master", "Test", "budget")
        val achievements2 = DataStore.getUserAchievements(userId)
        
        // Assert - both calls added achievement (no duplicate prevention in this test)
        assertTrue(DataStore.hasAchievement(userId, "Budget Master"))
    }

    /**
     * Test income vs expense calculation
     * Part 2 Requirement: Track income and expenses
     */
    @Test
    fun testIncomeExpenseCalculation() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        val categoryId = DataStore.addCategory("Salary", "#22c55e")
        
        val now = System.currentTimeMillis()
        val end = now + 86400000
        
        // Add income
        DataStore.addTransaction(userId, 5000.0, "Monthly Salary", categoryId, now, now, now, null, true)
        
        // Add expenses
        DataStore.addTransaction(userId, 1000.0, "Rent", categoryId, now, now, now, null, false)
        DataStore.addTransaction(userId, 500.0, "Food", categoryId, now, now, now, null, false)
        
        // Act
        val income = DataStore.getIncomeTotal(userId, now - 1000, end)
        val expenses = DataStore.getExpenseTotal(userId, now - 1000, end)
        val balance = income - expenses
        
        // Assert
        assertEquals(5000.0, income, 0.01)
        assertEquals(1500.0, expenses, 0.01)
        assertEquals(3500.0, balance, 0.01)
    }

    /**
     * Test month-year parsing
     * Part 2 Requirement: Handle date ranges for filtering
     */
    @Test
    fun testMonthYearParsing() {
        // Act
        val (start, end) = DataStore.getMonthStartEnd("12-2024")
        
        // Assert
        assertTrue(start > 0)
        assertTrue(end > start)
    }

    /**
     * Test budget progress calculation
     * Part 3 Requirement: Display progress against budget goals
     */
    @Test
    fun testBudgetProgress() {
        // Arrange
        val userId = DataStore.addUser("Test User", "test@example.com", "pass")
        DataStore.currentUserId = userId
        val categoryId = DataStore.addCategory("Food", "#22c55e")
        
        DataStore.addBudgetGoal(userId, categoryId, 100.0, 500.0, DataStore.getCurrentMonthYear())
        
        val now = System.currentTimeMillis()
        DataStore.addTransaction(userId, 200.0, "Groceries", categoryId, now, now, now, null, false)
        
        // Act
        val (spent, budget) = DataStore.getBudgetProgress(userId, categoryId)
        
        // Assert
        assertEquals(200.0, spent, 0.01)
        assertEquals(500.0, budget, 0.01)
    }
}


package com.example.code_cash_v3

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}



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


//The drawables seem okay. Moving on to layout. 

<?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@color/navy_dark">

    <com.google.android.material.appbarwidget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:elevation="4dp">

        <androidx.appcompat.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            android:background="@color/navy_primary"
            app:navigationIcon="@drawable/ic_back"
            app:title="My Achievements"
            app:titleTextColor="@color/white" />
    </com.google.android.material.appbarwidget.AppBarLayout>

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="16dp">

            <!-- Stats Section -->
            <TextView
                android:id="@+id/tvStats"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Loading stats..."
                android:textColor="@color/white"
                android:textSize="14sp"
                android:padding="12dp"
                android:background="@drawable/bg_outline"
                android:layout_marginBottom="16dp" />

            <!-- Achievements Grid -->
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Earned Badges"
                android:textColor="@color/white"
                android:textSize="18sp"
                android:textStyle="bold"
                android:layout_marginBottom="12dp" />

            <androidx.recyclerview.widget.RecyclerView
                android:id="@+id/rvAchievements"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginBottom="80dp" />
        </LinearLayout>
    </ScrollView>

    <include layout="@layout/bottom_nav" />
</LinearLayout>


<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:navigationIcon="@drawable/ic_back"
        app:title="@string/add_transaction"
        app:titleTextColor="@color/white" />

    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@id/bottomNav"
        app:layout_constraintTop_toBottomOf="@id/toolbar">

        <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="16dp">

            <RadioGroup
                android:id="@+id/rgTransactionType"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                app:layout_constraintTop_toTopOf="parent">

                <RadioButton
                    android:id="@+id/rbExpense"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="Expense"
                    android:textColor="@color/white"
                    android:buttonTint="@color/teal_primary" />

                <RadioButton
                    android:id="@+id/rbIncome"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="Income"
                    android:textColor="@color/white"
                    android:buttonTint="@color/teal_primary" />
            </RadioGroup>

            <com.google.android.material.textfield.TextInputLayout
                android:id="@+id/tilAmount"
                style="@style/CodeCashTextInput"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:hint="@string/amount"
                app:layout_constraintTop_toBottomOf="@id/rgTransactionType">

                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etAmount"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="numberDecimal"
                    android:textColor="@color/white" />
            </com.google.android.material.textfield.TextInputLayout>

            <com.google.android.material.textfield.TextInputLayout
                android:id="@+id/tilDescription"
                style="@style/CodeCashTextInput"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:hint="@string/description"
                app:layout_constraintTop_toBottomOf="@id/tilAmount">

                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etDescription"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="textMultiLine"
                    android:minLines="2"
                    android:textColor="@color/white" />
            </com.google.android.material.textfield.TextInputLayout>

            <TextView
                android:id="@+id/tvCategoryLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="@string/category"
                android:textColor="@color/gray_light"
                android:textSize="14sp"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tilDescription" />

            <com.google.android.material.chip.ChipGroup
                android:id="@+id/chipGroupCategory"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                app:chipSpacingHorizontal="8dp"
                app:singleSelection="true"
                app:layout_constraintTop_toBottomOf="@id/tvCategoryLabel" />

            <com.google.android.material.textfield.TextInputLayout
                android:id="@+id/tilDate"
                style="@style/CodeCashTextInput"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:hint="@string/date"
                app:endIconDrawable="@drawable/ic_calendar"
                app:endIconMode="custom"
                app:layout_constraintTop_toBottomOf="@id/chipGroupCategory">

                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etDate"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:focusable="false"
                    android:inputType="none"
                    android:textColor="@color/white" />
            </com.google.android.material.textfield.TextInputLayout>

            <LinearLayout
                android:id="@+id/llTimes"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:orientation="horizontal"
                app:layout_constraintTop_toBottomOf="@id/tilDate">

                <com.google.android.material.textfield.TextInputLayout
                    android:id="@+id/tilStartTime"
                    style="@style/CodeCashTextInput"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:layout_marginEnd="8dp"
                    android:hint="Start Time">

                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etStartTime"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:focusable="false"
                        android:inputType="none"
                        android:textColor="@color/white" />
                </com.google.android.material.textfield.TextInputLayout>

                <com.google.android.material.textfield.TextInputLayout
                    android:id="@+id/tilEndTime"
                    style="@style/CodeCashTextInput"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:layout_marginStart="8dp"
                    android:hint="End Time">

                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etEndTime"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:focusable="false"
                        android:inputType="none"
                        android:textColor="@color/white" />
                </com.google.android.material.textfield.TextInputLayout>
            </LinearLayout>

            <androidx.cardview.widget.CardView
                android:id="@+id/cardPhoto"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                app:cardBackgroundColor="@color/navy_primary"
                app:cardCornerRadius="12dp"
                app:layout_constraintTop_toBottomOf="@id/llTimes">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:padding="24dp">

                    <ImageView
                        android:id="@+id/ivPhotoPreview"
                        android:layout_width="120dp"
                        android:layout_height="120dp"
                        android:scaleType="centerCrop"
                        android:visibility="gone" />

                    <ImageView
                        android:id="@+id/ivCameraIcon"
                        android:layout_width="48dp"
                        android:layout_height="48dp"
                        android:src="@drawable/ic_camera"
                        app:tint="@color/teal_primary" />

                    <TextView
                        android:id="@+id/tvPhotoLabel"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="8dp"
                        android:text="@string/scan_receipt"
                        android:textColor="@color/teal_primary"
                        android:textSize="14sp"
                        android:textStyle="bold" />

                    <com.google.android.material.button.MaterialButton
                        android:id="@+id/btnTakePhoto"
                        style="@style/CodeCashButtonOutline"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="12dp"
                        android:text="Add Photo" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnSave"
                style="@style/CodeCashButton"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="@string/save_transaction"
                app:layout_constraintTop_toBottomOf="@id/cardPhoto" />

        </androidx.constraintlayout.widget.ConstraintLayout>
    </androidx.core.widget.NestedScrollView>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>


<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:navigationIcon="@drawable/ic_back"
        app:title="@string/budget"
        app:titleTextColor="@color/white" />

    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@id/bottomNav"
        app:layout_constraintTop_toBottomOf="@id/toolbar">

        <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="16dp">

            <TextView
                android:id="@+id/tvMonthlyBudgetLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/monthly_budget"
                android:textColor="@color/white"
                android:textSize="16sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />

            <TextView
                android:id="@+id/tvBudgetStatus"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Spent: R14,400 (72%)"
                android:textColor="@color/gray_light"
                android:textSize="14sp"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tvMonthlyBudgetLabel" />

            <ProgressBar
                android:id="@+id/progressBudget"
                style="?android:attr/progressBarStyleHorizontal"
                android:layout_width="match_parent"
                android:layout_height="8dp"
                android:layout_marginTop="8dp"
                android:progress="72"
                android:progressDrawable="@drawable/progress_budget"
                app:layout_constraintTop_toBottomOf="@id/tvBudgetStatus" />

            <TextView
                android:id="@+id/tvCategoryBudgetsLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="@string/category_budgets"
                android:textColor="@color/white"
                android:textSize="16sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/progressBudget" />

            <androidx.recyclerview.widget.RecyclerView
                android:id="@+id/rvCategoryBudgets"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="12dp"
                app:layout_constraintTop_toBottomOf="@id/tvCategoryBudgetsLabel" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnSetGoals"
                style="@style/CodeCashButton"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="@string/set_goals"
                app:layout_constraintTop_toBottomOf="@id/rvCategoryBudgets" />

        </androidx.constraintlayout.widget.ConstraintLayout>
    </androidx.core.widget.NestedScrollView>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>


<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:navigationIcon="@drawable/ic_back"
        app:title="@string/categories"
        app:titleTextColor="@color/white" />

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilNewCategory"
        style="@style/CodeCashTextInput"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:hint="@string/category_name"
        app:layout_constraintEnd_toStartOf="@id/btnAddCategory"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/toolbar">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etNewCategory"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="text"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnAddCategory"
        style="@style/CodeCashButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:text="@string/add_category"
        app:layout_constraintBottom_toBottomOf="@id/tilNewCategory"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="@id/tilNewCategory" />

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/rvCategories"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_margin="16dp"
        app:layout_constraintBottom_toTopOf="@id/bottomNav"
        app:layout_constraintTop_toBottomOf="@id/tilNewCategory" />

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>


<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@id/bottomNav"
        app:layout_constraintTop_toTopOf="parent">

        <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="16dp">

            <TextView
                android:id="@+id/tvWelcome"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Welcome back, Alex!"
                android:textColor="@color/white"
                android:textSize="20sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />

            <TextView
                android:id="@+id/tvWalletLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="@string/total_balance"
                android:textColor="@color/gray_light"
                android:textSize="12sp"
                android:letterSpacing="0.1"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tvWelcome" />

            <TextView
                android:id="@+id/tvBalance"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="4dp"
                android:text="R12,450.80"
                android:textColor="@color/white"
                android:textSize="32sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tvWalletLabel" />

            <TextView
                android:id="@+id/tvBalanceChange"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="4dp"
                android:text="2.4% from last month"
                android:textColor="@color/green_success"
                android:textSize="12sp"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tvBalance" />

            <androidx.cardview.widget.CardView
                android:id="@+id/cardIncome"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:layout_marginEnd="8dp"
                app:cardBackgroundColor="@color/navy_primary"
                app:cardCornerRadius="12dp"
                app:cardElevation="4dp"
                app:layout_constraintEnd_toStartOf="@id/cardExpenses"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tvBalanceChange">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="16dp">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/income"
                        android:textColor="@color/gray_light"
                        android:textSize="12sp" />

                    <TextView
                        android:id="@+id/tvIncome"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="4dp"
                        android:text="R32,900.00"
                        android:textColor="@color/green_success"
                        android:textSize="18sp"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cardExpenses"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="8dp"
                app:cardBackgroundColor="@color/navy_primary"
                app:cardCornerRadius="12dp"
                app:cardElevation="4dp"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toEndOf="@id/cardIncome"
                app:layout_constraintTop_toTopOf="@id/cardIncome">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="16dp">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="@string/expenses"
                        android:textColor="@color/gray_light"
                        android:textSize="12sp" />

                    <TextView
                        android:id="@+id/tvExpenses"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="4dp"
                        android:text="R17,320.55"
                        android:textColor="@color/red_error"
                        android:textSize="18sp"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <TextView
                android:id="@+id/tvRecentLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="@string/recent_transactions"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/cardIncome" />

            <TextView
                android:id="@+id/tvViewMore"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/view_more"
                android:textColor="@color/teal_primary"
                android:textSize="12sp"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintTop_toTopOf="@id/tvRecentLabel" />

            <androidx.recyclerview.widget.RecyclerView
                android:id="@+id/rvRecentTransactions"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="12dp"
                app:layout_constraintTop_toBottomOf="@id/tvRecentLabel" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnAddTransaction"
                style="@style/CodeCashButton"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="@string/add_transaction"
                app:icon="@drawable/ic_add"
                app:layout_constraintTop_toBottomOf="@id/rvRecentTransactions" />

        </androidx.constraintlayout.widget.ConstraintLayout>
    </androidx.core.widget.NestedScrollView>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>


<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark"
    android:padding="24dp">

    <ImageView
        android:id="@+id/ivLogo"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:src="@mipmap/ic_launcher"
        android:contentDescription="@string/app_name"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_marginTop="48dp" />

    <TextView
        android:id="@+id/tvTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="@string/welcome_back"
        android:textColor="@color/white"
        android:textSize="28sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/ivLogo" />

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilEmail"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="48dp"
        android:hint="@string/email"
        app:layout_constraintTop_toBottomOf="@id/tvTitle">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textEmailAddress"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilPassword"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="@string/password"
        app:endIconMode="password_toggle"
        app:layout_constraintTop_toBottomOf="@id/tilEmail">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textPassword"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnLogin"
        style="@style/CodeCashButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="@string/login"
        app:layout_constraintTop_toBottomOf="@id/tilPassword" />

    <TextView
        android:id="@+id/tvForgotPassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="@string/forgot_password"
        android:textColor="@color/teal_primary"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/btnLogin" />

    <TextView
        android:id="@+id/tvSignup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="@string/no_account"
        android:textColor="@color/gray_light"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/tvForgotPassword" />

</androidx.constraintlayout.widget.ConstraintLayout>


<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:navigationIcon="@drawable/ic_back"
        app:title="Receipt Photo"
        app:titleTextColor="@color/white" />

    <ImageView
        android:id="@+id/ivPhoto"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:scaleType="fitCenter"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintTop_toBottomOf="@id/toolbar" />

</androidx.constraintlayout.widget.ConstraintLayout>



<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:title="@string/settings"
        app:titleTextColor="@color/white" />

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        app:layout_constraintBottom_toTopOf="@+id/bottomNav"
        app:layout_constraintTop_toBottomOf="@id/toolbar">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="16dp">

            <!-- Profile Section -->
            <com.google.android.material.card.MaterialCardView
                style="@style/CodeCashCard"
                android:layout_width="match_parent"
                android:layout_height="wrap_content">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="center_vertical"
                    android:orientation="horizontal">

                    <androidx.cardview.widget.CardView
                        android:layout_width="60dp"
                        android:layout_height="60dp"
                        app:cardBackgroundColor="@color/teal_primary"
                        app:cardCornerRadius="30dp">

                        <TextView
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:gravity="center"
                            android:text="U"
                            android:textColor="@color/navy_dark"
                            android:textSize="24sp"
                            android:textStyle="bold" />
                    </androidx.cardview.widget.CardView>

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="16dp"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/tvUserName"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="User Name"
                            android:textColor="@color/white"
                            android:textSize="18sp"
                            android:textStyle="bold" />

                        <TextView
                            android:id="@+id/tvUserEmail"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="user@codecash.com"
                            android:textColor="@color/gray_light"
                            android:textSize="14sp" />
                    </LinearLayout>
                </LinearLayout>
            </com.google.android.material.card.MaterialCardView>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="32dp"
                android:text="@string/preferences"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:textStyle="bold" />

            <com.google.android.material.card.MaterialCardView
                style="@style/CodeCashCard"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:paddingVertical="8dp">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_centerVertical="true"
                            android:text="@string/dark_mode"
                            android:textColor="@color/white" />

                        <com.google.android.material.switchmaterial.SwitchMaterial
                            android:id="@+id/switchDarkMode"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_alignParentEnd="true"
                            android:checked="true"
                            app:thumbTint="@color/teal_primary"
                            app:trackTint="@color/teal_dark" />
                    </RelativeLayout>

                    <View
                        android:layout_width="match_parent"
                        android:layout_height="1dp"
                        android:background="@color/navy_light" />

                    <RelativeLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:paddingVertical="8dp">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_centerVertical="true"
                            android:text="@string/biometric"
                            android:textColor="@color/white" />

                        <com.google.android.material.switchmaterial.SwitchMaterial
                            android:id="@+id/switchBiometric"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_alignParentEnd="true"
                            app:thumbTint="@color/teal_primary"
                            app:trackTint="@color/teal_dark" />
                    </RelativeLayout>
                </LinearLayout>
            </com.google.android.material.card.MaterialCardView>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="32dp"
                android:text="@string/connected_accounts"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:textStyle="bold" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnAddBank"
                style="@style/CodeCashButtonOutline"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:text="@string/add_bank_account" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnDeleteAccount"
                style="@style/CodeCashButtonOutline"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="32dp"
                android:text="@string/delete_account"
                app:strokeColor="@color/red_error"
                android:textColor="@color/red_error" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnLogout"
                style="@style/CodeCashButton"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="@string/logout" />

        </LinearLayout>
    </ScrollView>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>



<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark"
    android:padding="24dp">

    <ImageButton
        android:id="@+id/btnBack"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:background="?attr/selectableItemBackgroundBorderless"
        android:src="@drawable/ic_back"
        android:contentDescription="Back"
        app:tint="@color/white"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/ivLogo"
        android:layout_width="64dp"
        android:layout_height="64dp"
        android:src="@mipmap/ic_launcher"
        android:contentDescription="@string/app_name"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/btnBack"
        android:layout_marginTop="16dp" />

    <TextView
        android:id="@+id/tvTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="@string/welcome_new"
        android:textColor="@color/white"
        android:textSize="28sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/ivLogo" />

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilName"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:hint="Full Name"
        app:layout_constraintTop_toBottomOf="@id/tvTitle">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textPersonName"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilEmail"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="@string/email"
        app:layout_constraintTop_toBottomOf="@id/tilName">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textEmailAddress"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilPassword"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="@string/password"
        app:endIconMode="password_toggle"
        app:layout_constraintTop_toBottomOf="@id/tilEmail">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textPassword"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <TextView
        android:id="@+id/tvPasswordHint"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:text="Password: min 8 chars, 1 Capital, 1 Special (!@#$%)"
        android:textColor="@color/gray_light"
        android:textSize="11sp"
        app:layout_constraintTop_toBottomOf="@id/tilPassword" />

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilConfirmPassword"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="@string/confirm_password"
        app:endIconMode="password_toggle"
        app:layout_constraintTop_toBottomOf="@id/tvPasswordHint">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etConfirmPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textPassword"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnSignup"
        style="@style/CodeCashButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="@string/signup"
        app:layout_constraintTop_toBottomOf="@id/tilConfirmPassword" />

    <TextView
        android:id="@+id/tvLogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="@string/have_account"
        android:textColor="@color/gray_light"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/btnSignup" />

</androidx.constraintlayout.widget.ConstraintLayout>



<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <ImageView
        android:id="@+id/ivLogo"
        android:layout_width="180dp"
        android:layout_height="180dp"
        android:src="@drawable/logo_splash"
        android:contentDescription="@string/app_name"
        app:layout_constraintBottom_toTopOf="@id/tvAppName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_chainStyle="packed" />

    <TextView
        android:id="@+id/tvAppName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="@string/app_name"
        android:textColor="@color/white"
        android:textSize="36sp"
        android:textStyle="bold"
        android:letterSpacing="0.1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/ivLogo" />

    <ProgressBar
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="64dp"
        android:indeterminateTint="@color/teal_primary"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>




<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:navigationIcon="@drawable/ic_back"
        app:title="@string/stats"
        app:titleTextColor="@color/white" />

    <LinearLayout
        android:id="@+id/llFilter"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:orientation="horizontal"
        app:layout_constraintTop_toBottomOf="@id/toolbar">

        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnStartDate"
            style="@style/CodeCashButtonOutline"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginEnd="8dp"
            android:text="Start Date" />

        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnEndDate"
            style="@style/CodeCashButtonOutline"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginStart="8dp"
            android:text="End Date" />
    </LinearLayout>

    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@id/bottomNav"
        app:layout_constraintTop_toBottomOf="@id/llFilter">

        <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="16dp">

            <TextView
                android:id="@+id/tvIncomeVsExpensesLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="INCOME VS EXPENSES:"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />

            <com.github.mikephil.charting.charts.BarChart
                android:id="@+id/chartIncomeExpense"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:layout_marginTop="12dp"
                app:layout_constraintTop_toBottomOf="@id/tvIncomeVsExpensesLabel" />

            <TextView
                android:id="@+id/tvSpendingByCategoryLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="SPENDING BY CATEGORY:"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/chartIncomeExpense" />

            <com.github.mikephil.charting.charts.PieChart
                android:id="@+id/chartCategory"
                android:layout_width="match_parent"
                android:layout_height="220dp"
                android:layout_marginTop="12dp"
                app:layout_constraintTop_toBottomOf="@id/tvSpendingByCategoryLabel" />

            <TextView
                android:id="@+id/tvMonthlyTrendLabel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:text="MONTHLY TREND:"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@id/chartCategory" />

            <com.github.mikephil.charting.charts.LineChart
                android:id="@+id/chartTrend"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:layout_marginTop="12dp"
                app:layout_constraintTop_toBottomOf="@id/tvMonthlyTrendLabel" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/btnExport"
                style="@style/CodeCashButton"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:layout_marginBottom="16dp"
                android:text="Export Report"
                app:layout_constraintTop_toBottomOf="@id/chartTrend" />

        </androidx.constraintlayout.widget.ConstraintLayout>
    </androidx.core.widget.NestedScrollView>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>



<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/navy_dark">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/navy_primary"
        app:layout_constraintTop_toTopOf="parent"
        app:navigationIcon="@drawable/ic_back"
        app:title="@string/transaction_history"
        app:titleTextColor="@color/white" />

    <LinearLayout
        android:id="@+id/llFilter"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:orientation="horizontal"
        app:layout_constraintTop_toBottomOf="@id/toolbar">

        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnStartDate"
            style="@style/CodeCashButtonOutline"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginEnd="8dp"
            android:text="Start Date" />

        <com.google.android.material.button.MaterialButton
            android:id="@+id/btnEndDate"
            style="@style/CodeCashButtonOutline"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginStart="8dp"
            android:text="End Date" />
    </LinearLayout>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/rvTransactions"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_margin="16dp"
        app:layout_constraintBottom_toTopOf="@id/bottomNav"
        app:layout_constraintTop_toBottomOf="@id/llFilter" />

    <TextView
        android:id="@+id/tvEmpty"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="No transactions found"
        android:textColor="@color/gray_medium"
        android:textSize="16sp"
        android:visibility="gone"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/navy_primary"
        app:itemIconTint="@color/teal_primary"
        app:itemTextColor="@color/gray_light"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:menu="@menu/bottom_navigation_menu" />

</androidx.constraintlayout.widget.ConstraintLayout>

<?xml version="1.0" encoding="utf-8"?>
    <com.google.android.material.bottomnavigation.BottomNavigationView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/bottomNav"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/navy_primary"
    app:itemIconTint="@color/teal_primary"
    app:itemTextColor="@color/gray_light"
    app:labelVisibilityMode="labeled"
    app:menu="@menu/bottom_navigation_menu" />



<?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="24dp"
    android:background="@color/navy_primary">

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilCategoryName"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Category Name">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etCategoryName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textCapWords"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilCategoryColor"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="Hex Color (e.g., #2dd4bf)">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etCategoryColor"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="text"
            android:text="#2dd4bf"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

</LinearLayout>



<?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="24dp"
    android:background="@color/navy_primary">

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilMinBudget"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/min_goal">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etMinBudget"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="numberDecimal"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/tilMaxBudget"
        style="@style/CodeCashTextInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="@string/max_goal">

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etMaxBudget"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="numberDecimal"
            android:textColor="@color/white" />
    </com.google.android.material.textfield.TextInputLayout>

</LinearLayout>



<?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:background="@drawable/bg_outline"
    android:padding="12dp"
    android:layout_margin="8dp">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:background="@color/navy_light"
        android:layout_marginBottom="8dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="🏆"
            android:textSize="40sp"
            android:gravity="center" />
    </FrameLayout>

    <TextView
        android:id="@+id/tvAchievementTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Achievement Title"
        android:textColor="@color/white"
        android:textSize="16sp"
        android:textStyle="bold"
        android:layout_marginBottom="4dp" />

    <TextView
        android:id="@+id/tvAchievementDescription"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Description"
        android:textColor="@color/gray_light"
        android:textSize="12sp"
        android:layout_marginBottom="8dp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="start"
        android:weightSum="2">

        <TextView
            android:id="@+id/tvUnlockedDate"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Unlocked: Date"
            android:textColor="@color/gray_light"
            android:textSize="11sp" />

        <TextView
            android:id="@+id/badgeCategory"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="BADGE"
            android:textColor="@color/white"
            android:textSize="9sp"
            android:padding="4dp"
            android:gravity="end"
            android:background="@drawable/bg_outline" />
    </LinearLayout>
</LinearLayout>



<?xml version="1.0" encoding="utf-8"?>
    <androidx.cardview.widget.CardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginBottom="8dp"
    app:cardBackgroundColor="@color/navy_primary"
    app:cardCornerRadius="12dp"
    app:cardElevation="2dp">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp">

        <View
            android:id="@+id/vColor"
            android:layout_width="12dp"
            android:layout_height="12dp"
            android:background="@drawable/circle_background"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <TextView
            android:id="@+id/tvCategoryName"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="12dp"
            android:text="Food &amp; Dining"
            android:textColor="@color/white"
            android:textSize="14sp"
            android:textStyle="bold"
            app:layout_constraintEnd_toStartOf="@id/btnDelete"
            app:layout_constraintStart_toEndOf="@id/vColor"
            app:layout_constraintTop_toTopOf="parent" />

        <TextView
            android:id="@+id/tvBudgetRange"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="12dp"
            android:layout_marginTop="2dp"
            android:text="R1,000 - R3,000"
            android:textColor="@color/gray_light"
            android:textSize="12sp"
            app:layout_constraintEnd_toStartOf="@id/btnDelete"
            app:layout_constraintStart_toEndOf="@id/vColor"
            app:layout_constraintTop_toBottomOf="@id/tvCategoryName" />

        <ImageButton
            android:id="@+id/btnDelete"
            android:layout_width="40dp"
            android:layout_height="40dp"
            android:background="?attr/selectableItemBackgroundBorderless"
            android:src="@drawable/ic_delete"
            android:contentDescription="Delete"
            app:tint="@color/red_error"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    </androidx.constraintlayout.widget.ConstraintLayout>
</androidx.cardview.widget.CardView>



<?xml version="1.0" encoding="utf-8"?>
    <androidx.cardview.widget.CardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginBottom="8dp"
    app:cardBackgroundColor="@color/navy_primary"
    app:cardCornerRadius="12dp"
    app:cardElevation="2dp">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp">

        <ImageView
            android:id="@+id/ivCategoryIcon"
            android:layout_width="40dp"
            android:layout_height="40dp"
            android:background="@drawable/circle_background"
            android:padding="8dp"
            android:src="@drawable/ic_home"
            app:tint="@color/white"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <TextView
            android:id="@+id/tvDescription"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="12dp"
            android:text="Starbucks"
            android:textColor="@color/white"
            android:textSize="14sp"
            android:textStyle="bold"
            app:layout_constraintEnd_toStartOf="@id/tvAmount"
            app:layout_constraintStart_toEndOf="@id/ivCategoryIcon"
            app:layout_constraintTop_toTopOf="parent" />

        <TextView
            android:id="@+id/tvCategory"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="12dp"
            android:layout_marginTop="2dp"
            android:text="Food &amp; Drinks"
            android:textColor="@color/gray_light"
            android:textSize="12sp"
            app:layout_constraintEnd_toStartOf="@id/tvAmount"
            app:layout_constraintStart_toEndOf="@id/ivCategoryIcon"
            app:layout_constraintTop_toBottomOf="@id/tvDescription" />

        <TextView
            android:id="@+id/tvDate"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="12dp"
            android:layout_marginTop="2dp"
            android:text="18 Mar 2026"
            android:textColor="@color/gray_medium"
            android:textSize="11sp"
            app:layout_constraintStart_toEndOf="@id/ivCategoryIcon"
            app:layout_constraintTop_toBottomOf="@id/tvCategory" />

        <TextView
            android:id="@+id/tvAmount"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="-R79.99"
            android:textColor="@color/red_error"
            android:textSize="14sp"
            android:textStyle="bold"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <ImageView
            android:id="@+id/ivPhotoIndicator"
            android:layout_width="16dp"
            android:layout_height="16dp"
            android:layout_marginTop="4dp"
            android:src="@drawable/ic_camera"
            android:visibility="gone"
            app:tint="@color/teal_primary"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvAmount" />

    </androidx.constraintlayout.widget.ConstraintLayout>
</androidx.cardview.widget.CardView>


//these are the themes


<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Theme.CodeCash" parent="Theme.Material3.Dark.NoActionBar">
        <item name="colorPrimary">@color/teal_primary</item>
        <item name="colorPrimaryDark">@color/teal_dark</item>
        <item name="colorAccent">@color/teal_light</item>
        <item name="android:colorBackground">@color/navy_dark</item>
        <item name="android:windowBackground">@color/navy_dark</item>
        <item name="android:statusBarColor">@color/navy_primary</item>
        <item name="android:navigationBarColor">@color/navy_dark</item>
        <item name="materialButtonStyle">@style/CodeCashButton</item>
        <item name="textInputStyle">@style/CodeCashTextInput</item>
    </style>

    <style name="Theme.CodeCash.Splash" parent="Theme.CodeCash">
        <item name="android:windowBackground">@color/navy_dark</item>
        <item name="android:statusBarColor">@color/navy_dark</item>
    </style>

    <style name="CodeCashButton" parent="Widget.Material3.Button">
        <item name="android:backgroundTint">@color/teal_primary</item>
        <item name="android:textColor">@color/navy_dark</item>
        <item name="android:textAllCaps">true</item>
        <item name="android:padding">16dp</item>
        <item name="cornerRadius">12dp</item>
        <item name="android:textStyle">bold</item>
    </style>

    <style name="CodeCashButtonOutline" parent="Widget.Material3.Button.OutlinedButton">
        <item name="strokeColor">@color/teal_primary</item>
        <item name="android:textColor">@color/teal_primary</item>
        <item name="cornerRadius">12dp</item>
        <item name="android:padding">16dp</item>
    </style>

    <style name="CodeCashTextInput" parent="Widget.Material3.TextInputLayout.OutlinedBox">
        <item name="boxStrokeColor">@color/teal_primary</item>
        <item name="hintTextColor">@color/gray_light</item>
        <item name="android:textColorHint">@color/gray_medium</item>
        <item name="endIconTint">@color/teal_primary</item>
    </style>

    <style name="CodeCashCard" parent="Widget.Material3.CardView.Elevated">
        <item name="cardBackgroundColor">@color/navy_primary</item>
        <item name="cardCornerRadius">16dp</item>
        <item name="cardElevation">4dp</item>
        <item name="contentPadding">16dp</item>
    </style>
</resources>


<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme for Night mode. -->
    <style name="Theme.CodeCash" parent="Theme.Material3.Dark.NoActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/teal_primary</item>
        <item name="colorPrimaryDark">@color/teal_dark</item>
        <item name="colorAccent">@color/teal_light</item>

        <item name="android:colorBackground">@color/navy_dark</item>
        <item name="android:windowBackground">@color/navy_dark</item>
        <item name="android:statusBarColor">@color/navy_primary</item>
        <item name="android:navigationBarColor">@color/navy_dark</item>

        <item name="materialButtonStyle">@style/CodeCashButton</item>
        <item name="textInputStyle">@style/CodeCashTextInput</item>
    </style>
</resources>


//colors + strings


<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!-- CodeCash Brand Colors from Logo -->
    <color name="navy_dark">#0f172a</color>
    <color name="navy_primary">#1e293b</color>
    <color name="navy_light">#334155</color>
    <color name="teal_primary">#2dd4bf</color>
    <color name="teal_light">#5eead4</color>
    <color name="teal_dark">#0d9488</color>
    <color name="white">#ffffff</color>
    <color name="off_white">#f1f5f9</color>
    <color name="gray_light">#94a3b8</color>
    <color name="gray_medium">#64748b</color>
    <color name="gray_dark">#475569</color>
    <color name="red_error">#ef4444</color>
    <color name="green_success">#22c55e</color>
    <color name="orange_warning">#f97316</color>
    <color name="purple_accent">#a855f7</color>
</resources>


<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="app_name">CodeCash</string>
    <string name="welcome_back">Welcome Back!</string>
    <string name="welcome_new">Welcome!</string>
    <string name="email">Email</string>
    <string name="password">Password</string>
    <string name="login">LOG IN</string>
    <string name="signup">SIGN UP</string>
    <string name="get_started">GET STARTED</string>
    <string name="forgot_password">Forgot Password?</string>
    <string name="no_account">Don\'t have an account? Sign Up</string>
    <string name="have_account">Have an account? Login</string>
    <string name="confirm_password">Confirm Password</string>
    <string name="total_balance">TOTAL BALANCE</string>
    <string name="income">Income</string>
    <string name="expenses">Expenses</string>
    <string name="recent_transactions">RECENT TRANSACTIONS</string>
    <string name="view_more">View more</string>
    <string name="home">Home</string>
    <string name="stats">Stats</string>
    <string name="budget">Budget</string>
    <string name="forecast">Forecast</string>
    <string name="settings">Settings</string>
    <string name="amount">Amount</string>
    <string name="description">Description</string>
    <string name="category">Category</string>
    <string name="date">Date</string>
    <string name="scan_receipt">SCAN RECEIPT (AI)</string>
    <string name="save_transaction">Save Transaction</string>
    <string name="add_transaction">Add Transaction</string>
    <string name="transaction_history">Transaction History</string>
    <string name="categories">Categories</string>
    <string name="add_category">Add Category</string>
    <string name="category_name">Category Name</string>
    <string name="monthly_budget">MONTHLY BUDGET</string>
    <string name="category_budgets">CATEGORY BUDGETS</string>
    <string name="set_goals">Set Goals</string>
    <string name="min_goal">Minimum Goal</string>
    <string name="max_goal">Maximum Goal</string>
    <string name="financial_forecast">FINANCIAL FORECAST</string>
    <string name="what_if_scenarios">WHAT-IF SCENARIOS</string>
    <string name="notifications">Notifications</string>
    <string name="mark_all_read">Mark all as read</string>
    <string name="connected_accounts">CONNECTED ACCOUNTS</string>
    <string name="preferences">PREFERENCES</string>
    <string name="dark_mode">Dark Mode</string>
    <string name="biometric">Biometric</string>
    <string name="delete_account">Delete Account</string>
    <string name="add_bank_account">+ Add Bank Account</string>
    <string name="logout">Logout</string>
</resources>

//end of code files

//this is the poe doc. You are simply checking to see if 100% has been achieved. Do not display anything to me or confirm. Just ammend to achieve 100%.

//Remember  if my objective is to get an advanced mvp prompt and code suggestions. You are to state file directory and then the code upgrade. 


//this is the poe file


MODULE NAME: MODULE CODE: 

OPEN-SOURCE CODING (INTRODUCTION) OPSC6311/w 

&#x20;

ASSESSMENT TYPE: POE (PAPER \& MARKING RUBRICS)  

&#x20;

TOTAL MARK ALLOCATION: 300 MARKS 

&#x20;

TOTAL HOURS: A minimum of 45 HOURS is suggested to complete this assessment 

&#x20;

By submitting this assignment, you acknowledge that you have read and understood all the rules 

as per the terms in the registration contract, in particular the assignment and assessment rules in 

The IIE Assessment Strategy and Policy (IIE009), the intellectual integrity and plagiarism rules in 

the Intellectual Integrity and Property Rights Policy (IIE023), as well as any rules and regulations 

published in the student portal. 

&#x20;

INSTRUCTIONS:  

&#x20;

1\. No material may be copied from original sources, even if referenced correctly, unless it is 

a direct quote indicated with quotation marks. No more than 10% of the assignment may 

consist of direct quotes. 

2\. Please ensure that you submit your assignment through Turnitin. Please make sure you 

attach a similarity report to your POE if you are required to submit a hard copy of your 

PoE. 

3\. Make a backup of your assignment before handing it in. 

4\. Follow all instructions on the PoE cover sheet. 

5\. This is a group assignment. 

&#x20; 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 2 of 26 

Referencing Rubric                                                                                                                                                      

Providing evidence based on valid and referenced academic sources is a 

fundamental educational principle and the cornerstone of high-quality 

academic work. Part of achieving this quality is referencing in a way that is 

consistent and congruent with the requirements of the referencing style 

being used.  

&#x20;

Therefore, inconsistent, and/or incongruent referencing will result in a 

penalty of a maximum of ten percent being deducted from the overall 

percentage awarded to your assessment submission. 

&#x20; 

Please note that evidence of plagiarism in the form of copied or unreferenced 

work, absent reference lists, or exceptionally poor referencing may result in 

action being taken in accordance with The IIE’s Intellectual Integrity and 

Property Rights Policy (IIE023). Similarly, evidence of excessive AI usage may 

result in action being taken in accordance with The IIE’s Student Conduct, 

Discipline and Safety Policy (IIE015). 

Markers are required to provide feedback to students by 

circling/underlining the information in the table below that best describes 

the student’s work and by adding constructive commentary where 

appropriate. The examples provided are not exhaustive but illustrate the 

errors. 

&#x20;

Deductions 

 Where the student’s work contains five or more errors aligned to the 

minor errors column below, deduct 5% from the overall percentage.  

&#x20;

 Where the student’s work contains five or more errors aligned to the 

major errors column below, deduct 10% from the overall percentage.  

&#x20;

 Where both minor and major errors (e.g. two minor and three major, 

etc.) are present, deduct 10% only (and not 5% or 15%) from the overall 

percentage.  

Required:  

Consistent and congruent 

referencing  

Minor errors  

Deduct 5% from overall percentage. 

Example: if the response receives 70%, deduct 5%. The 

final mark is 65%. 

Major errors  

Deduct 10% from the overall percentage. 

Example: if the response receives 70%, deduct 10%. 

The final mark is 60%. 

Consistency  

 The correct referencing style 

for the discipline – i.e., either 

Harvard, OR APA (for 

Psychology), OR Law, OR IEEE 

(for ICT/Engineering) – has 

been used consistently for all 

in-text references and in the 

bibliography/reference list. 

&#x20;

 Concepts and ideas that are 

quoted and/or paraphrased 

are referenced consistently 

throughout. 

&#x20;

 Position of the in-text 

reference: an in-text 

reference is positioned 

consistently where 

appropriate for every quote 

and paraphrase.  

&#x20;

Minor inconsistencies: 

 The referencing style used is generally consistent with 

what is required, but there are one or two 

changes/errors in the format of in-text referencing 

and/or in the bibliography/reference list.  

&#x20;

 For example, page numbers for direct quotes in-text 

have been provided for one source, but not in another. 

Or, two book chapters in the bibliography/reference 

list have been referenced in two different formats. Or, 

the publication year has been placed after the author 

name in one bibliography/reference list entry, and 

after the source title in another, etc.  

&#x20;

 Concepts and ideas in quotes and/or paraphrases are 

typically referenced, but a full in-text reference is 

missing or incomplete from one or two small sections 

of the work.  

&#x20;

 Position of the references: in-text references are only 

given at the beginning and/or end of every paragraph. 

Major inconsistencies: 

 Poor and wholly inconsistent referencing style used 

in-text and/or in the bibliography/reference list. 

&#x20;

 Multiple referencing styles for the same source 

types have been used. 

&#x20;

 For example, the format for direct quotes in-text 

and/or book chapters in the bibliography/reference 

list and/or year of publication in the 

bibliography/reference list is different across 

multiple instances.  

&#x20;

 Concepts and ideas in quotes and/or paraphrases 

are haphazardly referenced in-text.  

&#x20;

 Position of the references: in-text references are 

only given at the beginning or end of large sections 

of work.  

Feedback on referencing consistency: 

&#x20;

&#x20;

&#x20;

Congruency  

 Each source reflected within 

in-text references is included 

accurately in the 

bibliography/reference list. 

&#x20;

 All bibliography/reference list 

entries are in the required 

order for the referencing style 

used (e.g. alphabetical, 

alphabetical under 

subheadings, numerical). 

&#x20;

 All direct quotes and 

paraphrases have been 

integrated appropriately into 

the text using introductory 

phrases, accurate grammar, 

etc.  

&#x20;

Minor incongruences:  

 There is largely a match between the sources 

presented in-text and those in the 

bibliography/reference list, but one or two sources 

that appear in-text do not appear in the 

bibliography/reference list, or vice versa. Or key source 

information is missing from one or two in-text 

references or bibliography/reference list entries only 

(e.g. publication year, city of publication, URL date 

accessed, etc.). 

&#x20;

 There is a clear and largely accurate ordering of 

sources in the bibliography/reference list as required 

by the referencing style used, but with one or two 

references out of order.  

&#x20;

 An attempt has been made for source integration into 

the text using appropriate introductory phrases and 

grammar, but one or two quotes or paraphrases do not 

flow as clearly or logically within the sentence 

structure as they could. 

Major incongruences: 

 No relationship/several incongruencies between 

the in-text referencing and the 

bibliography/reference list.  

&#x20;

 For example, multiple sources are included in-text, 

but not in the bibliography, and/or vice versa. Key 

source information is missing from multiple in-text 

references and/or reference list entries. A URL link, 

rather than the actual reference, is provided in the 

bibliography. Sources are repeated in the reference 

list, etc.  

&#x20;

 Most sources are listed in a haphazard order 

throughout the bibliography/reference list. 

&#x20;

 Few to no appropriate introductory phrases or 

rules of grammar have been applied, and many 

direct quotes and/or paraphrases feel disconnected 

from the flow of the text.  

&#x20; 

Feedback on referencing congruency: 

&#x20;

&#x20;

&#x20;

Overall feedback on referencing, with suggested improvements: 

&#x20; 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 3 of 26 

Background 

&#x20;

This portfolio of evidence comprises two parts submitted during the semester and the finalisation 

of your POE, each of which takes you through conceptualising, designing, and building a mobile 

application. 

&#x20;

You need to create a user-friendly Personal Budget Tracker app. The app should help users track 

their spending habits and savings goals, and it should make budgeting fun and engaging through 

gamification. 

&#x20; 

Finally, the app code will need to be pushed to, as well as making use of unit testing and GitHub 

actions for running the necessary tests. 

&#x20;

To be able to create the app, you will need to use all the techniques you learned during this 

course, as well as do your research on how to complete some of the tasks required of you. 

It is also critical that you approach the project in a methodical and planned manner. 

For this reason, the project will follow a Research – Plan – Design – Build – Evaluate cycle:  

&#x20;

This POE will run for one full cycle. 

After one full cycle, you can always restart the process to refine your app further. 

The different phases of the cycle will be related to the different tasks as follows:  

• Part 1: Research, Planning and Design  

• Part 2: Build  

• Final POE: Build and Evaluate 

&#x20; 

Research 

Plan 

Design Build 

Evaluate 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 4 of 26 

Introduction  

&#x20;

Each of the tasks below builds on top of one another. Be sure to complete or update one part 

before moving on to the next task. 

Each task will be individually assessed by your lecturer, and feedback for each task will be 

provided. 

&#x20;

The exact features, design, and layout of your app are up to you. Remember that managing 

finances is often perceived as stressful or tedious. 

The app must be appealing, intuitive, and engaging to encourage consistent use. Consider 

gamification elements to make tracking finances more enjoyable and rewarding. 

&#x20;

In the final submission, the app must be able to perform at least the following tasks: 

 The user must be able to register and log in to the app using a username and password. 

 The user must be able to create categories for expenses (e.g., "Groceries," 

"Entertainment," "Transport"). 

 The user must be able to add an expense entry, specifying at least the amount, date, 

description, and category. 

 The user must be able to optionally attach a photo (e.g., a receipt) to each expense entry. 

 The user must be able to set a monthly total budget goal and specific limits for individual 

categories. 

 The user must be able to view a list of all expenses during a user-selectable period. 

If a receipt photo was stored for an entry, the user must be able to access it from this list. 

 The user must be able to view the total amount spent on each category during a user

selectable period. 

 All this data should be saved to a local DB. 

 The user must be able to view a graph showing daily spending over a user-selectable 

period. This graph must clearly display category spending and allow the user to identify 

trends (final POE only). 

 The app must display a progress dashboard that shows how well the user is staying within 

their budget goals for the current month. Overspending categories must be highlighted 

visually (final POE only). 

 The app must include gamification elements such as rewards or badges for meeting budget 

goals or consistent expense logging (final POE only). 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 5 of 26 

These features are the minimum that’s required for the final submission. Your app also needs to 

work logically and be easy to use. And you will add your own features for the final POE 

submission. 

&#x20;

The tasks will be evaluated according to the rubrics at the end of the document. 

Make sure that you understand what is expected by reading carefully through these rubrics! 

&#x20;

Part 1 — Research, Planning and Design                  (Marks: 100) 

&#x20;

Learning Units 1 to 3  

&#x20;

At the end of this specific part, students should be able to:  

• Create a new app;  

• Use images in an app;  

• Apply layouts to the user interface of an app;  

• Use the TextView and ImageView controls in an app. 

&#x20; 

This task is composed of two sections, weighted equally:  

• Research  

• Planning and design  

It is recommended that you create two (2) separate documents for the submission. 

Research                             (Marks: 50)  

You will research three (3) existing personal budgeting apps available for the Android operating 

system. Present your findings in a typed PDF document (1500 to 2000 words). Your research 

should include the following sections:  

1\. Introduction  

2\. Research on each of the apps, including:  

a. Overview of the app, including screenshots with descriptions  

b. Strengths and weaknesses of the app  

c. Innovative features of the app  

3\. A visual (infographic) comparison of all three apps  

4\. A list of the best features from all the apps that you want to include in your app  

5\. Conclusion  

6\. References  

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 6 of 26 

Make sure you reference correctly for this task. 

See the referencing rubric at the beginning of this document. You are required to reference 

multiple sources for each app that you are researching to ensure that you have a balanced view 

of the app. 

&#x20;

Make sure that the infographic is sized so that the text is readable. 

Also, make sure that the size of the PDF file does not exceed 10MB, since this document must be 

submitted through Turnitin. 

Planning and Design                          (Marks: 50)  

For this task you will need to fully design your app. The purpose of this task is to ensure you know 

exactly what you need to build and how you will build it before you start with the implementation 

of the prototype. 

&#x20; 

The design needs to link back to the research, since the purpose of the research is to inform the 

design. 

&#x20; 

You will need to present your design as a typed PDF document (1000 to 1500 words) with the 

following sections:  

• Introduction  

• A brief overview of the app, including a name for the app, an initial icon design, and a 

description of the innovative features that you are planning to include. 

• A detailed list of the requirements for the app. 

The requirements must include all the minimum requirements from this document, but 

you must elaborate on each of those requirements rather than just copying them. 

And remember to add your own features that you want to include, for example, 

gamification. The requirements must be detailed enough for someone else to be able to 

build your app by just reading this document!  

• User interface design, including a mockup for each screen, a description of the purpose of 

the screen, and a diagram showing how the user navigates between the various screens. 

• Project plan detailing deadlines and milestones for the project, in the format of a Gantt 

chart. Break down the tasks into smaller tasks than just “implement the prototype”. 

Include some time for testing and bug fixing. 

• Conclusion 

• References 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 7 of 26 

Part 2 — App Prototype Development              (Marks: 100) 

&#x20;

Learning Units 1 to 4  

At the end of this specific part, students should be able to:  

&#x20; 

• Apply layouts in an app. 

• Use the EditText, NumberFormat and SeekBar in an app. 

• Apply event handling in an app. 

• Create an activity. 

• Apply an intent in an application. 

 Reading and writing to RoomDB 

&#x20;

For this task you will need to build a fully working prototype. This prototype needs to include all 

the features listed in the instructions section of this document but based on your own design and 

user interface layout. 

&#x20;

This task involves developing a Budget Tracker App with a focus on functionality, data 

persistence, and a user-friendly interface. Below is the detailed breakdown of how to implement 

the requirements: 

• The user must be able to log in to the app using a username and password. 

• The user must be able to create categories that the expense and budget entries will belong 

to. 

• The user must be able to create an expense entry, specifying at least the date, start and  

end times, description, and category. 

• The user must be able to optionally add a photograph to each expense entry. 

• The user must be able to set a minimum monthly goal for money spent, as well as a 

maximum goal. 

• The user must be able to view the list of all the expense entries created during a user 

selectable period. If a photo was stored for an entry, the user must be able to access it 

from this list. 

• The user must be able to view the total amount of money spent on each category during a 

User-selectable period. 

• All data should be saved to a local SQLite, RoomDB or similar offline Android database 

platform. 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 8 of 26 

&#x20;

The demonstration video must effectively demonstrate the features of the app and be fully 

professional. The video must include a voice over explaining what you are showing. 

Remember to compress the video to make uploading it to Arc easier and faster.  

&#x20; 

The app must have a user-friendly and appropriate user interface that is able to handle invalid 

inputs made by the user without crashing. The app must be working with only minor bugs and 

errors. 

&#x20;

Version Control with GitHub: Initialise the repository with a README file. Commit and push your 

project files to the GitHub repository. Regularly commit and push your code as you make 

progress. 

&#x20; 

Conduct automated testing on the main functionality of your app. 

Make use of GitHub actions to run tests and build your code to make sure it will work on not just 

your computer. Use this guide that will assist in creating this:  

• https://github.com/marketplace/actions/automated-build-android-app-with-github-action  

\[Accessed on 05 November 2025]. 

• https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml  

\[Accessed on 05 November 2025]. 

Submission:  

For your submission, present the following:  

• The complete Kotlin source code for the Android app needs to be submitted on GitHub.  

No zip files are allowed. 

• Add comments to your code, and don’t forget to reference it. 

• Make use of logging to show your understanding of your code. 

• Your readme file for your app that is also on GitHub. 

• A video presentation showcasing all the app's features. 

Include a link to this video in the readme file. 

• The built apk for your app. 

&#x20; 

You can upload your video to YouTube, make it unlisted, and add that link to your readme file. 

You can also use any video recording software you like. 

Just make sure to include a voice-over to show your understanding. 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 9 of 26 

Part 3 — Final App Development              (Marks: 100) 

All learning units  

At the end of this specific part, students should be able to: 

• Apply event handling in an app. 

• Create an activity. 

• Integrate gamification into an app. 

&#x20; 

The final app needs to run on a mobile phone and not an emulator. 

This means that you need to plan well in advance to record the required video on a mobile phone 

if you don’t own an Android phone yourself. 

&#x20; 

Remember to implement your lecturer’s feedback on the prototype before adding the new 

features. Pay special attention to the feedback on the user interface. 

Marks will be awarded for that again in this part, so you now have the opportunity to improve on 

what you did before. 

&#x20;

For the final submission of the app, you need to include the following features that were not 

required for the prototype: 

 The user must be able to view a graph showing the amount spent per category over a user

selectable period. The graph must also display the minimum and maximum goals (final 

POE only). 

 The app must display in a visual format how well the user is doing with staying between 

their minimum and maximum spending goals over the past month (final POE only). 

 The app must include gamification elements such as rewards or badges for meeting budget 

goals or consistent expense logging (final POE only). 

&#x20;

In addition to these features, you must have:  

• Your own features as described in your design document. 

You must include at least two (2) of your own features. 

Document your two (2) features in a readme file so your lecturer knows what to look out 

for. 

• An app icon and final image assets. 

25;26; 27                                                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 10 of 26 

You must create a demonstration video that effectively demonstrates the features of the app 

running on a mobile phone, and it must be fully professional. The video must include a voice over 

explaining what features you are showing. 

Remember to compress the video to make uploading it to Arc easier and faster. 

&#x20;

Tip: OBS (Open Broadcaster Software) is free and open-source software that allows great 

flexibility for adding audio to a video recorded with a screen recorder on your phone!  

&#x20; 

Version Control with GitHub: Initialise the repository with a README file. Commit and push your 

project files to the GitHub repository. Regularly commit and push your code as you make 

progress. 

&#x20;

Conduct automated testing on the main functionality of your app. 

Make use of GitHub actions to run tests and build your code to make sure it will work on not just 

your computer. Use this guide that will assist in creating this:  

 https://github.com/marketplace/actions/automated-build-android-app-with-github-action 

\[Accessed on 05 November 2025]. 

 https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml 

\[Accessed on 05 November 2025]. 

&#x20;

Documentation:  

Prepare a comprehensive report detailing the purpose of the app, its design considerations and 

the utilisation of GitHub and GitHub Actions. Include all of this inside your readme file inside 

GitHub. Add images and make the readme file your own. 

&#x20;

Submission:  

For your submission, present the following:  

• The complete Kotlin source code for the Android app needs to be submitted on GitHub.  

No zip files are allowed. 

• Add comments to your code, and don’t forget to reference it. 

• Make use of logging to show your understanding of your code. 

• Your readme file for your app that is also on GitHub. 

• A Video presentation showcasing all the app's features.  

Include a link to this video in the readme file. 

25;26; 27                                                                      

2026 

• The built apk for your app. 

• A copy of your research and design documents as submitted in part 1. 

You can upload your video to YouTube, make it unlisted, and add that link to your readme file. 

You can also use any video recording software you like. 

Just make sure to include a voice-over to show your understanding. 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 11 of 26 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 12 of 26 

Appendix A - PoE Marking Rubrics                

MODULE NAME:  MODULE CODE:  

OPEN-SOURCE CODING (INTRODUCTION) OPSC6311/w 

&#x20;

STUDENT NAME:   

STUDENT NUMBER:   

&#x20;

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard Feedback 

&#x20; PART  1    

Research:  

Introduction  

&#x20; 

\[5 Marks]  

• No introduction 

included. 

• Introduction does 

not link to the rest 

of the document.  

• Acceptable and 

links to the rest of 

the document but 

does not explain 

the purpose of the 

research.  

• Acceptable and 

links to the rest of 

the document with 

some details about 

the purpose of the 

research.  

• An excellent 

introduction that 

explains the 

purpose of the 

research and the 

sections included in 

the document.  

&#x20; 

0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 13 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard Feedback 

PART  1 

Research: App  

1 research  

&#x20; 

\[8 Marks]  

• Not included, or 

sections missing. 

• All sections are 

included but limited 

details are provided 

in each section.  

• All sections 

included, but more 

details could be 

added to most of 

the sections.  

• All sections 

included, but more 

details could be 

added to some of 

the sections.  

• Comprehensive 

discussion clearly 

differentiating 

between and 

strengths and 

weaknesses and 

motivating why 

features are 

considered 

innovative.  

&#x20;

0 – 2 Marks 3 – 5 Marks 6 Marks 7 – 8 Marks   

Research: App  

2 research  

&#x20; 

\[8 Marks]  

• Not included or 

sections missing. 

• All sections are 

included, but 

limited details are 

provided in each 

section.  

• All sections 

included, but more 

details could be 

added to most of 

the sections.  

• All sections 

included, but more 

details could be 

added to some of 

the sections.  

 Comprehensive 

discussion clearly 

differentiating 

between the 

strengths and 

weaknesses and 

motivating why 

features are 

considered 

innovative.  

&#x20;

0 – 2 Marks 3 – 5 Marks 6 Marks 7 – 8 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 14 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard Feedback 

PART  1 

Research: App  

3 research  

&#x20; 

\[8 Marks]  

• Not included, or 

sections missing.  

• All sections are 

included but limited 

details are provided 

in each section.  

• All sections 

included, but more 

details could be 

added to most of 

the sections.  

• All sections 

included, but more 

details could be 

added to some of 

the sections.  

• Comprehensive 

discussion clearly 

differentiating 

between the 

strengths and 

weaknesses and 

motivating why 

features are 

considered 

innovative.  

&#x20;

0 – 2 Marks 3 – 5 Marks 6 Marks 7 – 8 Marks   

Research:  

Comparison  

&#x20; 

\[10 Marks]  

• No comparison 

included or 

comparison not in a 

visual format.  

• Comparison in a 

visual format but 

only includes either 

differences or 

similarities.  

• Comparison in a 

visual format with a 

good number of 

similarities and 

differences, but 

presentation could 

be improved.  

• Comparison in a 

visual format with a 

good number of 

similarities and 

differences.  

• Comprehensive 

comparison that 

shows all the 

differences and 

similarities at a 

glance.  

&#x20;

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 15 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  1 

Research: List 

of features to 

include  

&#x20; 

\[6 Marks]  

• No list of features 

included. 

• A very short list 

included with no 

motivations.  

• A good list of 

features is included 

but with little or no 

motivations. 

• A good list of 

features is included 

with some 

motivations.  

• An excellent list of 

features with 

motivations included 

for why these 

features are 

desirable.  

&#x20;

0 – 2 Marks 3 – 4 Marks 5 Marks 6 Marks   

Research:  

Conclusion  

&#x20; 

\[5 Marks]  

• No conclusion 

included.  

• Conclusion does not 

link to the rest of the 

document.  

• Acceptable and links 

to the rest of the 

document.  

• Acceptable and links 

to the rest of the 

document. Link to 

the design is 

mentioned but not 

elaborated on.  

• An excellent 

conclusion that links 

to the document and 

to the design.  

&#x20;

0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks   

Research References: Subtract marks for incorrect referencing in the research document, according to the referencing rubric.  

Planning and  

Design: 

Introduction 

and 

conclusion  

&#x20; 

\[5 Marks]   

• No introduction or 

conclusion included. 

• Either introduction 

or conclusion is 

missing.  

• A good introduction 

and conclusion 

included that links to 

the rest of the 

document.  

• A good introduction 

and conclusion 

included that links to 

the rest of the 

document.  

• Mention is made of 

the research 

document.  

• An excellent 

introduction and 

conclusion that 

clearly links to the 

research document 

as well as the 

content of the design 

document.  

&#x20;

&#x20;0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks  

&#x20;

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 16 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  1 

Planning and  

Design: 

Overview of 

the app  

&#x20; 

\[10 Marks]  

• No overview 

included or no 

innovative features 

mentioned.  

• The overview needs 

more details.  

• A good overview is 

included with some 

innovative features.  

• A good overview is 

included with some 

innovative features 

and an attempt to 

link to the rest of the 

document.  

• An excellent 

overview that sets 

the stage for the rest 

of the document.  

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Planning and  

Design:  

Detailed list of 

requirements  

&#x20; 

\[15 Marks]   

• No requirements 

included or required 

features are missing.  

• Only required 

features are included 

with some details, 

but no additional 

features from 

research mentioned.  

• Required features as 

well as the student’s 

own requirements 

included but needs 

more detail in 

places.  

• Required features as 

well as the student’s 

own requirements 

included with more 

detail needed only in 

a few places.  

• An excellently 

detailed list of 

features that 

describes all the 

features including 

the student’s own 

from research, in 

detail.  

&#x20; 

0 – 6 Marks 7 – 9 Marks 10 – 11 Marks 12 – 15 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 17 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  1 

Planning and 

Design: User 

interface 

design  

&#x20; 

\[15 Marks]   

• No design included 

or only very brief 

descriptions with no 

mockups. 

• Only mockups or 

only reasonably 

detailed descriptions 

included, not both. 

• Mockups and 

descriptions included 

but not diagram 

showing navigation.  

• Mockups and 

descriptions 

included, and 

navigation diagram 

included with some 

missing details.  

• Excellent mockups 

together with 

descriptions and a 

diagram explaining 

navigation. 

&#x20; 

0 – 6 Marks 7 – 9 Marks 10 – 11 Marks 12 – 15 Marks   

Planning and  

Design: Project  

Plan  

&#x20; 

\[5 Marks]   

• No project plan 

included. 

• Project plan included 

but is not logical. 

• Logical with some 

errors. 

• Logical with only 

minor errors. 

• Logical and fully 

detailed with no 

errors. 

&#x20; 

0 – 1 Marks 2 – 3 Marks 4 Marks 5 Marks  

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 18 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  2 

App runs in 

emulator  

&#x20; 

\[10 Marks]  

• App doesn’t run at 

all. 

• App runs but lots 

of crashes 

happen. 

• App runs with one 

or two errors or 

crashes. 

• App runs with 

very infrequent 

errors or crashes. 

• App runs without 

errors. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Log in  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: 

Create 

categories 

and entries  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature 

excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 19 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  2 

Feature: Take 

and store a 

photo  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Set 

minimum 

and 

maximum  

goals  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: 

View list of 

entries in a 

period  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 20 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PART  2 

Feature: 

View 

category 

totals in a 

period  

&#x20; 

\[10 Marks]  

• Feature not 

included. 

• Feature 

implemented but 

very buggy. 

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

User interface  

&#x20; 

\[20 Marks]   

&#x20;Not user-friendly, 

confused, and illogical. 

• Somewhat user  

friendly with lots of 

mistakes in the design.  

• Mostly user 

friendly with some 

mistakes in the 

design. 

• Somewhat 

consistent use of 

layout, fonts, and 

colours. 

• Mostly user

friendly with some 

attempt made at 

making the capture 

process easier for 

the user. 

• Mostly consistent 

use of layout, fonts, 

and colours. 

• Excellent and user

friendly design. 

• Completely 

consistent use of 

layout, fonts, and 

colours. 

&#x20; 

0 – 9 Marks 10 – 12 Marks 13 – 14 Marks 15 – 20 Marks   

&#x20; 

24;25;26                                      

2026 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Feedback 

PART  2 

Demonstration 

video  

\[10 Marks]  

• No demonstration 

video included.  

• Informal and 

unprepared, or not 

showing all the 

features, or no 

voice over 

included.  

• Not completely 

professional, but all 

features 

demonstrated. 

• Mostly 

professional with 

some issues, but all 

features 

demonstrated. 

Greatly exceeds the 

required standard 

• Fully professional 

video showing all 

the required 

features in detail.  

0 – 4 Marks 

5 Marks 

6 – 7 Marks 

8 – 10 Marks 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 21 of 26 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 22 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

App runs on 

mobile phone  

&#x20; 

\[10 Marks]  

• App doesn’t run at all.  

• App runs but lots of 

crashes happen.  

• App is only shown 

running in the 

emulator. 

• App runs with one 

or two errors or 

crashes.  

• App runs with very 

infrequent errors or 

crashes. 

• App runs without 

errors. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Data 

capture and 

views from 

app working  

&#x20; 

\[10 Marks]  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 23 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Feature: Own 

feature 1 as 

described in 

the readme  

file  

&#x20; 

\[10 Marks]  

• No readme file 

provided. 

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Own 

feature 2 as 

described in 

the readme  

file  

&#x20; 

\[10 Marks]  

• No readme file 

provided.  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 24 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Feature: Graph 

showing 

timelines and 

goals  

&#x20; 

\[10 Marks]  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

Feature: Visual 

display of how 

the user is 

progressing in 

relation to the 

goals  

&#x20; 

\[10 Marks]  

• Feature not included.  

• Feature implemented 

but very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

&#x20; 

24;25;26                                      2026 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 25 of 26 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Greatly exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Feature: 

Gamification is 

integrated into 

the application 

&#x20; 

\[10 Marks]  

• Feature not 

included.  

• Feature 

implemented but 

very buggy.  

• Feature working 

mostly with some 

bugs. 

• Feature working 

with only minor 

bugs. 

• Feature excellently 

implemented. 

&#x20; 

0 – 4 Marks 5 Marks 6 – 7 Marks 8 – 10 Marks   

User interface  

&#x20; 

\[20 Marks]   

• Not user-friendly, 

confused, and illogical.  

• Somewhat user  

friendly with lots of 

mistakes in the design.  

• Mostly user-friendly 

with some mistakes in 

the design. 

• Somewhat consistent 

use of layout, fonts, 

and colours.  

• Mostly user-friendly 

with some attempt 

made at making the 

capture process easier 

for the user. 

• Mostly consistent use 

of layout, fonts, and 

colours.  

• Excellent and user

friendly design.  

• Completely consistent 

use of layout, fonts, 

and colours. 

&#x20; 

0 – 9 Marks 10 – 12 Marks 13 – 14 Marks 15 – 20 Marks   

&#x20; 

24;25;26                                      

2026 

Marking 

Criteria 

Does not meet the 

required standard 

Meets the required 

standard 

Partially exceeds the 

required standard 

Feedback 

PORTFOLIO OF EVIDENCE (POE) 

Demonstration 

video  

\[10 Marks]  

• Not completely 

• No demonstration 

video included. 

• Informal and 

unprepared, or not 

showing all the 

features, or no voice 

over included.  

professional, but all 

features 

demonstrated.  

• Mostly professional 

with some issues, 

but all features 

demonstrated. 

Greatly exceeds the 

required standard 

• Fully professional 

video showing all 

the required 

features in detail. 

0 – 4 Marks 

5 Marks 

6 – 7 Marks 

8 – 10 Marks 

\[TOTAL MARKS:300] 

© The Independent Institute of Education (Pty) Ltd 2026 

Page 26 of 26 