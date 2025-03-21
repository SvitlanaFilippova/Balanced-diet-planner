package com.balanceddietplanner.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.balanceddietplanner.app.AppNavGraph
import com.balanceddietplanner.bottom_navigation.BottomNavigation

@Preview
@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavigation(navController = navController) }
    ) { contentPadding ->
        AppNavGraph(
            navController = navController,
            modifier = Modifier.padding(contentPadding)
        )
    }
}




