package com.balanceddietplanner.bottom_navigation

import com.balanceddietplanner.R
import com.balanceddietplanner.utils.Constants.DIARY
import com.balanceddietplanner.utils.Constants.MEAL_LIST
import com.balanceddietplanner.utils.Constants.PLAN
import com.balanceddietplanner.utils.Constants.PROFILE
import com.balanceddietplanner.utils.Constants.STATS

sealed class BottomItem(val iconId: Int, val route: String) {
    data object Diary : BottomItem(R.drawable.icon_menu, DIARY)
    data object MealList : BottomItem(R.drawable.icon_food, MEAL_LIST)
    data object Stats : BottomItem(R.drawable.icon_stats, STATS)
    data object Plan : BottomItem(R.drawable.icon_calendar, PLAN)
    data object Profile : BottomItem(R.drawable.icon_users, PROFILE)
}