package com.singularity_indonesia.navigation_domain.screen

import androidx.compose.runtime.Composable
import com.singularity_indonesia.common.pattern.Destination
import com.singularity_indonesia.common.pattern.Screen
import com.singularity_indonesia.navigation_domain.payload.DashboardScreenPayload

/**
 * Created by: stefanus
 * 10/09/23 13.00
 * Design by: stefanus.ayudha@gmail.com
 */

data class DashboardDestination(
    override val route: String = DashboardScreen.ROUTE,
    override val payload: DashboardScreenPayload?
) : Destination<DashboardScreenPayload>

fun interface DashboardScreen : Screen<DashboardScreenPayload> {
    companion object {
        const val ROUTE = "DashboardScreen"
    }

    @Composable
    override operator fun invoke(pld: DashboardScreenPayload?)
}