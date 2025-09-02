package com.example.crystofer0209

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.crystofer0209.ui.theme.Crystofer0209Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Crystofer0209Theme {
            }


        }
    }
}

@Preview
@Composable
fun TelaDeTarefas(){

    val tarefas by remember {
        mutableStateOf(listOf("1","2","3"))
    }

    Scaffold {
            innerPadding ->

        Column (
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 5.dp)
        ) {

            Cabecalho()
            Spacer(
                modifier = Modifier
                    .height(5.dp)
            )
            Formulario()
            Spacer(
                modifier = Modifier
                    .height(5.dp)
            )
            LazyColumn {
                items(tarefas){
                    tar ->
                    Tarefa(tar)
                    Spacer(
                        modifier = Modifier
                            .height(5.dp)
                    )
                }
            }
        }
    }
}
//@Preview
@Composable
fun Cabecalho() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Outlined.Person,
                contentDescription = "Icone Perfil",
                modifier = Modifier
                    .size(60.dp)
            )

            Column {

                Text(
                    text = "José Silveira",
                    style = MaterialTheme.typography.headlineLarge
                )

                Text(
                    text = "Melhor programador",
                    style = MaterialTheme.typography.bodySmall
                )

            }

        }

    }

}



//@Preview
@Composable
fun Formulario() {

    Row {

        TextField(
            value = "Olha la que legal",
            onValueChange = { }
        )

        Spacer(
            modifier = Modifier
                .width(5.dp)
        )

        Button(
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Icone Add"
            )

            Text("Add")

        }
    }
}



//@Preview
@Composable
fun Tarefa(texto: String = "Nova Tarefa") {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "Icone Fav"
            )

            Spacer(
                modifier = Modifier
                    .width(5.dp)
            )

            Text(
                text = texto,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
