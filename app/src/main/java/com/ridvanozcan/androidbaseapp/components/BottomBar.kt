package com.ridvanozcan.androidbaseapp.components

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.ridvanozcan.androidbaseapp.currentRoute
import com.ridvanozcan.androidbaseapp.navigation.Routes
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme

@Composable
fun BottomBar(navController: NavController) {
    NavigationBar(containerColor =AndroidBaseAppTheme.colors.elevation2.color) {
        NavigationBarItem(
            modifier = Modifier.background(AndroidBaseAppTheme.colors.elevation2.color),
            selected = currentRoute(navController) == Routes.HOME,
            onClick = {
                navController.navigate(Routes.HOME) {
                    launchSingleTop = true
                    restoreState = true
                    popUpTo(0)
                }
            },
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AndroidBaseAppTheme.colors.iconFocus.color,
                unselectedIconColor = AndroidBaseAppTheme.colors.iconInactive.color,
                selectedTextColor = AndroidBaseAppTheme.colors.textFocus.color,
                unselectedTextColor = AndroidBaseAppTheme.colors.iconInactive.color,
                indicatorColor = Color.Transparent
            )
        )
        NavigationBarItem(
            modifier = Modifier.background(AndroidBaseAppTheme.colors.elevation2.color),
            selected = currentRoute(navController) == Routes.PROFILE,
            onClick = {
                navController.navigate(Routes.PROFILE) {
                    launchSingleTop = true
                    restoreState = true
                }
            },
            icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
            label = { Text("Profile") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AndroidBaseAppTheme.colors.iconFocus.color,
                unselectedIconColor = AndroidBaseAppTheme.colors.iconInactive.color,
                selectedTextColor = AndroidBaseAppTheme.colors.textFocus.color,
                unselectedTextColor = AndroidBaseAppTheme.colors.iconInactive.color,
                indicatorColor = Color.Transparent
            )
        )
    }
}