package com.singularity_indonesia.navigation_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING
import com.singularity_indonesia.navigation_domain.MainNavigation

/**
 * Created by: stefanus
 * 10/09/23 13.02
 * Design by: stefanus.ayudha@gmail.com
 */
data class DashboardScreenPayload(
    val nothing: NOTHING = NOTHING,
    val mainNavigation: MainNavigation
) : Payload