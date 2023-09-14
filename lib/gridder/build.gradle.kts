android {
    namespace = "com.singularity_indonesia.gridder"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
}

dependencies {

    // FUNC IT
    // Collections of utils to support your functional programming kotlin.
    // see: https://github.com/SingularityIndonesia/Func-It
    api("com.github.SingularityIndonesia:Func-It:1.0.0-alpha1-20230910")

    testApi("junit:junit:4.13.2")
    androidTestApi("androidx.test.ext:junit:1.1.5")
    androidTestApi("androidx.test.espresso:espresso-core:3.5.1")

    androidTestApi(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestApi("androidx.compose.ui:ui-test-junit4")
    debugApi("androidx.compose.ui:ui-tooling")
    debugApi("androidx.compose.ui:ui-test-manifest")

    // CORE
    api("androidx.core:core-ktx:1.12.0")
    api("androidx.appcompat:appcompat:1.6.1")
    api("com.google.android.material:material:1.9.0")

    // Lifecycle
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // COMPOSE
    api("androidx.activity:activity-compose:1.7.2")
    /*api("androidx.compose.material3:material3:1.2.0-alpha04")*/
    api("androidx.compose.material3:material3:1.2.0-alpha07")
    api("androidx.compose.ui:ui:1.5.1")
    api("androidx.compose.ui:ui-tooling-preview:1.5.1")
    api("androidx.navigation:navigation-compose:2.7.2")
    api("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

    // OKHTTP
    api("com.squareup.okhttp3:okhttp:5.0.0-alpha.9")

    // KOTLIN ARROW
    api("io.arrow-kt:arrow-core:1.2.0")
    api("io.arrow-kt:arrow-fx-coroutines:1.2.0")
    api("io.arrow-kt:arrow-core-retrofit:1.1.4-alpha.17")
    api("io.arrow-kt:arrow-optics:1.2.0")
    /*ksp ("io.arrow-kt:arrow-optics-ksp-plugin:1.1.4-alpha.17")*/

    // COROUTINES
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.2")
    api("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    // GSON
    api("com.google.code.gson:gson:2.10.1")

    // COIL
    api("io.coil-kt:coil-compose:2.4.0")
    api("io.coil-kt:coil-gif:2.4.0")
}