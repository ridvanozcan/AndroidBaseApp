package com.ridvanozcan.androidbaseapp.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ridvanozcan.androidbaseapp.ui.onboarding.model.OnboardingItem
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme

@Composable
fun OnboardingPage(item: OnboardingItem) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.title,
            modifier = Modifier.size(240.dp)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = item.title, style = MaterialTheme.typography.headlineSmall, color = AndroidBaseAppTheme.colors.textFocus.color)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = item.description,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            color = AndroidBaseAppTheme.colors.textSecondary.color
        )
    }
}