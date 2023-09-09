package com.singularity_indonesia.core.core_common.util

import com.singularity_code.codebase.util.flow.automate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Created by: stefanus
 * 10/09/23 02.58
 * Design by: stefanus.ayudha@gmail.com
 */

context (CoroutineScope)
fun <T> T.automate(block: suspend T.() -> Unit): T = this.also {
    launch {
        block.invoke(it)
    }
}