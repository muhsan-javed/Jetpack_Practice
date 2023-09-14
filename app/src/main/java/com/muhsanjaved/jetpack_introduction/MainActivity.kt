package com.muhsanjaved.jetpack_introduction

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.muhsanjaved.jetpack_introduction.ui.theme.Jetpack_IntroductionTheme
import com.muhsanjaved.jetpack_introduction.ui.theme.myFontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //  A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Column(
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                        .verticalScroll(rememberScrollState())
                        .padding(start = 10.dp, end = 10.dp),
                ) {
                    //showText()
                    //Layout()
                    //MaterialUiApp()
                    Title()
                    TitleFirst(name = "Muhsan Javed")
                    Hello()
                    DisplayNames()
                    SimpleText()
                    LongText()
                    SelectableText()
                    PartiallySelectableText()
                    RowDemo()
                    ColumnDemo()
                    LazyColumDemo()
                    BoxDemo()
                    ImageAsset()
                    ImageNetwork()
                    IconsDemo()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Title() {
    Text(
        text = "Hello Kotlin JetPack", fontSize = 30.sp,
        color = Color.Red
    )

}

@Composable
fun TitleFirst(name: String) {
    Text(
        text = "Hello $name",
        fontSize = 30.sp,
        color = Color.Yellow,
    )
}

@Preview(showBackground = true)
@Composable
fun Hello() {
    Column {
        Text(
            text = "Muhsan",
            fontSize = 30.sp,
            color = Color.DarkGray,
        )
        Text(
            text = "Uzair",
            fontSize = 30.sp,
            color = Color.Red,
        )
        Text(
            text = "Sahib",
            fontSize = 30.sp,
            color = Color.Green,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleText() {
    Text(
        text = "Hello Kotlin",
        fontSize = 30.sp,
        color = Color.Magenta,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
//        fontFamily = FontFamily(Font(R.font.yeon_sung_regular))
        fontFamily = myFontFamily,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Cyan)
            .width(400.dp)
    )

}

@Preview(showBackground = true)
@Composable
fun DisplayNames() {
    val names = listOf<String>("Muhsan", "Ali", "Javed", "Sahib", "Majid", "hyder")
    for (name in names) {
        Text(text = "Hello $name", fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun LongText() {
    Text(
        text = "JetPack Compose".repeat(3),
        fontSize = 30.sp,
        maxLines = 2
    )
}

@Preview(showBackground = true)
@Composable
fun SelectableText() {
    SelectionContainer {
        Text(text = "Hello This is kotlin JetPack Compose", fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PartiallySelectableText() {
    Column {
        SelectionContainer {
            Column {
                Text(text = "Hello This is Selection Text", fontSize = 30.sp)
                DisableSelection {
                    Text(text = "This is Not Selection Text", fontSize = 30.sp)
                }
            }
        }
        //Text(text = "This is Not Selection Text", fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun RowDemo() {
    Row(
        modifier = Modifier
            .width(330.dp)
            .height(150.dp)
            .padding(top = 10.dp)
            .background(color = Color.Gray)
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = "First", fontSize = 30.sp)
        for (i in 0..9) {
            Text(text = "Item $i ", fontSize = 30.sp)
        }
        Text(text = "Last", fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnDemo() {
    Column(
        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
            .width(330.dp)
            .height(200.dp)
            .padding(top = 10.dp)
            .background(color = Color.LightGray)
            .verticalScroll(rememberScrollState()),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "First", fontSize = 30.sp)
        for (i in 0..50) {
            Text(text = "Item $i ", fontSize = 30.sp)
        }
        Text(text = "Last", fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun LazyColumDemo() {
    LazyColumn(
        modifier = Modifier
//            .fillMaxWidth()
            .width(330.dp)
            .height(200.dp)
            .padding(top = 10.dp)
            .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
//        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 100.dp),
//        verticalArrangement = Arrangement.spacedBy(50.dp)

    ) {
        // Add a Single Item
        item { Text(text = " LazyColumn Item ", fontSize = 30.sp) }

        items(50) { i -> Text(text = " Item $i", fontSize = 30.sp) }

        // Add a Single Item
        item { Text(text = " LazyColumn Last Item ", fontSize = 30.sp) }

    }
}

//@Preview(showBackground = true)
@Composable
fun BoxDemo() {
    Box(
        modifier = Modifier
            .width(330.dp)
            .height(200.dp)
            .padding(top = 10.dp)
            .background(color = Color.Yellow)
    ) {
        Text(text = " This is Outer Box........ ", fontSize = 30.sp)
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color.Green)
        ) {
            Text(
                text = " This is inner Box........ ", fontSize = 30.sp
            )
        }
        Text(
            text = " This is Box ",
            fontSize = 18.sp,
            color = Color.Red,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MaterialUiApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Material App")
                },
                actions = {
                    IconButton(
                        onClick = {
                            Log.d("ButtonOnClicked","Search button Clicked")
                        }) {
                        Icon(Icons.Filled.Send, contentDescription = null)
                    }
                }
            )
        }
    ) {
//        BoxExample()
//        LazyColumDemo()
//        ImageAsset()
    }
}

@Preview(showBackground = true)
@Composable
fun ImageAsset(){
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentScale = ContentScale.Crop,
        contentDescription = "profile Image",

        modifier = Modifier
            .size(300.dp)
            .border(3.dp, color = Color.Red, CircleShape)
            .clip(shape = CircleShape)
    )
}

@Composable
fun ImageNetwork(){
    Image(
        painter = rememberImagePainter(data =
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQP7ARHenfnGXcxCIhmDxObHocM8FPbjyaBg&usqp=CAU"),
        contentScale = ContentScale.Crop,
        contentDescription = "profile Image",

        modifier = Modifier
            .size(300.dp)
            .border(3.dp, color = Color.Red, CircleShape)
            .clip(shape = CircleShape)
    )
}

@Composable
fun IconsDemo(){
    Icon(
        Icons.Filled.Menu,
        contentDescription = "Menu",
        modifier = Modifier.size(50.dp),
        tint = Color.Red
    )
}

@Preview(showBackground = true)
@Composable
fun CartExample() {

    Card(
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, Color.Yellow),
//        elevation = CardElevation = CardDefaults.cardElevation(10.dp),
    ) {
        Column(
            modifier = Modifier.padding(40.dp)
        ) {
            Text(
                text = "This is Card",
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(80.dp))
            Text(
                text = "Muhsan",
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Composable
fun Layout() {
    Column(
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
        for (i in 1..5) {
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
    }

    Row(
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
        for (i in 1..5) {
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
    }

    LazyColumn(
        content = {
            item {
                for (i in 1..30) {
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
        }
    )
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

@Composable
fun Text() {
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

@Composable
fun TextShow() {
    val arr = arrayOf(
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

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.horizontalScroll(rememberScrollState())
    ) {
        for (name in arr) {
            Text(
                text = name,

                modifier = Modifier
                    .padding(20.dp, 10.dp, 10.dp, 5.dp),
                maxLines = 3
            )
        }
    }
}