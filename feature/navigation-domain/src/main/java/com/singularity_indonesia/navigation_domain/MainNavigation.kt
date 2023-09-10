package com.singularity_indonesia.navigation_domain

import androidx.compose.runtime.Composable
import com.singularity_indonesia.core_common.pattern.Navigation

/**
 * Created by: stefanus
 * 10/09/23 11.41
 * Design by: stefanus.ayudha@gmail.com
 */

interface MainNavigation : Navigation<MainNavigationEvent> {
    @Composable
    override fun Content()
}