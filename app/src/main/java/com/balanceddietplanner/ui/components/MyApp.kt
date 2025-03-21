package com.balanceddietplanner.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.balanceddietplanner.app.AppNavGraph

@Preview
@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { contentPadding -> // Используем contentPadding
        AppNavGraph(
            navController = navController,
            modifier = Modifier.padding(contentPadding) // Применяем contentPadding
        )
    }
}




