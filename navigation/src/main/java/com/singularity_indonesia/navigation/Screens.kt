package com.singularity_indonesia.navigation

import com.singularity_indonesia.account_domain.screen.LoginScreen
import com.singularity_indonesia.dashboard_domain.screen.DashboardScreen
import org.koin.java.KoinJavaComponent

/**
 * Created by: stefanus
 * 10/09/23 03.06
 * Design by: stefanus.ayudha@gmail.com
 */

data class Screens(
    val loginScreen: Lazy<LoginScreen> = KoinJavaComponent.inject(
        clazz = LoginScreen::class.java
    ),
    val dashboardScreen: Lazy<DashboardScreen> = KoinJavaComponent.inject(
        clazz = DashboardScreen::class.java
    )
)