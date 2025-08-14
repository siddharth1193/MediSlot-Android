package io.medisslot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import io.medisslot.ui.navigation.AppNavGraph
import io.medisslot.ui.theme.MediSlotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediSlotTheme {
                val nav = rememberNavController()
                AppNavGraph(nav)
            }
        }
    }
}
