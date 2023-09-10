package com.singularity_indonesia.account_data.web

import com.singularity_indonesia.account_domain.model.BearerToken
import com.singularity_indonesia.account_domain.model.DateEpoc
import com.singularity_indonesia.account_domain.model.Token
import com.singularity_indonesia.account_domain.model.TokenExpiredDate
import com.singularity_indonesia.account_domain.model.UserCredential
import kotlinx.coroutines.delay
import org.koin.dsl.module
import java.lang.System.currentTimeMillis

/**
 * Created by: stefanus
 * 10/09/23 17.09
 * Design by: stefanus.ayudha@gmail.com
 */
interface AuthWebApi {
    companion object {
        val MOD = module {
            /** declare modules here **/
            factory {
                /** Dummy Web Api **/
                object : AuthWebApi {
                    override suspend fun login(
                        email: String, password: String
                    ): Result<UserCredential> {
                        delay(5000)
                        return runCatching {
                            UserCredential(
                                token = Token(
                                    bearerToken = BearerToken("Bearer 1234567890"),
                                    bearerExpiredDate = TokenExpiredDate(
                                        DateEpoc(
                                            currentTimeMillis() + 24 * 60 * 60 * 1000
                                        )
                                    )
                                )
                            )
                        }
                    }

                }
            }
        }
    }

    suspend fun login(
        email: String,
        password: String
    ): Result<UserCredential>
}