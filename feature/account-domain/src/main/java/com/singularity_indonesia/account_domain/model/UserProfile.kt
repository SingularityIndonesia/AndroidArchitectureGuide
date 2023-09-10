package com.singularity_indonesia.account_domain.model

/**
 * Created by: stefanus
 * 10/09/23 16.42
 * Design by: stefanus.ayudha@gmail.com
 */

data class UserProfile(
    val name: UserName,
    val birthDate: BirthDate,
    val email: Email
)