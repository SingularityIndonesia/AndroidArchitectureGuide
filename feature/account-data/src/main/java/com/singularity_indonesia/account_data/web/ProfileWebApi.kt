package com.singularity_indonesia.account_data.web

import com.singularity_indonesia.account_domain.model.BearerToken
import com.singularity_indonesia.account_domain.model.UserCredential

/**
 * Created by: stefanus
 * 10/09/23 17.01
 * Design by: stefanus.ayudha@gmail.com
 */
interface ProfileWebApi {
    suspend fun getUserCredential(
        bearerToken: String
    ): Result<UserCredential>

    suspend fun getUserProfileImageURL(
        bearerToken: String
    ): Result<String>

}