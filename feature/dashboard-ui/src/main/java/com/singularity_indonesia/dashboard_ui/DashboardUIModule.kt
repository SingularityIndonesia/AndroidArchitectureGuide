package com.singularity_indonesia.dashboard_ui

import com.singularity_indonesia.dashboard_ui.dashboard.DashboardScreenImpl
import com.singularity_indonesia.navigation_domain.screen.DashboardScreen
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by: stefanus
 * 10/09/23 02.14
 * Design by: stefanus.ayudha@gmail.com
 */

val DashboardUIModule = arrayOf(
    module {
        factory {
            DashboardScreenImpl
        } bind DashboardScreen::class
    }
)