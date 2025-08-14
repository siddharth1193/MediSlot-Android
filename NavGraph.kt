package io.medisslot.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.medisslot.ui.screens.HomeScreen
import io.medisslot.ui.screens.LanguageScreen
import io.medisslot.ui.screens.SplashScreen
import io.medisslot.ui.screens.auth.PhoneAuthScreen

sealed class Dest(val route: String) {
    object Splash: Dest("splash")
    object Language: Dest("language")
    object Auth: Dest("auth")
    object Home: Dest("home")
}

@Composable
fun AppNavGraph(nav: NavHostController) {
    NavHost(navController = nav, startDestination = Dest.Splash.route) {
        composable(Dest.Splash.route) { SplashScreen(nav) }
        composable(Dest.Language.route) { LanguageScreen(nav) }
        composable(Dest.Auth.route) { PhoneAuthScreen(nav) }
        composable(Dest.Home.route) { HomeScreen(nav) }
    }
}
