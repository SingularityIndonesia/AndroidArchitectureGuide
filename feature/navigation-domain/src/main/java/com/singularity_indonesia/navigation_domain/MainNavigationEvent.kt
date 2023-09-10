package com.singularity_indonesia.navigation_domain

import com.singularity_indonesia.core_common.pattern.NavigationEvent

/**
 * Created by: stefanus
 * 10/09/23 11.43
 * Design by: stefanus.ayudha@gmail.com
 */
sealed interface MainNavigationEvent : NavigationEvent {
    object Idle : MainNavigationEvent

    object GoToLogin : MainNavigationEvent

    object GoToDashboard : MainNavigationEvent

    object GoBack : MainNavigationEvent
}
