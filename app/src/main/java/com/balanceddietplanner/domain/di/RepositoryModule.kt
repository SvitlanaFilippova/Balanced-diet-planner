package com.balanceddietplanner.domain.di

import com.balanceddietplanner.data.repository.MealListRepositoryImpl
import com.balanceddietplanner.domain.api.MealListRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {

    singleOf(::MealListRepositoryImpl) { bind<MealListRepository>() }

}