package com.ridvanozcan.androidbaseapp.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.ridvanozcan.androidbaseapp.ui.onboarding.OnboardingViewModel
import kotlinx.coroutines.delay
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ridvanozcan.androidbaseapp.navigation.Routes
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme

@Composable
fun SplashScreen(
    onboardingViewModel: OnboardingViewModel = hiltViewModel(),
    navController: NavHostController
) {
    val onboardingSeen by onboardingViewModel.onboardingSeen.collectAsState(initial = false)

    // Splash ekranda kısa gecikme ve yönlendirme
    LaunchedEffect(onboardingSeen) {
        delay(3000) // Splash ekran 3 saniye gösterilsin
        if (onboardingSeen) {
            navController.navigate(Routes.HOME) {
                popUpTo(Routes.SPLASH) { inclusive = true }
            }
        } else {
            navController.navigate(Routes.ONBOARDING) {
                popUpTo(Routes.SPLASH) { inclusive = true }
            }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize().background(color = AndroidBaseAppTheme.colors.basement.color),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Splash Screen", style = MaterialTheme.typography.bodyMedium, color = AndroidBaseAppTheme.colors.textFocus.color)
    }
}
