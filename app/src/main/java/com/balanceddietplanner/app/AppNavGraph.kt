package com.balanceddietplanner.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.balanceddietplanner.ui.screen.food_diary.DiaryScreen
import com.balanceddietplanner.ui.screen.meal_list.MealListScreen
import com.balanceddietplanner.ui.screen.plan.PlanScreen
import com.balanceddietplanner.ui.screen.profile.ProfileScreen
import com.balanceddietplanner.ui.screen.stats.StatsScreen
import com.balanceddietplanner.utils.Constants.DIARY
import com.balanceddietplanner.utils.Constants.MEAL_LIST
import com.balanceddietplanner.utils.Constants.PLAN
import com.balanceddietplanner.utils.Constants.PROFILE
import com.balanceddietplanner.utils.Constants.STATS

@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController,
        startDestination = DIARY,
        modifier = modifier
    ) {
        composable(DIARY) { DiaryScreen() }
        composable(MEAL_LIST) { MealListScreen() }
        composable(STATS) { StatsScreen() }
        composable(PLAN) { PlanScreen() }
        composable(PROFILE) { ProfileScreen() }

    }
}