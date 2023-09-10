package com.singularity_indonesia.account_data.repo

import com.singularity_indonesia.account_data.web.ProfileWebApi
import com.singularity_indonesia.account_domain.model.UserProfile
import com.singularity_indonesia.account_domain.payload.GetUserProfileImageURLPLD
import com.singularity_indonesia.account_domain.payload.GetUserProfilePLD
import com.singularity_indonesia.account_domain.repo.ProfileRepository
import org.koin.dsl.bind
import org.koin.dsl.module
import java.net.URL

/**
 * Created by: stefanus
 * 10/09/23 16.57
 * Design by: stefanus.ayudha@gmail.com
 */
class ProfileRepositoryImpl(
    private val webApi: ProfileWebApi
) : ProfileRepository {

    companion object {
        val MOD = module {
            /** declare modules here **/
            factory {
                ProfileRepositoryImpl(
                    get()
                )
            } bind ProfileRepository::class
        }
    }

    override suspend fun getUserProfile(
        pld: GetUserProfilePLD
    ): Result<UserProfile> {
        TODO("Not yet implemented")
    }

    override suspend fun getProfileImageURL(
        pld: GetUserProfileImageURLPLD
    ): Result<URL> {
        TODO("Not yet implemented")
    }
}