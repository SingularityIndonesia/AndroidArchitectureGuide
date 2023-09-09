package com.singularity_indonesia.core.core_common.util

import com.singularity_code.codebase.pattern.Register
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

/**
 * Created by: stefanus
 * 10/09/23 02.56
 * Design by: stefanus.ayudha@gmail.com
 */

context (CoroutineScope)
fun <T> createRegister(default: T) = object : Register<T> {
    private val _data = MutableStateFlow<T>(default)
    override val data: Flow<T>
        get() = _data

    override fun set(
        data: T
    ) {
        launch {
            _data.emit(data)
        }
    }
}