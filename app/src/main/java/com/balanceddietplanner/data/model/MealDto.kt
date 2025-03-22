package com.balanceddietplanner.data.model

data class MealDto(
    val id: String,
    val name: String,
    val ingredients: String,
    val cookingMethod: String,
    val icons: String,

    val servings: Int,
    val standardPortion: String,
    val unit: String,

    val calories: Float,
    val protein: Float,
    val fat: Float,
    val carbs: Float,

    val isBreakfast: Boolean,
    val isLunch: Boolean,
    val isDinner: Boolean,
    val isSnack: Boolean,

    val highProtein: Boolean,
    val grains: Boolean,
    val vegetables: Boolean,
    val fish: Boolean,
    val soup: Boolean,
    val potatoes: Boolean,
    val eggs: Boolean,
    val fruits: Boolean,
    val cottageCheese: Boolean,
    val selfContainedDish: Boolean,
    val sideDish: Boolean
)