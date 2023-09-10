package com.singularity_indonesia.account_domain.repo

import com.singularity_indonesia.account_domain.model.UserCredential
import com.singularity_indonesia.account_domain.payload.LoginPLD

/**
 * Created by: stefanus
 * 10/09/23 16.51
 * Design by: stefanus.ayudha@gmail.com
 */
interface AuthRepository {
    suspend fun login(
        pld: LoginPLD
    ): Result<UserCredential>
}