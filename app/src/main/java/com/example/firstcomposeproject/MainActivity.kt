package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Cyan)
                    .statusBarsPadding()
                    .navigationBarsPadding()
            ) {
                UsrInfo(userName = "Rodion", userAge = 25)
                UserInfoPreview()
            }
        }
    }
}

@Composable
fun UsrInfo(userName: String, userAge: Int) {
    Text(text = "Привет $userName, Тебе $userAge")
}

@Preview
@Composable
fun UserInfoPreview() {
    Column {
        repeat(10) {
            UsrInfo(userName = "Rodion", userAge = 25)
        }
    }
}