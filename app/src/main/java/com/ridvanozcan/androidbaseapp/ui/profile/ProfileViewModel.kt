package com.ridvanozcan.androidbaseapp.ui.profile

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ridvanozcan.androidbaseapp.data.theme.ThemePreferenceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    val themePreferenceRepository: ThemePreferenceRepository
) : ViewModel() {
    private val _isDarkTheme = mutableStateOf(false)
    val isDarkTheme: State<Boolean> = _isDarkTheme

    init {
        themePreferenceRepository.isDarkMode()
            .onEach { isDarkMode ->
                _isDarkTheme.value = isDarkMode
            }
            .launchIn(viewModelScope)
    }

    fun setDarkModeSelection(isDarkModeSelection: Boolean) {
        viewModelScope.launch {
            _isDarkTheme.value = isDarkModeSelection
            themePreferenceRepository.setDarkModeSelection(isDarkModeSelection)
        }
    }
}