package com.singularity_indonesia.account_ui

import com.singularity_indonesia.account_domain.screen.LoginScreen
import com.singularity_indonesia.account_ui.login.LoginScreenImpl
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by: stefanus
 * 10/09/23 03.29
 * Design by: stefanus.ayudha@gmail.com
 */

val AccountUIModule = module {
    factory {
        LoginScreenImpl
    } bind LoginScreen::class
}