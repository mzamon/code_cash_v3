package com.codecash

import kotlin.random.Random

/**
 * ChatbotEngine: Handles bot responses using keyword matching with parallel arrays
 * Contains 50+ pre-written responses for budget tracking and financial management
 */
object ChatbotEngine {
    
    // Parallel arrays: keywords and corresponding responses
    private val keywords = arrayOf(
        // Greetings & General
        arrayOf("hi", "hello", "hey", "greetings", "sup", "howdy"),
        arrayOf("how are you", "how do you do", "you doing"),
        arrayOf("thank", "thanks", "appreciate", "grateful", "awesome"),
        arrayOf("help", "support", "assist", "guide me"),
        
        // Transactions
        arrayOf("add transaction", "record expense", "log spending", "track purchase"),
        arrayOf("add income", "earned", "salary", "deposit", "received money"),
        arrayOf("view transactions", "show spending", "list expenses", "transaction history"),
        arrayOf("edit transaction", "modify entry", "change amount", "update transaction"),
        arrayOf("delete transaction", "remove entry", "clear expense"),
        
        // Budgeting
        arrayOf("create budget", "set budget", "new budget", "budget goal"),
        arrayOf("monthly budget", "budget limit", "spending limit", "budget category"),
        arrayOf("budget tracking", "track budget", "budget progress", "remaining budget"),
        arrayOf("over budget", "exceeded budget", "over spending", "over limit"),
        arrayOf("adjust budget", "update budget", "change budget", "modify budget"),
        
        // Savings & Goals
        arrayOf("savings goal", "save money", "saving target", "goal setting"),
        arrayOf("emergency fund", "rainy day", "safety net", "savings account"),
        arrayOf("investment", "grow money", "returns", "stocks", "mutual funds"),
        
        // Achievements & Motivation
        arrayOf("achievement", "badge", "reward", "level up"),
        arrayOf("track progress", "how am i doing", "my performance", "stats"),
        arrayOf("streak", "daily goal", "consistent", "habit"),
        
        // Categories
        arrayOf("food", "groceries", "dining", "restaurant", "meal"),
        arrayOf("entertainment", "movies", "fun", "games", "hobby"),
        arrayOf("shopping", "clothes", "retail", "online shopping", "mall"),
        arrayOf("transportation", "fuel", "gas", "uber", "taxi", "commute"),
        arrayOf("bills", "utilities", "electricity", "water", "internet", "rent"),
        arrayOf("health", "medical", "fitness", "gym", "doctor", "pharmacy"),
        arrayOf("education", "tuition", "books", "course", "learning"),
        
        // Reports & Analytics
        arrayOf("report", "summary", "overview", "analytics", "insight"),
        arrayOf("spending pattern", "habit analysis", "where money goes"),
        arrayOf("monthly summary", "this month", "last month", "monthly report"),
        arrayOf("comparison", "compare", "versus", "vs last month"),
        
        // Tips & Advice
        arrayOf("save money tips", "reduce spending", "cut costs", "economize"),
        arrayOf("investing advice", "wealth management", "financial planning"),
        arrayOf("debt", "loan", "emi", "credit card", "pay off"),
        
        // Technical/Account
        arrayOf("export", "download data", "backup", "csv"),
        arrayOf("notifications", "alert", "reminder", "notification settings"),
        arrayOf("profile", "settings", "preferences", "account settings"),
        arrayOf("sync", "backup data", "cloud", "restore"),
        
        // App Features
        arrayOf("feature", "what can you do", "capabilities", "functions"),
        arrayOf("how to use", "tutorial", "walkthrough", "guide"),
        arrayOf("dark mode", "theme", "appearance", "display"),
        
        // Positive Feedback
        arrayOf("love this app", "great app", "amazing", "fantastic"),
        arrayOf("useful", "helpful", "practical", "convenient"),
        
        // Negative/Issues
        arrayOf("bug", "crash", "issue", "problem", "error"),
        arrayOf("slow", "lag", "performance", "responsive"),
        
        // Specific Scenarios
        arrayOf("bill reminder", "due date", "upcoming bill", "payment due"),
        arrayOf("subscription", "recurring payment", "monthly charge", "auto pay")
    )
    
    private val responses = arrayOf(
        // Greetings & General (4)
        "Hello! 👋 Ready to take control of your finances? How can I help with your budget today?",
        "Hey there! I'm your personal budget assistant. What financial goal are we working on today?",
        "Hi! Tracking expenses is the first step to financial freedom. Need help adding a transaction?",
        "Doing great, thanks for asking! 😊 Ready to help you master your budget. What's on your mind?",
        "You're welcome! 🎉 Small steps today lead to big savings tomorrow. Keep going!",
        "Glad to help! Remember, every tracked expense is a step toward your financial goals!",
        "I'm here to help! 💪 Need help with budgeting, tracking, or setting goals? Just ask!",
        
        // Transactions (7)
        "To add a transaction, tap the + button on the dashboard. Enter amount, category, and optional note. Want me to suggest categories?",
        "Adding income is smart! 💰 Go to Dashboard → Add Transaction → select 'Income' as type. Track your earnings to see net worth growth!",
        "You can view all transactions in the Transaction History tab. Sort by date, amount, or category. Would you like filtering tips?",
        "Editing transactions is easy! Long-press any transaction in the list, or tap the edit icon. Update amount, category, or date as needed.",
        "To delete a transaction, swipe left on it in the history list, or tap delete in edit mode. Be careful - this action can't be undone!",
        
        // Budgeting (5)
        "Great idea! Set up budgets in the Budget section. Start with essentials like Food, Transport, Bills. I recommend 50/30/20 rule - wants vs needs!",
        "Monthly budget tracking helps you stay on track. Set realistic limits based on past 3 months' spending. Want tips to stick to your budget?",
        "Budget progress appears on your dashboard. Green means on track, yellow is warning, red means over budget. Check daily to stay aware!",
        "Being over budget happens. ⚠️ Review your spending, identify unnecessary expenses, and adjust next month's categories. Want saving strategies?",
        "Adjust your budget anytime in Settings → Budget Preferences. Life changes, budgets should too! Update monthly for accuracy.",
        
        // Savings & Goals (3)
        "Savings goals are powerful! 🎯 Set specific targets (e.g., 'Vacation: $1000'). Break into monthly contributions. Start small, stay consistent!",
        "Emergency fund should cover 3-6 months of expenses. Start with $1000, then build gradually. Every dollar counts toward security!",
        "For investments, start with low-cost index funds after building emergency fund. I can explain compound interest - the 8th wonder of the world! 💎",
        
        // Achievements (3)
        "Achievements unlock as you hit milestones! 🏆 'Week Warrior' for 7-day streak, 'Budget Master' for staying under limits. Can you collect them all?",
        "Track progress in the Achievements tab. Each badge boosts motivation. Next milestone: Save $500 or track 50 transactions. You've got this!",
        "Streaks build habits! 🔥 Log expenses daily for bonus motivation. Current streak appears on profile. Consistency beats intensity every time!",
        
        // Categories (7)
        "Food category includes groceries, dining out, coffee shops. Pro tip: separate groceries from restaurants to identify saving opportunities! 🍕",
        "Entertainment covers movies, games, concerts, hobbies. Set a monthly limit to enjoy life without guilt! What's your favorite fun activity?",
        "Shopping alert! 🛍️ Track clothing, electronics, home goods. Try the 24-hour rule before large purchases to avoid impulse buying.",
        "Transportation costs: fuel, public transit, rideshares, maintenance. Consider biking or carpooling to reduce this category!",
        "Bills include rent/mortgage, utilities, insurance, subscriptions. Review subscriptions monthly - you might find forgotten charges! 💡",
        "Health category: gym, medical, fitness, gym, doctor, pharmacy. Investing in health pays the best returns. Remember to budget for preventive care!",
        "Education expenses: tuition, books, courses, workshops. Learning new skills increases earning potential - best investment ever! 📚",
        
        // Reports (4)
        "The Reports section shows spending breakdowns by category, pie charts, and trends. Check weekly to spot patterns early!",
        "Analyze spending habits in Analytics. Filter by month, category, or payment type. Insights help you make data-driven decisions! 📊",
        "Monthly summary appears on the 1st of each month. Compare actual vs budgeted spending. Celebrate wins, learn from overages!",
        "Comparison tool shows month-over-month changes. Are you spending less on dining out? That's progress worth celebrating! 🎉",
        
        // Tips & Advice (4)
        "Money-saving tip: automate savings! Set up recurring transfers to savings. Pay yourself first before spending on wants.",
        "Investment tip: start early! A $100 monthly investment at 7% return grows to $50k in 20 years. Time in market beats timing! 📈",
        "To reduce debt, try the avalanche method (highest interest first) or snowball (smallest balance first). Both work - choose your motivation style!",
        "Build credit by paying bills on time, keeping utilization under 30%, and avoiding unnecessary hard inquiries. Future you will thank you!",
        
        // Technical (4)
        "You can export data to CSV in Settings → Data Management. Great for tax prep or personal spreadsheets! 📎",
        "Set notifications in Settings → Alerts. Get reminders for bill due dates, budget limits, or daily tracking. Stay on top without stress!",
        "Customize your profile with spending limits, currency, and preferred categories in Settings. Make the app work for YOU!",
        "Enable cloud sync in Settings to backup data. Switch phones without losing progress. Your financial journey is safe! ☁️",
        
        // App Features (3)
        "I can help track expenses, set budgets, monitor goals, show achievements, generate reports, and provide financial tips. What interests you most?",
        "Start by adding your first transaction! Tap +, enter $5 coffee, category 'Food'. See how dashboard updates? That's the power of tracking! ☕",
        "Toggle dark mode in Settings → Appearance. Easier on eyes for late-night budget planning! Some users track better at night.",
        
        // Feedback (2)
        "So glad you're enjoying CodeCash! ⭐ Your feedback helps us improve. Rate us on Play Store and share with friends!",
        "Awesome! The best budget app is one you actually use. Keep tracking - you're building life-changing habits! 💪",
        
        // Issues (2)
        "Sorry you're experiencing issues! Try Force Stop in App Settings, clear cache, or restart device. Still problems? Email support@codecash.com",
        "Performance tip: Keep app updated, clear old transactions annually, and restart weekly. Delete unused categories to speed up loading!",
        
        // Specific Scenarios (3)
        "Set bill reminders by tapping a bill in your list → Add Reminder. Get notified 3 days before due - never pay late fees again! ⏰",
        "Track subscriptions in Bills & Recurring section. See annual costs total - you might find $240/year on unused apps! Cancel ruthlessly!",
        "Recurring expenses deserve monthly review. Have any subscriptions increased? Negotiate or switch providers to save hundreds annually!"
    )
    
    /**
     * Get bot response based on keyword matching in user input
     */
    fun getResponse(userMessage: String): String {
        val normalizedMessage = userMessage.lowercase().trim()
        
        // Check for exit/end commands
        val exitKeywords = arrayOf("end", "thanks", "thank you", "exit", "close", "bye", "goodbye", "stop")
        if (exitKeywords.any { normalizedMessage.contains(it) }) {
            return "Thanks for chatting with CodeBot! 👋 Keep tracking those expenses and building your financial future. Come back anytime you need help. Take care!"
        }
        
        // Check for random responses to keep chat engaging
        val funResponses = arrayOf(
            "Did you know? People who track expenses save 30% more per month than those who don't! 📊",
            "Fun fact: The average person spends $200/month on subscriptions they forgot about. Time to audit?",
            "Money tip: The 5-second rule for impulse buys - wait 5 seconds before any non-essential purchase!"
        )
        
        // Find matching keywords and return corresponding response
        for (i in keywords.indices) {
            if (keywords[i].any { keyword -> normalizedMessage.contains(keyword) }) {
                // Return the matching response (same index in parallel array)
                val responseIndex = if (i < responses.size) i else responses.size - 1
                return responses[responseIndex]
            }
        }
        
        // Default responses when no keywords match
        val defaultResponses = arrayOf(
            "Interesting! I'm still learning. Could you rephrase that? Try asking about adding transactions, setting budgets, or savings goals! 📝",
            "Great question! For specific help, mention: 'add transaction', 'create budget', 'savings goal', or 'achievements'. What would you like to know?",
            "I specialize in budget tracking! Try keywords like: expenses, budget, savings, reports, or categories. How can I assist with your finances today?",
            funResponses[Random.nextInt(funResponses.size)]
        )
        
        return defaultResponses[Random.nextInt(defaultResponses.size)]
    }
    
    /**
     * Alternative method to get contextual responses with more personalization
     */
    fun getPersonalizedResponse(userMessage: String, userName: String? = null): String {
        val baseResponse = getResponse(userMessage)
        
        // Add personal touch for certain keywords
        return when {
            baseResponse.contains("Hello", ignoreCase = true) && !userName.isNullOrEmpty() -> 
                "Hello $userName! ${baseResponse.substringAfter("!")}"
            baseResponse.contains("Keep tracking") -> 
                "$baseResponse Remember, consistency > intensity!"
            else -> baseResponse
        }
    }
}
