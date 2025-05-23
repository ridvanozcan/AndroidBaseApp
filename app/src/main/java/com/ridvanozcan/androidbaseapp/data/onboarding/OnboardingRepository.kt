package com.ridvanozcan.androidbaseapp.data.onboarding

import kotlinx.coroutines.flow.Flow

interface OnboardingRepository {
    fun onboardingSeen(): Flow<Boolean>
    suspend fun setOnboardingSeen(seen: Boolean)
}