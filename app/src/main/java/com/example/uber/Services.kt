package com.example.uber

import android.widget.Space
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import com.example.uber.RodaPe
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StampedPathEffectStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TelaServices(){
    Scaffold (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        bottomBar = { RodaPe() }
    ) {
        innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            // CHAMAR AQUI AS OUTRAS FUNÇÕES
            TituloServices()
            TelaCard()
            MenuServices()
            MenuBaixo()
        }
    }
}

@Preview
@Composable
fun TituloServices(){
    Card (
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent),
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Services", style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold)
            Row {
                Card(
                    shape = RoundedCornerShape(3.dp),
                    colors = CardDefaults.cardColors(Color.DarkGray)
                ) {}
            }
        }
    }
}

@Preview
@Composable
fun TelaCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        Row {
            Text(
                "Go anywhere, get anything",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        Spacer(modifier = Modifier
            .padding(vertical = 10.dp))
        Row {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            ) {
            }
        }
    }
}

@Preview
@Composable
fun MenuServices(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {

        Row (modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column (modifier = Modifier
                .size(180.dp)
            ) {
                Card (modifier = Modifier
                    .fillMaxSize()
                ){  }
            }

            Spacer(modifier = Modifier
                .padding(horizontal = 6.dp))

            Column (modifier = Modifier
                .size(180.dp)
            )  {
                Card (modifier = Modifier
                    .fillMaxSize()
                ) {  }
            }
        }

        Spacer(modifier = Modifier
            .padding(vertical = 6.dp))

        Row (modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column (modifier = Modifier
                .size(85.dp)
            ) {
                Card (modifier = Modifier
                    .fillMaxSize()
                )  {  }
            }


            Column (modifier = Modifier
                .size(85.dp)
            )  {
                Card (modifier = Modifier
                    .fillMaxSize()
                )  {  }
            }


            Column (modifier = Modifier
                .size(85.dp)
            ) {
                Card (modifier = Modifier
                    .fillMaxSize()
                )  {  }
            }



            Column(modifier = Modifier
                .size(85.dp)
            )  {
                Card(modifier = Modifier
                    .fillMaxSize()
                )   {  }
            }
        }
    }
}

@Preview
@Composable
fun MenuBaixo(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp)
    ) {
        Row (modifier = Modifier
            .fillMaxWidth()
        ) {
            Text(
                "Get Courier to help",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        Spacer(modifier = Modifier
            .padding(vertical = 10.dp))
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column (modifier = Modifier
                .size(180.dp)
            ) {
                Card (modifier = Modifier
                    .fillMaxSize()
                ){  }
            }

            Spacer(modifier = Modifier
                .padding(horizontal = 6.dp))

            Column (modifier = Modifier
                .size(180.dp)
            )  {
                Card (modifier = Modifier
                    .fillMaxSize()
                ) {  }
            }
        }
    }
}

