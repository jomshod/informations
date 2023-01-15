package com.example.informations

import android.os.Bundle
import android.text.method.TextKeyListener.Capitalize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.informations.ui.theme.InformationsTheme
import com.example.informations.uilayer.Datasource
import com.example.informations.uilayer.Information

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InformationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   listInfoCard(infoList = Datasource().loadInfoList())
                }
            }
        }
    }
}
@Composable
fun listInfoCard(infoList: List<Information>){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        LazyColumn{
              items(infoList){information ->
    informationCard(information)
    
}
        }
    }

}

@Composable
fun informationCard(information: Information){
    Card (modifier = Modifier
        .padding(8.dp)
        .wrapContentHeight()
        .fillMaxWidth(), elevation = 4.dp, backgroundColor = Color.LightGray
    ){
        Column {
            Text(text = stringResource(information.nameIdRes).uppercase(),
            fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Bottom, modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = information.addressIdRes).capitalize(),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,)
                Spacer(modifier = Modifier.width(180.dp))
                Text(
                    text = stringResource(id = information.phoneIdRes),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,

                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    InformationsTheme {
        listInfoCard(infoList = Datasource().loadInfoList())
    }
}
