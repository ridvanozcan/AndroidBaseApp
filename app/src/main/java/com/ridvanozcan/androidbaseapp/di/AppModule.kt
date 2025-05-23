package com.ridvanozcan.androidbaseapp.di

import android.content.Context
import com.ridvanozcan.androidbaseapp.data.onboarding.OnboardingRepository
import com.ridvanozcan.androidbaseapp.data.onboarding.OnboardingRepositoryImpl
import com.ridvanozcan.androidbaseapp.data.theme.ThemePreferenceRepository
import com.ridvanozcan.androidbaseapp.data.theme.ThemePreferenceRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOnboardingRepository(
        @ApplicationContext context: Context
    ): OnboardingRepository {
        return OnboardingRepositoryImpl(context)
    }

    @Provides
    @Singleton
    fun provideThemePreferencesRepository(
        @ApplicationContext context: Context
    ): ThemePreferenceRepository {
        return ThemePreferenceRepositoryImpl(context)
    }
}