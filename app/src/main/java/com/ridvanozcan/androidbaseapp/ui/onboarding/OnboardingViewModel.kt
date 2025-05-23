package com.ridvanozcan.androidbaseapp.ui.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ridvanozcan.androidbaseapp.data.onboarding.OnboardingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.onEach

@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val onboardingRepository: OnboardingRepository
) : ViewModel() {
    private val _onboardingSeen = MutableStateFlow(false)
    val onboardingSeen: StateFlow<Boolean> = _onboardingSeen

    init {
        onboardingRepository.onboardingSeen()
            .onEach { seen ->
                _onboardingSeen.value = seen
            }
            .launchIn(viewModelScope)
    }

    fun setOnboardingSeen() {
        viewModelScope.launch {
            onboardingRepository.setOnboardingSeen(true)
        }
    }
}