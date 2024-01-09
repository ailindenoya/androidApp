package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    GreetingImage("Android World")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Transparent) {
        Row {
            Text(
                text = "Hello $name!",
                fontSize = 70.sp,
                lineHeight = 70.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp)
            )
           /* Text(
                text = "Hello a second time $name",
                fontSize = 36.sp,

                )*/
        }
   /*     Column {
            Text(
                text = "another hello $name",
                fontSize = 12.sp
            )
            Text(
                text = "even another hello $name!",
                fontSize = 10.sp
            )
      } */
    }
    }

@Composable
fun GreetingImage(message: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.pexels_pixabay_414144)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F


        )
        Greeting("Android World")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "preview"
)
@Composable
fun GreetingPreview() {
    FirstAppTheme {
        GreetingImage(message = "AndroidWorld")
    }
}