package com.singularity_indonesia.account_ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.singularity_indonesia.navigation_domain.MainNavigationEvent
import com.singularity_indonesia.navigation_domain.screen.LoginScreen

/**
 * Created by: stefanus
 * 10/09/23 03.27
 * Design by: stefanus.ayudha@gmail.com
 */

val LoginScreenImpl = LoginScreen { pld ->
    Surface {
        Column(Modifier.padding(16.dp)) {
            Text(
                text = "Login Screen",
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "Payload:",
                style = MaterialTheme.typography.titleMedium
            )
            Text("$pld")
            Spacer(Modifier.weight(1f))
            Button(
                modifier = Modifier
                    .align(Alignment.End),
                onClick = {
                    pld?.mainNavigation?.event?.set(
                        MainNavigationEvent.GoToDashboard
                    )
                }
            ) {
                Text("To Dashboard")
            }
        }
    }
}