package com.singularity_indonesia.account_data

import com.singularity_indonesia.account_data.repo.AuthRepositoryImpl
import com.singularity_indonesia.account_data.repo.ProfileRepositoryImpl
import com.singularity_indonesia.account_data.web.AuthWebApi

/**
 * Created by: stefanus
 * 10/09/23 16.55
 * Design by: stefanus.ayudha@gmail.com
 */

val AccountDataModule = arrayOf(
    AuthWebApi.MOD,
    AuthRepositoryImpl.MOD,
    ProfileRepositoryImpl.MOD
)