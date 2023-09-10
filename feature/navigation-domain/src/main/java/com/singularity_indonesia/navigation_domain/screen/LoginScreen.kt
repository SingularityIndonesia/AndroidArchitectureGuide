package com.singularity_indonesia.navigation_domain.screen

import androidx.compose.runtime.Composable
import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING
import com.singularity_indonesia.core.core_common.navigation.Destination
import com.singularity_indonesia.core.core_common.navigation.Screen
import com.singularity_indonesia.navigation_domain.payload.LoginScreenPayload

/**
 * Created by: stefanus
 * 10/09/23 12.59
 * Design by: stefanus.ayudha@gmail.com
 */

data class LoginDestination(
    override val route: String = LoginScreen.ROUTE,
    override val payload: LoginScreenPayload?
) : Destination<LoginScreenPayload>

fun interface LoginScreen : Screen<LoginScreenPayload> {
    companion object {
        const val ROUTE = "LoginScreen"
    }

    @Composable
    override operator fun invoke(pld: LoginScreenPayload?)
}