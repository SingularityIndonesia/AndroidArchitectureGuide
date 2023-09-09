package com.singularity_indonesia.account_domain.screen

import androidx.compose.runtime.Composable
import com.singularity_indonesia.account_domain.payload.LoginScreenPayload
import com.singularity_indonesia.core.core_common.navigation.Destination

/**
 * Created by: stefanus
 * 10/09/23 03.23
 * Design by: stefanus.ayudha@gmail.com
 */
data class LoginDestination(
    override val route: String = LoginScreen.ROUTE,
    override val payload: LoginScreenPayload?
) : Destination<LoginScreenPayload>

fun interface LoginScreen {
    companion object {
        const val ROUTE = "LoginScreen"
    }

    @Composable
    operator fun invoke(pld: LoginScreenPayload?)
}