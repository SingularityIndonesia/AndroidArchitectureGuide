package com.singularity_indonesia.core_common.util.compose

import androidx.navigation.NavHostController
import kotlinx.coroutines.flow.first

/**
 * Created by: stefanus
 * 10/09/23 03.11
 * Design by: stefanus.ayudha@gmail.com
 */

suspend fun NavHostController.clearBackStack() {
    val currentBackStack = currentBackStack.first()
    currentBackStack.forEach {
        clearBackStack(it.id)
    }
}