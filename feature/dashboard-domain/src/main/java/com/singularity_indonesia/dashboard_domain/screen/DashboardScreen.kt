package com.singularity_indonesia.dashboard_domain.screen

import androidx.compose.runtime.Composable
import com.singularity_indonesia.core.core_common.navigation.Destination
import com.singularity_indonesia.dashboard_domain.payload.DashboardScreenPayload

/**
 * Created by: stefanus
 * 09/09/23 20.51
 * Design by: stefanus.ayudha@gmail.com
 */

data class DashboardDestination(
    override val route: String = DashboardScreen.ROUTE,
    override val payload: DashboardScreenPayload?
) : Destination<DashboardScreenPayload>

fun interface DashboardScreen {
    companion object {
        const val ROUTE = "DashboardScreen"
    }

    @Composable
    operator fun invoke(pld: DashboardScreenPayload?)
}