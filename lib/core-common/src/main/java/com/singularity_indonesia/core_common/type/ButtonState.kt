package com.singularity_indonesia.core_common.type

/**
 * Created by: stefanus
 * 11/09/23 00.14
 * Design by: stefanus.ayudha@gmail.com
 */
sealed interface ButtonState {
    object Normal : ButtonState
    object Loading : ButtonState
    object Disabled : ButtonState
}