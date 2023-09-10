package com.singularity_indonesia.account_domain.model

/**
 * Created by: stefanus
 * 10/09/23 16.49
 * Design by: stefanus.ayudha@gmail.com
 */
data class Token(
    val bearerToken: BearerToken,
    val bearerExpiredDate: TokenExpiredDate
)
