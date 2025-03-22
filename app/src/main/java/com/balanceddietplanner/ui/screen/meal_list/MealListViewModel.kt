package com.balanceddietplanner.ui.screen.meal_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MealListViewModel : ViewModel() {
    private val _state = MutableStateFlow(MealListState())
    val state: StateFlow<MealListState> = _state.asStateFlow()
}