package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeproject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            Test(viewModel = viewModel)
        }
    }
}

@Composable
private fun Test(viewModel: MainViewModel) {
    FirstComposeProjectTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .statusBarsPadding()
                .navigationBarsPadding()
        ) {
            LazyColumn {
                item {
                    InstagramProfileCard(viewModel)
                }
                items(100) {
                    InstagramProfileCard(viewModel)
                }
            }
        }
    }
}


