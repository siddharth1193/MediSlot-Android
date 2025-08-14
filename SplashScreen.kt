package io.medisslot.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth
import io.medisslot.ui.navigation.Dest
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(nav: NavHostController) {
    LaunchedEffect(Unit) {
        delay(900)
        val isLoggedIn = FirebaseAuth.getInstance().currentUser != null
        nav.navigate(if (isLoggedIn) Dest.Home.route else Dest.Language.route) {
            popUpTo(Dest.Splash.route) { inclusive = true }
        }
    }
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}
