package com.example.telasnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.telasnav.ui.theme.TelasNavTheme
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.material3.Text
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelasNavTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "tela1"){
        // "tela1" -> Tela1()
        composable("tela1") { Tela1(navController) }

        composable("tela2/{nome}") {
                backstackEntry ->

            val nome = backstackEntry.arguments?.getString("nome") ?: "sem nome"

            Tela2(nome=nome, onBack = {
                navController.popBackStack()
            })

        }

    }

}



@Composable
fun Tela1(navController: NavController) {

    val nome = "Jonas"

    Button(
        onClick = {
            navController.navigate("tela2/$nome")
        }
    ) {
        Text("Abrir tela 02")
    }

}



@Composable
fun Tela2(nome: String, onBack: () -> Unit) {

    Text("Bem vindo(a) $nome!")

    Button(
        onClick = { onBack() } // Chamando a função onBack
    ) {
        Text("Voltar para tela 01")
    }
}
