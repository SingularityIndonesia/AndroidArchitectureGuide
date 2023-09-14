package com.singularity_indonesia.account_ui.login

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import arrow.core.None
import com.singularity_indonesia.account_domain.model.Email
import com.singularity_indonesia.account_domain.model.Password
import com.singularity_indonesia.common.type.ButtonState
import com.singularity_indonesia.navigation_domain.MainNavigationEvent
import com.singularity_indonesia.navigation_domain.screen.LoginScreen
import kotlinx.coroutines.flow.map
import org.koin.androidx.compose.koinViewModel

/**
 * Created by: stefanus
 * 10/09/23 03.27
 * Design by: stefanus.ayudha@gmail.com
 */

val LoginScreenImpl = LoginScreen @Composable { pld ->
    val context = LocalContext.current
    val vm = koinViewModel<LoginViewModel>()
    val buttonState = vm.buttonState.collectAsState(ButtonState.Normal)
    val buttonClickable = vm.buttonClickable.collectAsState(false)
    val loginResult = vm.loginProvider.success.collectAsState(None)

    LaunchedEffect(loginResult.value) {
        if (loginResult.value.isSome()) {
            Toast.makeText(context, "Login Success", Toast.LENGTH_LONG).show()
            pld?.mainNavigation?.event
                ?.set(MainNavigationEvent.GoToDashboard)
        }
    }

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
                    .align(Alignment.End)
                    .defaultMinSize(minWidth = 90.dp),
                onClick = {
                    if (buttonClickable.value)
                        vm.event.set(
                            Login(
                                email = Email("Sukidi@gmail.com"),
                                password = Password("1234")
                            )
                        )
                }
            ) {
                if (buttonState.value is ButtonState.Loading)
                    CircularProgressIndicator(
                        modifier = Modifier.size(24.dp),
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                else
                    Text("Login")
            }
        }
    }
}