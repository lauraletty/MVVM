package com.example.firebasestorage.ui.theme.screens.dashboard

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun dashboardscreen(navController: NavHostController){

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun dashboardscreenPreview() {
    dashboardscreen(rememberNavController())
}