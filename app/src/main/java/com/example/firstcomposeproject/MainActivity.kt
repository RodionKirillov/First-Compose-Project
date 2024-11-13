package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column() {
                UsrInfo(userName = "Rodion", userAge = 25)
                Greeting(name = "Android")
            }
        }
    }
}

@Composable
fun UsrInfo(userName: String, userAge: Int) {
    Text(text = "Привет $userName, Тебе $userAge")
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
    )
}