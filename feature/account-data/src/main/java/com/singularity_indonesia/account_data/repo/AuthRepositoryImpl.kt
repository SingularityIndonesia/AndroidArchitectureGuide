package com.singularity_indonesia.account_data.repo

import com.singularity_indonesia.account_data.web.AuthWebApi
import com.singularity_indonesia.account_data.web.ProfileWebApi
import com.singularity_indonesia.account_domain.model.UserCredential
import com.singularity_indonesia.account_domain.payload.LoginPLD
import com.singularity_indonesia.account_domain.repo.AuthRepository
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by: stefanus
 * 10/09/23 17.06
 * Design by: stefanus.ayudha@gmail.com
 */
class AuthRepositoryImpl(
    private val webApi: AuthWebApi
) : AuthRepository {

    companion object {
        val MOD = module {
            /** declare modules here **/
            factory {
                AuthRepositoryImpl(
                    get()
                )
            } bind AuthRepository::class
        }
    }

    override suspend fun login(
        pld: LoginPLD
    ): Result<UserCredential> {
        return webApi.login(
            email = pld.email.value,
            password = pld.password.value
        )
    }
}