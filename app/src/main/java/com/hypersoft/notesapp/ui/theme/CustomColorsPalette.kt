package com.hypersoft.notesapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColorsPalette(
    val topAppBarColor: Color = Color.Unspecified
)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LightCustomColorPalette = CustomColorsPalette(
    topAppBarColor = DarkGray
)

val DarkCustomColorPalette = CustomColorsPalette(
    topAppBarColor = LightGray
)

val LocaleCustomColorsPalette = staticCompositionLocalOf { CustomColorsPalette() }

val MaterialTheme.customColorPalette: CustomColorsPalette
    @Composable
    @ReadOnlyComposable
    get() = LocaleCustomColorsPalette.current