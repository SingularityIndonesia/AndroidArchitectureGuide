package com.singularity_indonesia.account_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING

/**
 * Created by: stefanus
 * 10/09/23 03.24
 * Design by: stefanus.ayudha@gmail.com
 */
data class LoginScreenPayload(
    val nothing: NOTHING = NOTHING
) : Payload
