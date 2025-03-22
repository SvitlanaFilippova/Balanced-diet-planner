package com.balanceddietplanner.domain.di

import com.balanceddietplanner.domain.impl.MealListInteractorImpl
import com.balanceddietplanner.domain.usecase.MealListInteractor
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val interactorModule = module {

    singleOf(::MealListInteractorImpl) { bind<MealListInteractor>() }
}