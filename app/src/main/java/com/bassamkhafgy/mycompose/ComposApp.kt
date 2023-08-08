package com.bassamkhafgy.mycompose

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.bassamkhafgy.mycompose.screens.HomeScreen
import com.bassamkhafgy.mycompose.ui.theme.MyComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
@Preview
fun ComposeApp() {

    MyComposeTheme(true) {
        Scaffold(topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Centered TopAppBar", color = Color.White
                    )
                },
                colors =
                TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Gray)

            )
        }, floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Text(text = "Add")
            }
        }

        ) {
            HomeScreen()
        }
    }
}