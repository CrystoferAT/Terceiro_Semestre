package com.example.uber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uber.ui.theme.UberTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UberTheme {



            }
        }
    }
}
@Preview
@Composable
fun TelaPerfil(){

}


@Preview(showBackground = true)
@Composable
fun Cabecalho(){
    Card (
        modifier = Modifier
            .padding(15.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column (
                modifier = Modifier
                    .weight(1f)
                    .height(80.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text("José Farah", style = MaterialTheme.typography.titleLarge)
                Row {
                    Card(
                        shape = RoundedCornerShape(3.dp),
                        colors = CardDefaults.cardColors(Color.DarkGray)
                    ) {
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(horizontal = 2.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                modifier = Modifier
                                    .size(10.dp),
                                tint = Color.Yellow
                            )
                            Text(
                                text = "4.88",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .padding(horizontal = 2.dp)
                            )
                        }
                    }

                    Spacer(
                        modifier = Modifier
                            .width(15.dp)
                    )
                    Card(
                        shape = RoundedCornerShape(3.dp),
                        colors = CardDefaults.cardColors(Color.DarkGray)
                    ) {
                        Text("Not verified",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(horizontal = 2.dp)
                        )
                    }
                }
            }
            Spacer(
                modifier = Modifier
                    .width(13.dp)
            )
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun RodaPe(){

    Row (
        modifier = Modifier
            .height(75.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
    ){

        Column (

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
            )
            Text("Home")
        }

        Column (

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
            )
            Text("Services")

        }

        Column (

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){

            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
            )
            Text("Activity")

        }

        Column (

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){

            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
            )
            Text("Account")

        }

    }
}


@Preview(showBackground = true)
@Composable
fun MenuPerfil(){

    Column(modifier = Modifier
        .fillMaxWidth()
        .height(600.dp)
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
        )
        {
            Card(
                modifier = Modifier.size(100.dp),

                ){
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "",
                    )
                    Text("Ajuda")
                }

            }

            Spacer(modifier = Modifier.padding(10.dp))

            Card (
                modifier = Modifier.size(100.dp)
                 )
            {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "",
                        )
                    Text("Carteira")
                    }
            }

            Spacer(modifier = Modifier.padding(10.dp))

            Card (
                modifier = Modifier.size(100.dp)){
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )
                {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",

                        )
                    Text("Mensagem")
                }
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        ){
            Card (
                modifier = Modifier.fillMaxSize()
            ){  }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        ){
            Card (
                modifier = Modifier.fillMaxSize()
            ){  }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        ){
            Card (
                modifier = Modifier.fillMaxSize()
            ){  }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        ){
            Card (
                modifier = Modifier.fillMaxSize()
            ){  }
        }
    }
}
