package com.balanceddietplanner.data.repository

import com.balanceddietplanner.data.meal_list.db.dao.MealDao
import com.balanceddietplanner.domain.api.MealListRepository
import com.balanceddietplanner.domain.model.Meal
import com.balanceddietplanner.utils.toDomain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MealListRepositoryImpl(private val mealDao: MealDao) : MealListRepository {
    override fun getMealList(): Flow<List<Meal>> = flow {
        val meals = mealDao.getAllMeals()
        emit((meals.map { it.toDomain() }))

    }
}