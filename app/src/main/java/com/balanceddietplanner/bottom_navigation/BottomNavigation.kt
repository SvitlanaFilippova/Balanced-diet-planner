package com.balanceddietplanner.bottom_navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.balanceddietplanner.R
import com.balanceddietplanner.ui.theme.AppGreen
import com.balanceddietplanner.ui.theme.Dimens.Elevation8
import com.balanceddietplanner.ui.theme.Dimens.TextExtraSmall9

@Composable
fun BottomNavigation(
    navController: NavController
) {
    val items = listOf(
        BottomItem.Diary to stringResource(R.string.bottom_nav_diary),
        BottomItem.MealList to stringResource(R.string.bottom_nav_meal_list),
        BottomItem.Stats to stringResource(R.string.bottom_nav_stats),
        BottomItem.Plan to stringResource(R.string.bottom_nav_plan),
        BottomItem.Profile to stringResource(R.string.bottom_nav_profile),
    )

    NavigationBar(
        containerColor = Color.White,
        tonalElevation = Elevation8
    )
    {
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

        items.forEach { (item, title) ->
            val isSelected = currentRoute == item.route

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconId),
                        contentDescription = "Icon"
                    )
                },
                label = {
                    Text(
                        text = title,
                        fontSize = TextExtraSmall9
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = AppGreen, // Цвет иконки при выборе
                    unselectedIconColor = Color.Gray, // Цвет иконки без выбора
                    selectedTextColor = AppGreen, // Цвет текста при выборе
                    unselectedTextColor = Color.Gray, // Цвет текста без выбора
                    indicatorColor = Color.Transparent // Цвет фона выделенного элемента
                )

            )
        }
    }
}