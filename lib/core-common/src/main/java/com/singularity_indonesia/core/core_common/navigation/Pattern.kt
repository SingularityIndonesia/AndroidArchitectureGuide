package com.singularity_indonesia.core.core_common.navigation

import androidx.compose.runtime.Composable
import com.singularity_code.codebase.pattern.Payload

/**
 * Created by: stefanus
 * 09/09/23 20.52
 * Design by: stefanus.ayudha@gmail.com
 */
interface Screen<P : Payload> {
    val Content: @Composable (pld: P?) -> Unit
}

interface Destination<P : Payload> {
    val route: String
    val payload: P
}

interface Navigation {
    fun <D : Destination<P>, P : Payload> navigate(
        destination: D,
        clearBackStack: Boolean = false
    )

    fun goBack(): Boolean

    @Composable
    fun Content()
}