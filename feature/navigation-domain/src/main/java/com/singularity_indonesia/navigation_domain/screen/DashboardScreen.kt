package com.singularity_indonesia.navigation_domain.screen

import androidx.compose.runtime.Composable
import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING
import com.singularity_indonesia.core.core_common.navigation.Destination
import com.singularity_indonesia.core.core_common.navigation.Screen
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