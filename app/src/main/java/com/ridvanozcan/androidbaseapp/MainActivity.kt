package com.ridvanozcan.androidbaseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ridvanozcan.androidbaseapp.components.BottomBar
import com.ridvanozcan.androidbaseapp.navigation.AppNavHost
import com.ridvanozcan.androidbaseapp.navigation.Routes
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val mainViewModel: MainViewModel = hiltViewModel()
            val isDark by mainViewModel.isDarkTheme.collectAsState()

            AndroidBaseAppTheme(darkTheme = isDark) {
                val navController = rememberNavController()
                val currentDestination by navController.currentBackStackEntryAsState()
                val currentRoute = currentDestination?.destination?.route


                val showBottomBar = currentRoute in listOf(Routes.HOME, Routes.PROFILE)

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        if (showBottomBar) {
                            BottomBar(navController)
                        }
                    }
                ) { innerPadding ->
                    Surface(modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)) {
                        AppNavHost(navController = navController)
                    }
                }
            }
        }
    }
}

@Composable
fun currentRoute(navController: NavController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}