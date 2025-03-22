package com.balanceddietplanner.ui.screen.food_diary

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DiaryViewModel : ViewModel() {

    private val _state = MutableStateFlow(DiaryState())
    val state: StateFlow<DiaryState> = _state.asStateFlow()

    fun dispatch(intent: DiaryIntent) {
//        when (intent) {
//            is HomeIntent.LoadProfile -> loadProfile()
//            is HomeIntent.UpdateName -> updateName(intent.newName)
    }

}


