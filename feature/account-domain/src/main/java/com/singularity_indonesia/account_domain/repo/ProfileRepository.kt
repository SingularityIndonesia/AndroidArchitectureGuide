package com.singularity_indonesia.account_domain.repo

import com.singularity_indonesia.account_domain.model.UserProfile
import com.singularity_indonesia.account_domain.payload.GetUserProfileImageURLPLD
import com.singularity_indonesia.account_domain.payload.GetUserProfilePLD
import java.net.URL

/**
 * Created by: stefanus
 * 10/09/23 16.39
 * Design by: stefanus.ayudha@gmail.com
 */
interface ProfileRepository {
    suspend fun getUserProfile(
        pld: GetUserProfilePLD
    ): Result<UserProfile>

    suspend fun getProfileImageURL(
        pld: GetUserProfileImageURLPLD
    ): Result<URL>
}