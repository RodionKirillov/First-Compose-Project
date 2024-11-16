package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontSynthesis
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeproject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstComposeProjectTheme {
                Scaffold {
                    Box(
                        modifier = Modifier.padding(it)
                    ) {
                        InstagramProfileCard()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun TestText() {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .padding(16.dp),
    ) {
        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Hello")
                }

                append(" ")
                withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("World")
                }

                withStyle(
                    SpanStyle(
                        fontSize = 24.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                ) {
                    append("!")
                }
            }
        )
    }
}

//@Preview
//@Composable
//fun TestText() {
//    Box(
//        modifier = Modifier
//            .background(color = Color.White)
//            .padding(16.dp),
//    ) {
//        Text(
//            text = "Hello world!",
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
//            fontStyle = FontStyle.Italic,
//            fontFamily = FontFamily.Serif,
//            textDecoration = TextDecoration.combine(
//                listOf(
//                    TextDecoration.Underline,
//                    TextDecoration.LineThrough
//                )
//            )
//        )
//    }
//}