package com.singularity_indonesia.account_ui.login.viewmodel

import com.singularity_indonesia.account_domain.model.Email
import com.singularity_indonesia.account_domain.model.Password

/**
 * Created by: stefanus
 * 10/09/23 19.14
 * Design by: stefanus.ayudha@gmail.com
 */
sealed interface LoginViewModelEvent
object Idle : LoginViewModelEvent
data class Login(
    val email: Email,
    val password: Password
) : LoginViewModelEvent