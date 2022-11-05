package com.example.thipchcmng

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.thipchcmng.ui.theme.ThiệpChúcMừngTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThiệpChúcMừngTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    BirthdayGreeting(stringResource(R.string.happy_birthday_text), stringResource(R.string.signnature))
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(name: String, from: String) {
    Column {
        Text("Happy  Birthday $name",
            fontSize = 36.sp ,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text("__$from",
            fontSize = 24.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(start = 16.dp, end = 16.dp))
    }
}

@Composable
fun StudyLayout() {
    Row {
            Text("Row 1")
            Text("Row 2")
        Column {
            Text("Column 1")
            Text("Column 2")
            Text("Column 3")

        }
    }

}
@Composable
fun BirthdayGreeting(name: String, from: String) {
    val image = painterResource(R.drawable.birthcake)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(name = name, from = from)

    }
}


@Composable
fun Greeting(name: String) {
    Surface(color = Color.Green) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}

@Composable
fun CompleteTask() {
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.ic_task_completed)
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.taskcomplete_title),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(id = (R.string.taskcomplete_des)),
            fontSize = 16.sp
        )
    }

}

@Preview(showBackground = true, name = "My Preview")
@Composable
fun DefaultPreview() {
    ThiệpChúcMừngTheme {
//        BirthdayGreeting(stringResource(R.string.happy_birthday_text), stringResource(R.string.signnature))
        CompleteTask()
    }
}