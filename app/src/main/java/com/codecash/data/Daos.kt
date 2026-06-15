package com.codecash.data

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    fun getUserByEmail(email: String): User?

    @Query("SELECT * FROM users WHERE username = :username LIMIT 1")
    fun getUserByUsername(username: String): User?

    @Query("SELECT * FROM users WHERE id = :id")
    fun getUserById(id: Int): User?

    @Insert
    fun insert(user: User): Long

    @Update
    fun update(user: User)

    @Query("DELETE FROM users WHERE id = :id")
    fun deleteById(id: Int)
}

@Dao
interface CategoryDao {
    @Query("SELECT * FROM categories")
    fun getAll(): List<Category>

    @Query("SELECT * FROM categories WHERE id = :id")
    fun getById(id: Int): Category?

    @Insert
    fun insert(category: Category): Long

    @Delete
    fun delete(category: Category)

    @Query("DELETE FROM categories WHERE id = :id")
    fun deleteById(id: Int)
}

@Dao
interface TransactionDao {
    @Query("SELECT * FROM transactions WHERE userId = :userId AND date BETWEEN :start AND :end ORDER BY date DESC")
    fun getForPeriod(userId: Int, start: Long, end: Long): List<Transaction>

    @Query("SELECT * FROM transactions WHERE userId = :userId")
    fun getForUser(userId: Int): List<Transaction>

    @Query("SELECT * FROM transactions WHERE id = :id")
    fun getById(id: Int): Transaction?

    @Insert
    fun insert(transaction: Transaction): Long

    @Delete
    fun delete(transaction: Transaction)

    @Query("DELETE FROM transactions WHERE id = :id")
    fun deleteById(id: Int)

    @Query("UPDATE transactions SET photoPath = :path WHERE id = :id")
    fun updatePhotoPath(id: Int, path: String?)
}

@Dao
interface BudgetGoalDao {
    @Query("SELECT * FROM budget_goals WHERE userId = :userId AND categoryId = :categoryId AND monthYear = :monthYear LIMIT 1")
    fun getGoal(userId: Int, categoryId: Int, monthYear: String): BudgetGoal?

    @Query("SELECT * FROM budget_goals WHERE userId = :userId AND monthYear = :monthYear")
    fun getGoalsForMonth(userId: Int, monthYear: String): List<BudgetGoal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(goal: BudgetGoal): Long
}

@Dao
interface AchievementDao {
    @Query("SELECT * FROM achievements WHERE userId = :userId")
    fun getForUser(userId: Int): List<Achievement>

    @Query("SELECT EXISTS(SELECT 1 FROM achievements WHERE userId = :userId AND title = :title)")
    fun hasAchievement(userId: Int, title: String): Boolean

    @Insert
    fun insert(achievement: Achievement): Long
}
