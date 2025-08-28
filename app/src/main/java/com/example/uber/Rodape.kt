package com.example.uber

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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