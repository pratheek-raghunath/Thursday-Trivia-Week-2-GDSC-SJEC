package com.example.week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2.ui.theme.Week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ThursdayTriviaWeek1("Android")
                }
            }
        }
    }
}

@Composable
fun ThursdayTriviaWeek1(name: String) {
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
    ) {
        Row (modifier = Modifier
            .fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.victory),
                contentDescription = "victoryImage"
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)) {
            Column (modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)){
                Text(text = "Score", fontSize = 30.sp, modifier = Modifier
                    .padding(top = 20.dp))
                Text(text = "0/4", fontSize = 50.sp, fontWeight = FontWeight.Bold)
            }
        }
        Row {
            Spacer(modifier = Modifier.padding(40.dp))
        }
        Row(modifier = Modifier
//            .fillMaxHeight()
            .fillMaxWidth(),
//            .wrapContentWidth(Alignment.CenterHorizontally),
        horizontalArrangement = Arrangement.Center
        ) {
            Column (
                modifier = Modifier
//                .fillMaxHeight()
//                .fillMaxWidth()
                    .padding(end = 80.dp),
                horizontalAlignment = Alignment.CenterHorizontally
                ){
                Text(text = "You Choose", fontSize = 16.sp )
                Text(text = "Rock",fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Android Choose", fontSize = 16.sp)
                Text(text = "Paper",fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }
        }
        Row() {
            Spacer(modifier = Modifier.padding(top = 120.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
            ) {
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
//                    backgroundColor = Color.Magenta,
                    contentColor = Color.White), modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .height(100.dp)
                .width(100.dp)
                .clip(RoundedCornerShape(20.dp),
                    )
            ) {
                Text(text = "Rock", fontWeight = FontWeight.Bold)
            }
            Button(onClick = { /*TODO*/ },
                colors =
                ButtonDefaults.buttonColors(
//                    backgroundColor = Color.Magenta,
                    contentColor = Color.White),
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .height(100.dp)
                    .width(100.dp)
                    .clip(
                    RoundedCornerShape(20.dp)
                    )
                )
             {
                Text(text = "Paper", fontWeight = FontWeight.Bold)
            }
            Button(onClick = { /*TODO*/ },colors =
            ButtonDefaults.buttonColors(
//                    backgroundColor = Color.Magenta,
                contentColor = Color.White), modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .height(100.dp)
                .width(100.dp)
                .clip(RoundedCornerShape(20.dp),
                    )
            ) {
                Text(text = "Scissors", fontWeight = FontWeight.Bold)
            }
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
        horizontalArrangement = Arrangement.Center){
            Text(
                text = "#JetpackCompose",
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
//                modifier = Modifier
//                    .padding(10.dp),
//                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Week2Theme {
        ThursdayTriviaWeek1("Android")
    }
}