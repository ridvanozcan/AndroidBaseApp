package com.ridvanozcan.androidbaseapp.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.LocalOverscrollConfiguration
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.ridvanozcan.androidbaseapp.util.color.BaseColorScheme
import com.ridvanozcan.androidbaseapp.util.color.LocalColorScheme
import com.ridvanozcan.androidbaseapp.util.color.baseDarkColors
import com.ridvanozcan.androidbaseapp.util.color.baseLightColors

private val darkColorPalette = baseDarkColors()

private val lightColorPalette = baseLightColors()

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AndroidBaseAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkColorPalette
    } else {
        lightColorPalette
    }

    CompositionLocalProvider(
        LocalColorScheme provides colors,
        LocalOverscrollConfiguration provides null
    ) {
        content()
    }
}

object AndroidBaseAppTheme {
    val colors: BaseColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current
}