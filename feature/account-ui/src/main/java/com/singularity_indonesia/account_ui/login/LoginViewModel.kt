package com.singularity_indonesia.account_ui.login

import androidx.lifecycle.ViewModel
import com.singularity_code.codebase.util.flow.automate
import com.singularity_code.codebase.util.flow.collect
import com.singularity_code.codebase.util.flow.provider
import com.singularity_code.codebase.util.flow.register
import com.singularity_indonesia.account_domain.payload.LoginPLD
import com.singularity_indonesia.account_domain.repo.AuthRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by: stefanus
 * 10/09/23 19.11
 * Design by: stefanus.ayudha@gmail.com
 */

class LoginViewModel(
    private val authRepository: AuthRepository
) : ViewModel() {

    companion object {
        val MOD = module {
            /** declare modules here **/
            viewModel {
                LoginViewModel(
                    get()
                )
            }
        }
    }

    private val event by register<LoginViewModelEvent>(Idle)

    private val loginProvider by lazy {
        val provider by provider(operator = authRepository::login)

        provider.automate {
            collect(event.data) { event ->
                if (event is Login) {
                    update(
                        LoginPLD(
                            email = event.email,
                            password = event.password
                        )
                    )
                }
            }
        }
    }

    val message = combine(
        flow<StringBuilder> { StringBuilder() },
        event.data,
        loginProvider.loading,
        loginProvider.success,
        loginProvider.error
    ) { sb, event, loading, success, error ->

        sb.clear()
        sb.append("Receive Event : $event")
        sb.append("\n")
        sb.append("\n")

        when {
            loading -> sb.append("Loading...")
            success.isSome() -> {
                sb.append("Success")
                sb.append("\n")
                sb.append("\n")
                sb.append("UserCredential: ${success.getOrNull()}")
            }

            error.isSome() -> sb.append("Error : ${error.getOrNull()}")
            else -> sb.append("Idle")
        }

        sb.toString()
    }.flowOn(Dispatchers.IO)
}