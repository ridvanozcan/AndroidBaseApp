package com.ridvanozcan.androidbaseapp.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ridvanozcan.androidbaseapp.R
import com.ridvanozcan.androidbaseapp.ui.theme.AndroidBaseAppTheme

@Composable
fun ProfileScreen(viewModel: ProfileViewModel = hiltViewModel()) {
    val isDark = viewModel.isDarkTheme.value

    Column(
        modifier = Modifier
            .fillMaxSize().background(
                AndroidBaseAppTheme.colors.basement.color
            ).padding(16.dp)
    ) {
        Text(text = stringResource(R.string.profile_name), color = AndroidBaseAppTheme.colors.textFocus.color)

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Dark Mode", color = AndroidBaseAppTheme.colors.textFocus.color)
            Spacer(modifier = Modifier.weight(1f))
            Switch(
                checked = isDark,
                onCheckedChange = { viewModel.setDarkModeSelection(it) },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = AndroidBaseAppTheme.colors.elevation2.color,
                    checkedTrackColor = AndroidBaseAppTheme.colors.elevation4.color,
                    uncheckedThumbColor = AndroidBaseAppTheme.colors.iconInactive.color,
                    uncheckedTrackColor = AndroidBaseAppTheme.colors.elevation2.color
                )
            )
        }
    }
}