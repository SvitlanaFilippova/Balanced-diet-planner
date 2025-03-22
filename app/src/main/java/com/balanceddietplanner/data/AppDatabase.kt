package com.balanceddietplanner.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.balanceddietplanner.data.meal_list.db.dao.MealDao
import com.balanceddietplanner.data.meal_list.db.entity.MealEntity

@Database(entities = [MealEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun mealDao(): MealDao
}