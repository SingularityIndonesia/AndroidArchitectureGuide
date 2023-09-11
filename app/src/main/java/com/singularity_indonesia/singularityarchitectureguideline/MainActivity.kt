package com.singularity_indonesia.singularityarchitectureguideline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.singularity_code.codebase.util.debug.pluto.preparePluto
import com.singularity_indonesia.core_ui.theme.SingularityArchitectureGuidelineTheme
import com.singularity_indonesia.navigation_domain.MainNavigation
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf

class MainActivity : ComponentActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        setContent {
            SingularityArchitectureGuidelineTheme {
                // A surface container using the 'background' color from the theme
                val uiScope = rememberCoroutineScope()
                val mainNavigation: MainNavigation = remember{ get { parametersOf(uiScope) } }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    mainNavigation.Content()
                }
            }
        }
        if (BuildConfig.DEBUG)
            preparePluto()
    }
}