package com.singularity_indonesia.singularityarchitectureguideline

import androidx.multidex.MultiDexApplication
import com.singularity_code.codebase.util.Singularity

/**
 * Created by: stefanus
 * 10/09/23 01.19
 * Design by: stefanus.ayudha@gmail.com
 */
class MainApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        Singularity.Init(this)
            .EnableFeature(Singularity.Feature.MULTI_DEX())
            .EnableFeature(Singularity.Feature.PLUTO_DEBUGGER())
    }
}