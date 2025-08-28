package com.example.uber

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TelaPerfil(){

    val listaDeTitulos = listOf(
        "FamilyAndTeens",
        "Settings",
        "SimpleMode",
        "SendAGift",
        "EarnDD",
        "SavedGroups",
        "SetUp",
        "PartnerR",
        "ReferFriends",
        "Manage",
        "Legal"
    )

    Scaffold(
        modifier = Modifier
            .padding(10.dp),
        topBar = { Cabecalho() },
        bottomBar = { RodaPe() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            MenuPerfil()
            MenuSecundario(titulos = listaDeTitulos)
        }
    }
}


//@Preview(showBackground = true)
@Composable
fun Cabecalho(){
    Card (
        modifier = Modifier
            .padding(15.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent),
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



//@Preview(showBackground = true)
@Composable
fun MenuPerfil() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(570.dp)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    )
    {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween,

            verticalAlignment = Alignment.CenterVertically
        )
        {
            Card(
                modifier = Modifier.size(100.dp),

                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "",
                    )
                    Text("Ajuda")
                }

            }

            Spacer(modifier = Modifier.padding(10.dp))

            Card(
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

            Spacer(
                modifier = Modifier
                    .padding(10.dp)
            )

            Card(
                modifier = Modifier
                    .size(100.dp)
            ) {
                Column(
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

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxSize(),

                ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                    //horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        Column(
                            modifier = Modifier
                                .width(250.dp)
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Ride Pass")
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text("Save on routine rides")

                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxSize(),

                ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                    //horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        Column(
                            modifier = Modifier
                                .width(250.dp)
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Try Uber One free")
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text("Unlock 10% Uber One credits on rides and more")

                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxSize(),

                ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                    //horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        Column(
                            modifier = Modifier
                                .width(250.dp)
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Safety Checkup")
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text("Learn ways to make rides safer")

                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxSize(),

                ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                    //horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        Column(
                            modifier = Modifier
                                .width(250.dp)
                                .fillMaxSize()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Estimated CO2 saved")
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
        }
    }
}

//@Preview
@Composable
fun MenuSecundario(titulos: List<String> = listOf(
    "FamilyAndTeens",
    "Settings",
    "SimpleMode",
    "SendAGift",
    "EarnDD",
    "SavedGroups",
    "SetUp",
    "PartnerR",
    "ReferFriends",
    "Manage",
    "Legal"
)){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .height(770.dp),
    ){
        titulos.forEach { titulo ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(vertical = 5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .size(50.dp)
                            .padding(10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally


                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "",
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center

                    ) {
                        Text(text = titulo)
                    }
                }
            }
        }
    }
}