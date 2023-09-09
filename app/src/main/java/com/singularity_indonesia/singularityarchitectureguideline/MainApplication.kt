package com.singularity_indonesia.singularityarchitectureguideline

import androidx.multidex.MultiDexApplication
import com.singularity_code.codebase.util.Singularity
import com.singularity_indonesia.dashboard_ui.DashboardUIModule
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.module.Module

/**
 * Created by: stefanus
 * 10/09/23 01.19
 * Design by: stefanus.ayudha@gmail.com
 */
data class Modules(
    val list: List<Module> = listOf(
        DashboardUIModule
    )
)

class MainApplication(
    private val modules: Modules
) : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(modules.list)
        }

        Singularity.Init(this)
            .EnableFeature(Singularity.Feature.MULTI_DEX())
            .EnableFeature(Singularity.Feature.PLUTO_DEBUGGER())
    }

    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }
}