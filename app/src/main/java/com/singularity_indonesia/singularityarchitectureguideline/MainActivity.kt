package com.singularity_indonesia.singularityarchitectureguideline

import android.os.Bundle
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
import com.singularity_indonesia.navigation.MainNavigation
import com.singularity_indonesia.core.core_ui.theme.SingularityArchitectureGuidelineTheme

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