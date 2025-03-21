package com.balanceddietplanner.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat.setDecorFitsSystemWindows
import com.balanceddietplanner.ui.components.MyApp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}


