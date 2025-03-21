package com.balanceddietplanner.ui.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    val viewModel = HomeViewModel()
    val state by viewModel.state.collectAsState()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Hello world")
//        when (state) {
//            is HomeState.Loading -> CircularProgressIndicator()
//            is HomeState.Content -> Button(onClick = { navController.navigate("details") }) {
//                Text("Go to Details")
//            }
//        }
    }
}

