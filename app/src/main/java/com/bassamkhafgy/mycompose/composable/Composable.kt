package com.bassamkhafgy.mycompose.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.bassamkhafgy.mycompose.modifiers.blueLight

@Composable
fun Greeting(name: String) {

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier
                .blueLight()
                .fillMaxWidth(),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            text = "Hello $name!",
            color = Color.Magenta

            )
    }
}


@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting("bassam")
}