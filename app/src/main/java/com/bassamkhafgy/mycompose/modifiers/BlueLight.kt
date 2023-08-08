package com.bassamkhafgy.mycompose.modifiers

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Stable
fun Modifier.blueLight() = then(shadow(10.dp, spotColor = Color.Blue))
