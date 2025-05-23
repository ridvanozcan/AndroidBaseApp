package com.ridvanozcan.androidbaseapp.util

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

val Context.settingsDataStore by preferencesDataStore("settings")