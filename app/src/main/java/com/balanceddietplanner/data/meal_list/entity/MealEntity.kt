package com.balanceddietplanner.data.meal_list.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MealList")
data class MealEntity(
    @PrimaryKey
    @ColumnInfo(name = "ID")
    val id: String,

    @ColumnInfo(name = "Завтрак")
    val breakfast: String?,

    @ColumnInfo(name = "Обед")
    val lunch: String?,

    @ColumnInfo(name = "Ужин")
    val dinner: String?,

    @ColumnInfo(name = "Перекус")
    val snack: String?,

    @ColumnInfo(name = "Название")
    val name: String?,

    @ColumnInfo(name = "Иконки")
    val icons: String?,

    @ColumnInfo(name = "Игредиенты")
    val ingredients: String?,

    @ColumnInfo(name = "Способ приготовления")
    val cookingMethod: String?,

    @ColumnInfo(name = "На сколько раз готовлю")
    val servings: String?,

    @ColumnInfo(name = "Станд. порция")
    val standardPortion: String?,

    @ColumnInfo(name = "Единица измерения")
    val unit: String?,

    @ColumnInfo(name = "Ккал")
    val calories: String?,

    @ColumnInfo(name = "Б")
    val protein: String?,

    @ColumnInfo(name = "Ж")
    val fat: String?,

    @ColumnInfo(name = "У")
    val carbs: String?,

    @ColumnInfo(name = "Много белка")
    val highProtein: String?,

    @ColumnInfo(name = "Злаковые")
    val grains: String?,

    @ColumnInfo(name = "Овощи")
    val vegetables: String?,

    @ColumnInfo(name = "Рыба")
    val fish: String?,

    @ColumnInfo(name = "Первое")
    val soup: String?,

    @ColumnInfo(name = "Картофель")
    val potatoes: String?,

    @ColumnInfo(name = "Яйца")
    val eggs: String?,

    @ColumnInfo(name = "Фрукты")
    val fruits: String?,

    @ColumnInfo(name = "Творог")
    val cottageCheese: String?,

    @ColumnInfo(name = "Самодостаточное блюдо")
    val selfContainedDish: String?,

    @ColumnInfo(name = "Гарнир")
    val sideDish: String?
)