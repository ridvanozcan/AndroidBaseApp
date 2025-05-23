package com.ridvanozcan.androidbaseapp.data.theme

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.ridvanozcan.androidbaseapp.util.settingsDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ThemePreferenceRepositoryImpl @Inject constructor(
    private val context: Context
) : ThemePreferenceRepository {

    companion object {
        val DARK_THEME_KEY = booleanPreferencesKey("dark_theme")
    }

    override fun isDarkMode(): Flow<Boolean> =
        context.settingsDataStore.data
            .map { preferences ->
                preferences[DARK_THEME_KEY] == true
            }

    override suspend fun setDarkModeSelection(seen: Boolean) {
        context.settingsDataStore.edit { preferences ->
            preferences[DARK_THEME_KEY] = seen
        }
    }
}