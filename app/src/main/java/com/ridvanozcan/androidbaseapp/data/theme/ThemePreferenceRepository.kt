package com.ridvanozcan.androidbaseapp.data.theme

import kotlinx.coroutines.flow.Flow

interface ThemePreferenceRepository {
    fun isDarkMode(): Flow<Boolean>
    suspend fun setDarkModeSelection(isDarkModeSelection: Boolean)
}