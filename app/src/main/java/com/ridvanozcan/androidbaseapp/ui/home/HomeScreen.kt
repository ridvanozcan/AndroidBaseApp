package com.ridvanozcan.androidbaseapp.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ridvanozcan.androidbaseapp.R
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme

@Composable
fun HomeScreen() {
    Box(
    modifier = Modifier.fillMaxSize().background(AndroidBaseAppTheme.colors.basement.color),
    contentAlignment = Alignment.Center
    ) {
        Text(text = stringResource(R.string.home_name), color = AndroidBaseAppTheme.colors.textFocus.color)
    }
}