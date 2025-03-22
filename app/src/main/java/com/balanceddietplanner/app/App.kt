package com.balanceddietplanner.app

import android.app.Application
import com.balanceddietplanner.data.di.dataModule
import com.balanceddietplanner.domain.di.interactorModule
import com.balanceddietplanner.domain.di.repositoryModule
import com.balanceddietplanner.ui.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(repositoryModule, interactorModule, viewModelModule, dataModule)
        }
    }
}