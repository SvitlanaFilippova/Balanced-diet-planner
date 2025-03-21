package com.balanceddietplanner.ui.screen.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state.asStateFlow()

    fun dispatch(intent: HomeIntent) {
//        when (intent) {
//            is HomeIntent.LoadProfile -> loadProfile()
//            is HomeIntent.UpdateName -> updateName(intent.newName)
    }

}


