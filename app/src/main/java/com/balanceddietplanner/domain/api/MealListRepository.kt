package com.balanceddietplanner.domain.api

import com.balanceddietplanner.domain.model.Meal
import kotlinx.coroutines.flow.Flow

interface MealListRepository {
    fun getMealList(): Flow<List<Meal>>
}