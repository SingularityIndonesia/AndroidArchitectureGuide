package com.singularity_indonesia.account_domain.payload

import com.singularity_code.codebase.pattern.Payload
import com.singularity_indonesia.account_domain.model.Email
import com.singularity_indonesia.account_domain.model.Password

/**
 * Created by: stefanus
 * 10/09/23 17.04
 * Design by: stefanus.ayudha@gmail.com
 */
data class LoginPLD(
    val email: Email,
    val password: Password
) : Payload
