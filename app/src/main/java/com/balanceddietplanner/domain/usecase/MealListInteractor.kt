package com.balanceddietplanner.domain.usecase

import com.balanceddietplanner.domain.model.Meal
import kotlinx.coroutines.flow.Flow

interface MealListInteractor {
    fun getMealList(): Flow<List<Meal>>
}