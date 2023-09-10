android {
    namespace = "com.singularity_indonesia.core_common"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // CORE
    api("androidx.core:core-ktx:1.12.0")
    api("androidx.appcompat:appcompat:1.6.1")
    api("com.google.android.material:material:1.9.0")

    // CODEBASE
    releaseApi("com.github.SingularityIndonesia:AndroidCodebase:2.0.0-alpha1-20230908")
    debugApi("com.github.SingularityIndonesia:AndroidCodebase:2.0.0-alpha1-20230908-debug")

    // NAVIGATION
    api("androidx.navigation:navigation-compose:2.7.2")

    // KOIN
    api("io.insert-koin:koin-android:3.1.5")
    api("io.insert-koin:koin-compose:1.0.4")
    api ("io.insert-koin:koin-androidx-compose:3.4.6")

    // MULTIDEX
    api("androidx.multidex:multidex:2.0.1")

    // Lifecycle
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // COMPOSE
    api("androidx.activity:activity-compose:1.7.2")
    /*implementation("androidx.compose.material3:material3:1.2.0-alpha04")*/
    api("androidx.compose.material3:material3:1.2.0-alpha07")
    api("androidx.compose.ui:ui:1.5.1")
    api("androidx.compose.ui:ui-tooling-preview:1.5.1")
    api("androidx.navigation:navigation-compose:2.7.2")
    api("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

    // ACCOMPANIST
    api("com.google.accompanist:accompanist-permissions:0.23.1")

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

    // RETROFIT
    api("com.squareup.retrofit2:retrofit:2.9.0")
    api("com.squareup.retrofit2:converter-gson:2.9.0")

    // GSON
    api("com.google.code.gson:gson:2.10.1")

    // ROOM
    api("androidx.room:room-runtime:2.5.2")
    api("androidx.room:room-common:2.5.2")
    annotationProcessor("androidx.room:room-compiler:2.5.2")
    // ksp "androidx.room:room-compiler:2.5.2"
    api("androidx.room:room-guava:2.5.2")
    // optional - Paging 3 Integration
    api("androidx.room:room-paging:2.5.2")

    // COIL
    api("io.coil-kt:coil-compose:2.4.0")
    api("io.coil-kt:coil-gif:2.4.0")

    // PHOENIX
    api("com.jakewharton:process-phoenix:2.1.2")

    // PLUTO
    debugApi("com.plutolib:pluto:2.1.5")
    releaseApi("com.plutolib:pluto-no-op:2.1.3")
    debugApi("com.plutolib.plugins:bundle-core:2.1.5")
    releaseApi("com.plutolib.plugins:bundle-core-no-op:2.1.3")
    debugApi("com.plutolib.plugins:network:2.1.5")
    releaseApi("com.plutolib.plugins:network-no-op:2.1.3")
    debugApi("com.plutolib.plugins:exceptions:2.1.5")
    releaseApi("com.plutolib.plugins:exceptions-no-op:2.1.3")
    debugApi("com.plutolib.plugins:logger:2.1.5")
    releaseApi("com.plutolib.plugins:logger-no-op:2.1.3")
    debugApi("com.plutolib.plugins:preferences:2.1.5")
    releaseApi("com.plutolib.plugins:preferences-no-op:2.1.3")
    debugApi("com.plutolib.plugins:rooms-db:2.1.5")
    releaseApi("com.plutolib.plugins:rooms-db-no-op:2.1.3")
    debugApi("com.plutolib.plugins:datastore-pref:2.1.5")
    releaseApi("com.plutolib.plugins:datastore-pref-no-op:2.1.3")

    // SQL Cipher
    api("net.zetetic:android-database-sqlcipher:4.5.3")

    // FUNC IT
    api("com.github.SingularityIndonesia:Func-It:1.0.0-alpha1-20230826-03")
}