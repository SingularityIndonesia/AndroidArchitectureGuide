package com.singularity_indonesia.account_data

import com.singularity_indonesia.account_data.repo.AuthRepositoryImpl
import com.singularity_indonesia.account_data.repo.ProfileRepositoryImpl
import com.singularity_indonesia.account_data.web.AuthWebApi
import com.singularity_indonesia.account_domain.repo.AuthRepository
import com.singularity_indonesia.account_domain.repo.ProfileRepository
import org.koin.dsl.bind
import org.koin.dsl.module

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