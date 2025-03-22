package com.balanceddietplanner.domain.impl

import com.balanceddietplanner.domain.api.MealListRepository
import com.balanceddietplanner.domain.model.Meal
import com.balanceddietplanner.domain.usecase.MealListInteractor
import kotlinx.coroutines.flow.Flow

class MealListInteractorImpl(private val repository: MealListRepository) : MealListInteractor {
    override fun getMealList(): Flow<List<Meal>> {
        return repository.getMealList()
    }
}