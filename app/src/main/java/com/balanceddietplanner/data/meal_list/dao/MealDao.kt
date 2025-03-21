package com.balanceddietplanner.data.meal_list.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.balanceddietplanner.data.meal_list.entity.MealEntity

@Dao
interface MealDao {
    @Insert
    suspend fun insert(meal: MealEntity)

    @Query("SELECT * FROM MealList")
    suspend fun getAllMeals(): List<MealEntity>
}