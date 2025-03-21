package com.balanceddietplanner.ui.screens.food_diary

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.balanceddietplanner.ui.theme.Dimens

@Preview
@Composable
fun DiaryScreen() {
    val viewModel = DiaryViewModel()
    val state by viewModel.state.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "DiaryScreen",
            fontSize = Dimens.TextBig24
        )
//        when (state) {
//            is HomeState.Loading -> CircularProgressIndicator()
//            is HomeState.Content -> Button(onClick = { navController.navigate("details") }) {
//                Text("Go to Details")
//            }
//        }
    }
}

