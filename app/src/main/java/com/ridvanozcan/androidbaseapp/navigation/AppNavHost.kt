package com.ridvanozcan.androidbaseapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ridvanozcan.androidbaseapp.ui.home.HomeScreen
import com.ridvanozcan.androidbaseapp.ui.onboarding.OnboardingScreen
import com.ridvanozcan.androidbaseapp.ui.profile.ProfileScreen
import com.ridvanozcan.androidbaseapp.ui.splash.SplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController, startDestination = Routes.SPLASH) {
        composable(Routes.SPLASH) { SplashScreen(navController = navController) }
        composable(Routes.ONBOARDING) {
            OnboardingScreen(onGetStartedClick = {
                navController.navigate(Routes.HOME) {
                    popUpTo(Routes.ONBOARDING) {
                        inclusive = true
                    }
                }
            })
        }
        composable(Routes.LOGIN) { }
        composable(Routes.HOME) { HomeScreen() }
        composable(Routes.PROFILE) { ProfileScreen() }
    }
}

object Routes {
    const val SPLASH = "splash"
    const val ONBOARDING = "onboarding"
    const val LOGIN = "login"
    const val HOME = "home"
    const val PROFILE = "profile"
}