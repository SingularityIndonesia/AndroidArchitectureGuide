package com.singularity_indonesia.dashboard_ui.dashboard

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.singularity_indonesia.navigation_domain.MainNavigationEvent
import com.singularity_indonesia.navigation_domain.screen.DashboardScreen

/**
 * Created by: stefanus
 * 09/09/23 21.00
 * Design by: stefanus.ayudha@gmail.com
 */

val DashboardScreenImpl = DashboardScreen @Composable { pld ->
    val activity = LocalContext.current as? Activity
    Surface {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                "Dashboard Screen",
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                "Payload:",
                style = MaterialTheme.typography.titleMedium
            )
            Text("$pld")
            BackHandler {
                pld?.mainNavigation?.event
                    ?.set(MainNavigationEvent.GoBack)
            }
        }
    }

    BackHandler {
        activity?.moveTaskToBack(true)
    }
}