package com.example.firebasestorage.ui.theme.screens.about

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.login.LoginScreen


@Composable
fun aboutScreen(navController: NavHostController){

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun aboutScreenPreview() {
    aboutScreen(rememberNavController())
}