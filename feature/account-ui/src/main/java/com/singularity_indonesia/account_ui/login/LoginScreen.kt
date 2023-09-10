package com.singularity_indonesia.account_ui.login

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.singularity_indonesia.navigation_domain.screen.LoginScreen

/**
 * Created by: stefanus
 * 10/09/23 03.27
 * Design by: stefanus.ayudha@gmail.com
 */

val LoginScreenImpl = LoginScreen { pld ->
    Text("Login Screen $pld")
    Button(
        onClick = {

        }
    ) {
        Text("To Dashboard")
    }
}