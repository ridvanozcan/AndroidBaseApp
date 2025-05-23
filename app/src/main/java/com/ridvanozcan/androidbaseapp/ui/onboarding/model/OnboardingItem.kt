package com.ridvanozcan.androidbaseapp.ui.onboarding.model

import com.ridvanozcan.androidbaseapp.R

data class OnboardingItem(
    val imageRes: Int,
    val title: String,
    val description: String
)

val onboardingItems = listOf(
    OnboardingItem(
        imageRes = R.drawable.profile_default,
        title = "Hızlı Öğren",
        description = "İstediğin her konuyu eğlenceli şekilde öğren."
    ),
    OnboardingItem(
        imageRes = R.drawable.profile_default,
        title = "Uygulamalı İlerle",
        description = "Gerçek hayattan örneklerle pratik yap."
    ),
    OnboardingItem(
        imageRes = R.drawable.profile_default,
        title = "Başarıya Ulaş",
        description = "Hedeflerine doğru kararlı adımlarla ilerle."
    )
)