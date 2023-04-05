package com.nyamweyajohnson.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nyamweyajohnson.cryptocurrencyapp.presentation.coin_detail.components.CoinDetailScreen
import com.nyamweyajohnson.cryptocurrencyapp.presentation.coin_list.components.CoinListScreen
import dagger.hilt.android.AndroidEntryPoint

//https://api.coinpaprika.com/v1/key/info
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
            startDestination = Screen.CoinListScreen.route
            ){
               composable(
                   route = Screen.CoinListScreen.route
               ){
                   CoinListScreen(navController)
               }

                composable(
                    route = Screen.CoinDetailScreen.route + "/{coinId}"
                ){
                    CoinDetailScreen()
                }
            }
        }
    }
}