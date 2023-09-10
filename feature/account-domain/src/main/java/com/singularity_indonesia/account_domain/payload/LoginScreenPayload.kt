package com.singularity_indonesia.account_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING
import com.singularity_indonesia.core.core_common.navigation.Navigation
import com.singularity_indonesia.core.core_common.navigation.NavigationEvent

/**
 * Created by: stefanus
 * 10/09/23 03.24
 * Design by: stefanus.ayudha@gmail.com
 */
data class LoginScreenPayload(
    val nothing: NOTHING = NOTHING
) : Payload
