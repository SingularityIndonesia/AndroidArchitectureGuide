package com.singularity_indonesia.ui.pattern

import androidx.compose.runtime.Composable
import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.pattern.Register

/**
 * Created by: stefanus
 * 10/09/23 13.12
 * Design by: stefanus.ayudha@gmail.com
 */
interface Destination<P : Payload> {
    val route: String
    val payload: P?
}

fun interface Screen<P : Payload> {
    @Composable
    operator fun invoke(pld: P?)
}

data class Back(
    override val route: String = "BACK",
    override val payload: Payload? = null
) : Destination<Payload>

interface NavigationEvent

interface Navigation<E : NavigationEvent> {
    val event: Register<E>

    @Composable
    fun Content()
}