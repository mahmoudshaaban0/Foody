package com.mahmoudshaaban.foody

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mahmoudshaaban.foody.ui.theme.FoodyTheme
import com.mahmoudshaaban.foody.ui.theme.HomeScreen
import com.mahmoudshaaban.foody.ui.theme.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodyTheme {
                val navController = rememberNavController()

                NavHost(navController = navController,startDestination = "Login" ){
                    composable("Login"){
                        LoginScreen(navController = navController)
                    }
                    composable("Home"){
                        HomeScreen()
                    }
                }
            }
        }
    }
}

