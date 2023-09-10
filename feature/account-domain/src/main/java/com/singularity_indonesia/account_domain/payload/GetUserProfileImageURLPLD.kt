package com.singularity_indonesia.account_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_indonesia.account_domain.model.UserCredential

/**
 * Created by: stefanus
 * 10/09/23 16.54
 * Design by: stefanus.ayudha@gmail.com
 */
data class GetUserProfileImageURLPLD(
    val credential: UserCredential
) : Payload