package com.balanceddietplanner.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.balanceddietplanner.data.meal_list.dao.MealDao
import com.balanceddietplanner.data.meal_list.entity.MealEntity

@Database(entities = [MealEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun mealDao(): MealDao

    companion object {
        fun getDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "your_db.db"
            ).createFromAsset("databases/menu_db.db")
                .build()
        }
    }
}