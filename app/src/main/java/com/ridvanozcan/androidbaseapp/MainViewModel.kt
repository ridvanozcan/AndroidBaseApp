package com.ridvanozcan.androidbaseapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ridvanozcan.androidbaseapp.data.theme.ThemePreferenceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val themePreferenceRepository: ThemePreferenceRepository
): ViewModel() {
    val isDarkTheme = themePreferenceRepository.isDarkMode().stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        false
    )
}