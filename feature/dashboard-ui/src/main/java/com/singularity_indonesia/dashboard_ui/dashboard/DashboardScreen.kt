package com.singularity_indonesia.dashboard_ui.dashboard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.singularity_indonesia.core.core_common.navigation.Screen
import com.singularity_indonesia.dashboard_domain.payload.DashboardScreenPayload
import com.singularity_indonesia.dashboard_domain.screen.DashboardScreen

/**
 * Created by: stefanus
 * 09/09/23 21.00
 * Design by: stefanus.ayudha@gmail.com
 */

val DashboardScreenImpl = DashboardScreen {
    Text("Dashboard Screen $it")
}