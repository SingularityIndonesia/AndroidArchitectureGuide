package com.singularity_indonesia.navigation_ui

import com.singularity_indonesia.navigation_domain.MainNavigation
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by: stefanus
 * 10/09/23 11.47
 * Design by: stefanus.ayudha@gmail.com
 */
val NavigationModule = module {
    factory {
        MainNavigationImpl(it.get())
    } bind MainNavigation::class
}