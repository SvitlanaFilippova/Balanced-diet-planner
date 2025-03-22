package com.balanceddietplanner.data.di

import androidx.room.Room
import com.balanceddietplanner.data.AppDatabase
import com.balanceddietplanner.utils.Constants.BDP_DATABASE_NAME
import com.google.gson.Gson
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {

    // AppDatabase
    single {
        Room.databaseBuilder(
            androidContext().applicationContext,
            AppDatabase::class.java, BDP_DATABASE_NAME
        ).createFromAsset("databases/menu_db.db")
            .build()
    }

    // mealDao
    single {
        get<AppDatabase>().mealDao()
    }

    // Gson
    singleOf(::Gson)

}