package com.ridvanozcan.androidbaseapp.util.color

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy

@Stable
class BaseColorScheme(
    primary: BaseColor,
    secondary: BaseColor,
    tertiary: BaseColor,
    basement: BaseColor,
    surface: BaseColor,
    elevation: BaseColor,
    elevation1: BaseColor,
    elevation2: BaseColor,
    elevation3: BaseColor,
    elevation4: BaseColor,
    segmentActive: BaseColor,
    textFocus: BaseColor,
    textSecondary: BaseColor,
    textTertiary: BaseColor,
    iconFocus: BaseColor,
    iconInactive: BaseColor,
    iconDisabled: BaseColor,
    pureWhite: BaseColor,
    pureDark: BaseColor,
    inverseSwap: BaseColor,
    inverseFocus: BaseColor,
    action01: BaseColor,
    action02: BaseColor,
    action03: BaseColor,
    action01Opacity20: BaseColor,
    action02Opacity20: BaseColor,
    action03Opacity20: BaseColor,
    action01Opacity10: BaseColor,
    action02Opacity10: BaseColor,
    action03Opacity10: BaseColor
) {
    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set
    var tertiary by mutableStateOf(tertiary, structuralEqualityPolicy())
        internal set
    var secondary by mutableStateOf(secondary, structuralEqualityPolicy())
        internal set
    var basement by mutableStateOf(basement, structuralEqualityPolicy())
        internal set
    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set
    var elevation by mutableStateOf(elevation, structuralEqualityPolicy())
        internal set
    var elevation1 by mutableStateOf(elevation1, structuralEqualityPolicy())
        internal set
    var elevation2 by mutableStateOf(elevation2, structuralEqualityPolicy())
        internal set
    var elevation3 by mutableStateOf(elevation3, structuralEqualityPolicy())
        internal set
    var elevation4 by mutableStateOf(elevation4, structuralEqualityPolicy())
        internal set
    var textFocus by mutableStateOf(textFocus, structuralEqualityPolicy())
        internal set
    var segmentActive by mutableStateOf(segmentActive, structuralEqualityPolicy())
        internal set
    var textSecondary by mutableStateOf(textSecondary, structuralEqualityPolicy())
        internal set
    var textTertiary by mutableStateOf(textTertiary, structuralEqualityPolicy())
        internal set
    var pureWhite by mutableStateOf(pureWhite, structuralEqualityPolicy())
        internal set
    var pureBlack by mutableStateOf(pureDark, structuralEqualityPolicy())
        internal set
    var iconFocus by mutableStateOf(iconFocus, structuralEqualityPolicy())
        internal set
    var iconInactive by mutableStateOf(iconInactive, structuralEqualityPolicy())
        internal set
    var iconDisabled by mutableStateOf(iconDisabled, structuralEqualityPolicy())
        internal set
    var inverseSwap by mutableStateOf(inverseSwap, structuralEqualityPolicy())
        internal set
    var inverseFocus by mutableStateOf(inverseFocus, structuralEqualityPolicy())
        internal set
    var action01 by mutableStateOf(action01, structuralEqualityPolicy())
        internal set
    var action02 by mutableStateOf(action02, structuralEqualityPolicy())
        internal set
    var action03 by mutableStateOf(action03, structuralEqualityPolicy())
        internal set
    var action01Opacity20 by mutableStateOf(action01Opacity20, structuralEqualityPolicy())
        internal set
    var action02Opacity20 by mutableStateOf(action02Opacity20, structuralEqualityPolicy())
        internal set
    var action03Opacity20 by mutableStateOf(action03Opacity20, structuralEqualityPolicy())
        internal set
    var action01Opacity10 by mutableStateOf(action01Opacity10, structuralEqualityPolicy())
        internal set
    var action02Opacity10 by mutableStateOf(action02Opacity10, structuralEqualityPolicy())
        internal set
    var action03Opacity10 by mutableStateOf(action03Opacity10, structuralEqualityPolicy())
        internal set

}

fun baseLightColors(
    primary: BaseColor = BaseLightColor.Primary,
    tertiary: BaseColor = BaseLightColor.Tertiary,
    secondary: BaseColor = BaseLightColor.Secondary,
    basement: BaseColor = BaseLightColor.Basement,
    surface: BaseColor = BaseLightColor.Surface,
    elevation: BaseColor = BaseLightColor.Elevation,
    elevation1: BaseColor = BaseLightColor.Elevation1,
    elevation2: BaseColor = BaseLightColor.Elevation2,
    elevation3: BaseColor = BaseLightColor.Elevation3,
    elevation4: BaseColor = BaseLightColor.Elevation4,
    segmentActive: BaseColor = BaseLightColor.SegmentActive,
    textFocus: BaseColor = BaseLightColor.TextFocus,
    textTertiary: BaseColor = BaseLightColor.TextTertiary,
    textSecondary: BaseColor = BaseLightColor.TextSecondary,
    iconDisabled: BaseColor = BaseLightColor.IconDisabled,
    iconFocus: BaseColor = BaseLightColor.IconFocus,
    iconInactive: BaseColor = BaseLightColor.IconInactive,
    inverseSwap: BaseColor = BaseLightColor.InverseSwap,
    inverseFocus: BaseColor = BaseLightColor.InverseFocus,
    pureWhite: BaseColor = BaseLightColor.PureWhite,
    pureBlack: BaseColor = BaseLightColor.PureBlack,
    action01: BaseColor = BaseLightColor.Action01,
    action02: BaseColor = BaseLightColor.Action02,
    action03: BaseColor = BaseLightColor.Action03,
    action01Opacity20: BaseColor = BaseLightColor.Action01Opacity20,
    action02Opacity20: BaseColor = BaseLightColor.Action02Opacity20,
    action03Opacity20: BaseColor = BaseLightColor.Action03Opacity20,
    action01Opacity10: BaseColor = BaseLightColor.Action01Opacity10,
    action02Opacity10: BaseColor = BaseLightColor.Action02Opacity10,
    action03Opacity10: BaseColor = BaseLightColor.Action03Opacity10
): BaseColorScheme = BaseColorScheme(
    primary = primary,
    secondary = secondary,
    tertiary = tertiary,
    basement = basement,
    surface = surface,
    elevation = elevation,
    elevation1 = elevation1,
    elevation2 = elevation2,
    elevation3 = elevation3,
    elevation4 = elevation4,
    segmentActive =segmentActive,
    textFocus = textFocus,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    iconDisabled = iconDisabled,
    iconFocus = iconFocus,
    iconInactive = iconInactive,
    inverseFocus = inverseFocus,
    inverseSwap = inverseSwap,
    pureWhite = pureWhite,
    pureDark = pureBlack,
    action01 = action01,
    action02 = action02,
    action03 = action03,
    action01Opacity20 = action01Opacity20,
    action02Opacity20 = action02Opacity20,
    action03Opacity20 = action03Opacity20,
    action01Opacity10 = action01Opacity10,
    action02Opacity10 = action02Opacity10,
    action03Opacity10 = action03Opacity10
)

fun baseDarkColors(
    primary: BaseColor = BaseDarkColor.Primary,
    secondary: BaseColor = BaseDarkColor.Secondary,
    tertiary: BaseColor = BaseDarkColor.Tertiary,
    basement: BaseColor = BaseDarkColor.Basement,
    surface: BaseColor = BaseDarkColor.Surface,
    elevation: BaseColor = BaseDarkColor.Elevation,
    elevation1: BaseColor = BaseDarkColor.Elevation1,
    elevation2: BaseColor = BaseDarkColor.Elevation2,
    elevation3: BaseColor = BaseDarkColor.Elevation3,
    elevation4: BaseColor = BaseDarkColor.Elevation4,
    segmentActive: BaseColor = BaseDarkColor.SegmentActive,
    textFocus: BaseColor = BaseDarkColor.TextFocus,
    textTertiary: BaseColor = BaseDarkColor.TextTertiary,
    textSecondary: BaseColor = BaseDarkColor.TextSecondary,
    iconDisabled: BaseColor = BaseDarkColor.IconDisabled,
    iconFocus: BaseColor = BaseDarkColor.IconFocus,
    iconInactive: BaseColor = BaseDarkColor.IconInactive,
    inverseSwap: BaseColor = BaseDarkColor.InverseSwap,
    inverseFocus: BaseColor = BaseDarkColor.InverseFocus,
    pureWhite: BaseColor = BaseDarkColor.PureWhite,
    pureBlack: BaseColor = BaseDarkColor.PureBlack,
    action01: BaseColor = BaseDarkColor.Action01,
    action02: BaseColor = BaseDarkColor.Action02,
    action03: BaseColor = BaseDarkColor.Action03,
    action01Opacity20: BaseColor = BaseDarkColor.Action01Opacity20,
    action02Opacity20: BaseColor = BaseDarkColor.Action02Opacity20,
    action03Opacity20: BaseColor = BaseDarkColor.Action03Opacity20,
    action01Opacity10: BaseColor = BaseDarkColor.Action01Opacity10,
    action02Opacity10: BaseColor = BaseDarkColor.Action02Opacity10,
    action03Opacity10: BaseColor = BaseDarkColor.Action03Opacity10
): BaseColorScheme = BaseColorScheme(
    primary = primary,
    tertiary = tertiary,
    secondary = secondary,
    basement = basement,
    surface = surface,
    elevation = elevation,
    elevation1 = elevation1,
    elevation2 = elevation2,
    elevation3 = elevation3,
    elevation4 = elevation4,
    segmentActive = segmentActive,
    textFocus = textFocus,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    iconDisabled = iconDisabled,
    iconFocus = iconFocus,
    iconInactive = iconInactive,
    inverseFocus = inverseFocus,
    inverseSwap = inverseSwap,
    pureWhite = pureWhite,
    pureDark = pureBlack,
    action01 = action01,
    action02 = action02,
    action03 = action03,
    action01Opacity20 = action01Opacity20,
    action02Opacity20 = action02Opacity20,
    action03Opacity20 = action03Opacity20,
    action01Opacity10 = action01Opacity10,
    action02Opacity10 = action02Opacity10,
    action03Opacity10 = action03Opacity10
)

internal val LocalColorScheme = staticCompositionLocalOf { baseDarkColors() }