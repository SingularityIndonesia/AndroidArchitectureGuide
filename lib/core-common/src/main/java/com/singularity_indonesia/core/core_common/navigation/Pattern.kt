package com.singularity_indonesia.core.core_common.navigation

import androidx.compose.runtime.Composable
import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.pattern.Register

/**
 * Created by: stefanus
 * 09/09/23 20.52
 * Design by: stefanus.ayudha@gmail.com
 */

interface Destination<P : Payload> {
    val route: String
    val payload: P?
}

interface NavigationEvent

interface Navigation<E : NavigationEvent> {
    val event: Register<E>

    @Composable
    fun Content()
}