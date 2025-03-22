package com.balanceddietplanner.ui.di

import com.balanceddietplanner.ui.screen.food_diary.DiaryViewModel
import com.balanceddietplanner.ui.screen.meal_list.MealListViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {

    viewModelOf(::DiaryViewModel)
    viewModelOf(::MealListViewModel)

}