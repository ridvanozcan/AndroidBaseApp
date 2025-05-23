package com.ridvanozcan.androidbaseapp.data.onboarding

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
class OnboardingRepositoryImpl @Inject constructor(
    private val context: Context
) : OnboardingRepository {

    private val ONBOARDING_SEEN_KEY = booleanPreferencesKey("onboarding_seen")

    override fun onboardingSeen(): Flow<Boolean> =
        context.settingsDataStore.data
            .map { preferences ->
                preferences[ONBOARDING_SEEN_KEY] == true
            }
    override suspend fun setOnboardingSeen(seen: Boolean) {
        context.settingsDataStore.edit { preferences ->
            preferences[ONBOARDING_SEEN_KEY] = seen
        }
    }
}