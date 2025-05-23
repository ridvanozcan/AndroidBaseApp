package com.ridvanozcan.androidbaseapp.ui.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ridvanozcan.androidbaseapp.ui.onboarding.model.onboardingItems
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(
    viewModel: OnboardingViewModel = hiltViewModel(),
    onGetStartedClick: () -> Unit
) {
    val items = onboardingItems
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { items.size }
    )

    val coroutineScope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize().background(color = AndroidBaseAppTheme.colors.basement.color)) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize(),
        ) { page ->
            OnboardingPage(item = items[page])
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 100.dp)
        ) {
            repeat(items.size) { index ->
                val color = if (pagerState.currentPage == index) AndroidBaseAppTheme.colors.primary.color else AndroidBaseAppTheme.colors.elevation3.color
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(10.dp)
                        .clip(CircleShape)
                        .background(color)
                )
            }
        }

        if (pagerState.currentPage == items.lastIndex) {
            Button(
                onClick = {
                    viewModel.setOnboardingSeen()
                    onGetStartedClick()
                },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(24.dp),
                colors = ButtonColors(
                    containerColor = AndroidBaseAppTheme.colors.primary.color,
                    contentColor = AndroidBaseAppTheme.colors.primary.color,
                    disabledContainerColor = AndroidBaseAppTheme.colors.primary.color,
                    disabledContentColor = AndroidBaseAppTheme.colors.primary.color
                )
            ) {
                Text("Devam Et", color = AndroidBaseAppTheme.colors.pureWhite.color)
            }
        }
    }
}