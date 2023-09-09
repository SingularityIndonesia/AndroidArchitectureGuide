package com.singularity_indonesia.dashboard_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING

/**
 * Created by: stefanus
 * 09/09/23 20.57
 * Design by: stefanus.ayudha@gmail.com
 */
data class DashboardScreenPayload(
    val nothing: NOTHING = NOTHING
) : Payload