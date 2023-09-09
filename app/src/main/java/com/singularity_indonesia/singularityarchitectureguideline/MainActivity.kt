package com.singularity_indonesia.singularityarchitectureguideline

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.singularity_indonesia.core.core_common.util.preparePluto
import com.singularity_indonesia.dashboard_ui.DashboardUIModule
import com.singularity_indonesia.navigation.MainNavigation
import com.singularity_indonesia.singularityarchitectureguideline.ui.theme.SingularityArchitectureGuidelineTheme
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.module.Module

class MainActivity : ComponentActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        setContent {
            SingularityArchitectureGuidelineTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainNavigation(rememberCoroutineScope()).Content()
                }
            }
        }
        if (BuildConfig.DEBUG)
            preparePluto()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SingularityArchitectureGuidelineTheme {
        Greeting("Android")
    }
}