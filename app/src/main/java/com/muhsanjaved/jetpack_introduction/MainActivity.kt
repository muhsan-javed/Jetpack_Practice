package com.muhsanjaved.jetpack_introduction

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
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
                    CartExample()
                    StateFulExample()
                    HelloScreen()
                    Buttons()
                    //TextFieldExample()
                }
            }
        }
    }
}

// Text View  Practice
//@Preview(showBackground = true)
@Composable
fun Title() {
    Text(
        text = "Hello Kotlin JetPack", fontSize = 30.sp,
        color = Color.Red
    )

}

// TextView fun with Primate
@Composable
fun TitleFirst(name: String) {
    Text(
        text = "Hello $name",
        fontSize = 30.sp,
        color = Color.Yellow,
    )
}
// multiple lines  Text View
//@Preview(showBackground = true)
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

// All Text Color fontSize FontStyle, FontFamily, textAlign, BackgroundColor, width and more.
//@Preview(showBackground = true)
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

// Array of Name show into Text fun
//@Preview(showBackground = true)
@Composable
fun DisplayNames() {
    val names = listOf<String>("Muhsan", "Ali", "Javed", "Sahib", "Majid", "hyder")
    for (name in names) {
        Text(text = "Hello $name", fontSize = 30.sp)
    }
}

// repeat TextViews
//@Preview(showBackground = true)
@Composable
fun LongText() {
    Text(
        text = "JetPack Compose".repeat(3),
        fontSize = 30.sp,
        maxLines = 2
    )
}

// Selectable TextView copy the text
//@Preview(showBackground = true)
@Composable
fun SelectableText() {
    SelectionContainer {
        Text(text = "Hello This is kotlin JetPack Compose", fontSize = 30.sp)
    }
}

// Not Selectable Text DisableSelection ..  OR  .. SelectionContainer
//@Preview(showBackground = true)
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

// Scroll TextView horizontal
//@Preview(showBackground = true)
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

// Scroll TextView vertical
//@Preview(showBackground = true)
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

// LazyColumn
//@Preview(showBackground = true)
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

// Box
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
//@Preview(showBackground = true)
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
                            Log.d("ButtonOnClicked", "Search button Clicked")
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

// How to use ImageView
//@Preview(showBackground = true)
@Composable
fun ImageAsset() {
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

// Networking Image
@Composable
fun ImageNetwork() {
    Image(
        painter = rememberAsyncImagePainter(
            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQP7ARHenfnGXcxCIhmDxObHocM8FPbjyaBg&usqp=CAU"
        ),

//        painter = rememberImagePainter(
//            data =
//            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQP7ARHenfnGXcxCIhmDxObHocM8FPbjyaBg&usqp=CAU"
//        ),

        contentScale = ContentScale.Crop,
        contentDescription = "profile Image",

        modifier = Modifier
            .size(300.dp)
            .border(3.dp, color = Color.Red, CircleShape)
            .clip(shape = CircleShape)
    )
}

// Icon
@Composable
fun IconsDemo() {
    Icon(
        Icons.Filled.Menu,
        contentDescription = "Menu",
        modifier = Modifier.size(50.dp),
        tint = Color.Red
    )
}

// Card Practice
@Preview(showBackground = true)
@Composable
fun CartExample() {
    Card(
        shape = RoundedCornerShape(30.dp),
        border = BorderStroke(1.dp, Color.Yellow),
//        backgroundColor = Color.Gray,
//        contentColor = Color.White,
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun StateFulExample() {
    var name: String by remember { mutableStateOf("Name") }

    Column {
        OutlinedTextField(value = name, onValueChange = { name = it })
        Text(text = name, fontSize = 30.sp, fontFamily = myFontFamily)
    }
}

// State Hosting
@Preview(showBackground = true)
@Composable
fun HelloScreen() {
    var name: String by remember { mutableStateOf("") }
    HelloContent(name = name, onNameChange = { name = it })
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HelloContent(name: String, onNameChange: (String) -> Unit) {
//    var name : String by remember { mutableStateOf("Name") }

    Column {
//        OutlinedTextField(value = name, onValueChange = {name = it})
        OutlinedTextField(value = name, onValueChange = onNameChange)
        Text(text = name, fontSize = 30.sp, fontFamily = myFontFamily)
    }
}


// BUTTON >>>>>>>>>>>>>>>>>>>>>>>>>>>
@Preview(showBackground = true)
@Composable
fun Buttons() {

    Column {
        Button(
            onClick = { Log.d("Button", "Button CLicked") },
//            modifier = Modifier.padding(30.dp),
            contentPadding = PaddingValues(start = 40.dp, top = 20.dp, end = 40.dp, bottom = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = "Button", fontSize = 24.sp, color = Color.Black)
        }

        // TextButton
        TextButton(
            onClick = { Log.d("Button", "Button CLicked") },
//            modifier = Modifier.padding(30.dp),
//            colors = ButtonDefaults.buttonColors(Color.Red),
        ) {
            Text(text = "Text Button", fontSize = 24.sp)
        }

        // OutLined Button
        OutlinedButton(
            onClick = { Log.d("Button", "Button CLicked") },
//            modifier = Modifier.padding(30.dp),
            contentPadding = PaddingValues(start = 40.dp, top = 20.dp, end = 40.dp, bottom = 20.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Yellow),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Green)
        ) {
            Text(text = "Outlined Button", fontSize = 24.sp, color = Color.Black)
        }

        //Icons Button
        IconButton(
            onClick = { Log.d("Button", "Button CLicked") },
            modifier = Modifier
//                .padding(30.dp)
                .then(Modifier.size(50.dp))
                .border(1.dp, Color.Red, shape = CircleShape),
        ) {
            Icon(Icons.Default.Favorite, contentDescription = "Icon Button", tint = Color.Green)
        }

        //Floating Action Button
        FloatingActionButton(
            onClick = { Log.d("Button", "Button CLicked") },
            modifier = Modifier
//                .fillMaxWidth()
                .padding(15.dp),
//            contentColor = Color.Yellow,
        ) {
//            Text(text = "Favorite", fontSize = 15.sp,)
            Icon(Icons.Default.Favorite, contentDescription = "Floating Action Button")
        }
        //TextFieldExample()
    }
}

// EditText Field.................
@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldExample() {
    var name: String by remember { mutableStateOf("") }
    var email: String by remember { mutableStateOf("") }
    var password: String by remember { mutableStateOf("") }
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp),
    ) {
        // Name
        item {
            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Name") },
                placeholder = { Text(text = "Write your name") },
                textStyle = TextStyle(color = Color.Blue),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "Person")
                },
                shape = RoundedCornerShape(10.dp),

                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Green,
                    unfocusedIndicatorColor = Color.Transparent
                ),
//                readOnly = true,
//                singleLine = true,
            )
        }

        // Email
        item {
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Email") },
                placeholder = { Text(text = "Enter Your Email") },
                textStyle = TextStyle(color = Color.Yellow),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email, contentDescription = ""
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Green,
                    unfocusedIndicatorColor = Color.Transparent
                ),

//                        readOnly = true,
//                singleLine = true,
            )
        }

        // Password
        item {
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                placeholder = { Text(text = "Enter Your Password") },
                textStyle = TextStyle(color = Color.Yellow),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock, contentDescription = ""
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Green,
                    unfocusedIndicatorColor = Color.Transparent
                ),

                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

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

/*  ComposeWebinarTheme {
                // A surface container using the 'background' color from the theme
                *//* Surface(
                     modifier = Modifier.fillMaxSize(),
                     color = MaterialTheme.colorScheme.background
                 )
                 {
                 }*//*
              *//*  Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                }*//*

            }*
/*

@Preview(showBackground = true)
@Composable
fun TitleComposable() {

    Text(
        text = "Muhsan Javed",
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray),
        style = TextStyle(
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Blue,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun CircularProfileImage() {

    Image(
        painter = painterResource(id = R.drawable.removebg),
        contentDescription = "user Profile",
        modifier = Modifier
            .size(150.dp)
            .border(BorderStroke(2.dp, Color.Red), CircleShape)
            .padding(4.dp)
            .clip(CircleShape)


    )
}

@Preview(showBackground = true)
@Composable
fun RectAngleDemo() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(30.dp)
    ) {
        CircularProfileImage()
    }
}

@Preview(showBackground = true)
@Composable
fun UserProfileCard() {

    Card(border = BorderStroke(1.dp, Color.Black)) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProfileImage()
            //Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Muhsan Javed",
                modifier = Modifier,
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black,
                )
            )

            Text(
                text = "Senior Android Developer",
                modifier = Modifier,
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Gray,
                )
            )

            // btn
            Button(onClick = {

            }) {
                Text(
                    text = "View Profile", style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp
                    )
                )

            }
        }
    }


// Box -> Overlap
// Row -> horizontally alignment
//Column -> Vertically alignment
}
*/