package com.balanceddietplanner.utils

import com.balanceddietplanner.data.meal_list.db.entity.MealEntity
import com.balanceddietplanner.domain.model.Meal

fun MealEntity.toDomain() = Meal(
    id = id,
    name = name ?: "",
    ingredients = ingredients ?: "",
    cookingMethod = cookingMethod ?: "",
    icons = icons ?: "",
    servings = servings?.toInt() ?: 0,
    standardPortion = standardPortion ?: "",
    unit = unit ?: "",
    calories = calories?.toFloat() ?: 0f,
    protein = protein?.toFloat() ?: 0f,
    fat = fat?.toFloat() ?: 0f,
    carbs = carbs?.toFloat() ?: 0f,
    isBreakfast = breakfast == "TRUE",
    isLunch = lunch == "TRUE",
    isDinner = dinner == "TRUE",
    isSnack = snack == "TRUE",
    highProtein = highProtein == "TRUE",
    grains = grains == "TRUE",
    vegetables = vegetables == "TRUE",
    fish = fish == "TRUE",
    soup = soup == "TRUE",
    potatoes = potatoes == "TRUE",
    eggs = eggs == "TRUE",
    fruits = fruits == "TRUE",
    cottageCheese = cottageCheese == "TRUE",
    selfContainedDish = selfContainedDish == "TRUE",
    sideDish = sideDish == "TRUE",
)


