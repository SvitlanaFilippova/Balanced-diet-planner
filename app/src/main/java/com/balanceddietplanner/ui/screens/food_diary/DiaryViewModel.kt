package com.balanceddietplanner.ui.screens.food_diary

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DiaryViewModel
@Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(DiaryState())
    val state: StateFlow<DiaryState> = _state.asStateFlow()

    fun dispatch(intent: DiaryIntent) {
//        when (intent) {
//            is HomeIntent.LoadProfile -> loadProfile()
//            is HomeIntent.UpdateName -> updateName(intent.newName)
    }

}


