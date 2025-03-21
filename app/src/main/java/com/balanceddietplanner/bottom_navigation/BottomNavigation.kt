package com.balanceddietplanner.bottom_navigation

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.balanceddietplanner.R
import com.balanceddietplanner.ui.theme.AppGreen
import com.balanceddietplanner.ui.theme.Dimens

@Composable
fun BottomNavigation(
    navController: NavController
) {
    val items = listOf(
        BottomItem.MealList to stringResource(R.string.bottom_nav_meal_list),
        BottomItem.Stats to stringResource(R.string.bottom_nav_stats),
        BottomItem.Diary to stringResource(R.string.bottom_nav_diary),
        BottomItem.Plan to stringResource(R.string.bottom_nav_plan),
        BottomItem.Profile to stringResource(R.string.bottom_nav_profile),
    )

    BottomAppBar(
        containerColor = Color.White,
        tonalElevation = Dimens.BottomBarElevation8,
        modifier = Modifier.height(Dimens.BottomBarHeight80)
    )
    {
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

        items.forEach { (item, title) ->
            val isSelected = currentRoute == item.route
            val iconSize = if (isSelected) {
                Dimens.BottomBarIconSelected28
            } else {
                Dimens.BottomBarIconUnselected24
            }

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconId),
                        contentDescription = "Icon",
                        modifier = Modifier.size(iconSize)
                    )
                },
                label = {
                    Text(
                        text = title,
                        fontSize = Dimens.TextExtraSmall9,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = AppGreen,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = AppGreen,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color.Transparent
                ),
            )
        }
    }
}