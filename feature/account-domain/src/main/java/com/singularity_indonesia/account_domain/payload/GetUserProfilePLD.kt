package com.singularity_indonesia.account_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_code.codebase.util.serialization.NOTHING
import com.singularity_indonesia.account_domain.model.UserCredential

/**
 * Created by: stefanus
 * 10/09/23 16.50
 * Design by: stefanus.ayudha@gmail.com
 */
data class GetUserProfilePLD(
    val credential: UserCredential
) : Payload
