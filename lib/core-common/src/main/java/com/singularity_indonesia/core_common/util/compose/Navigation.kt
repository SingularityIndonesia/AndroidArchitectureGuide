package com.singularity_indonesia.core_common.util.compose

import android.util.Log
import androidx.navigation.NavHostController
import kotlinx.coroutines.flow.first

/**
 * Created by: stefanus
 * 10/09/23 03.11
 * Design by: stefanus.ayudha@gmail.com
 */

suspend fun NavHostController.clearBackStack(): Boolean {
    val currentBackStack = currentBackStack.first()

    // cancel operation if no backstack
    if (currentBackStack.size <= 1) return false

    val removeAbleBackStack = currentBackStack.subList(0, currentBackStack.size - 2)
    Log.d("TAG", "clearBackStack: Removable ${removeAbleBackStack.map { it.destination.route }}")

    removeAbleBackStack.fold(true) { l, r ->
        Log.d("TAG", "clearBackStack: ${r.destination.route}")
        l
    }

    return true
}