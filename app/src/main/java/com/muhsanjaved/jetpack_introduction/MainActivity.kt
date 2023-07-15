package com.muhsanjaved.jetpack_introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhsanjaved.jetpack_introduction.ui.theme.Jetpack_IntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//                 A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }

//            Row {
//                Text(text = "YT NeatRoot", color = Color.Red)
//            }

            /*Text(
                text = "Muhsan Javed",
                color = Color.Magenta,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .background(Color.Green)
//                    .fillMaxSize(.2f)
                    .width(200.dp)
                    .height(200.dp)
            )*/

            /*var arr = arrayOf(
                "Muhsan",
                "Note",
                "Uzair",
                "sahib",
                "new",
                "Qamber",
                "name",
                "Hyder",
                "Muhsan",
                "Note",
                "Uzair",
                "sahib",
                "new",
                "Qamber",
                "name",
                "Hyder"
            )

            Row {
                for (name in arr) {
                    Text(
                        text = name,
                        modifier = Modifier.padding(20.dp, 10.dp, 10.dp, 5.dp),
                        maxLines = 3
                    )
                }
            }*/

//            Text(text = "Muhsan Javed.. \n".repeat(20))

//            showText()
            Column {
//                showText()
//                showText()
//                showText()
            }

            Layout()

        }
    }

    @Composable
    fun Layout() {
        /*Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxSize()
                .fillMaxHeight()
//                .width(200.dp)
//                .height(200.dp)
                .verticalScroll(rememberScrollState()),
//            verticalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            for (i in 1..5){
            Text(
                text = "Muhsan Javed",
                color = Color.Magenta,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
//                modifier = Modifier
//                    .background(Color.Green)
////                    .fillMaxSize(.2f)
//                    .width(200.dp)
//                    .height(200.dp)
                )
            }
        }*/

        /*Row(
            modifier = Modifier
                .background(Color.Green)
//                .fillMaxSize()
//                .fillMaxHeight()
                .width(200.dp)
                .height(200.dp)
                .horizontalScroll(rememberScrollState()),
//            verticalArrangement = Arrangement.Center,
           horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
            for (i in 1..5){
                Text(
                    text = "Muhsan Javed",
                    color = Color.Magenta,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.ExtraBold,
//                modifier = Modifier
//                    .background(Color.Green)
////                    .fillMaxSize(.2f)
//                    .width(200.dp)
//                    .height(200.dp)
                )
            }
        }*/

        LazyColumn(content = {
            item {
                for (i in 1..30){
                    Text(
                        text = "Muhsan Javed",
                        color = Color.Magenta,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
//                modifier = Modifier
//                    .background(Color.Green)
////                    .fillMaxSize(.2f)
//                    .width(200.dp)
//                    .height(200.dp)
                    )
                }
            }
        })
    }

    @Composable
    fun showText() {
        Text(
            text = "Muhsan Javed",
            color = Color.Magenta,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .background(Color.Green)
//                    .fillMaxSize(.2f)
                .width(200.dp)
                .height(200.dp)
        )
    }

}
/*
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_IntroductionTheme {
        Greeting("Android")
    }
}*/
