android {
    namespace = "com.singularity_indonesia.account_ui"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
}

dependencies {
    testApi("junit:junit:4.13.2")
    androidTestApi("androidx.test.ext:junit:1.1.5")
    androidTestApi("androidx.test.espresso:espresso-core:3.5.1")

    androidTestApi(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestApi("androidx.compose.ui:ui-test-junit4")
    debugApi("androidx.compose.ui:ui-tooling")
    debugApi("androidx.compose.ui:ui-test-manifest")

    api(project(":lib:core-common"))
    api(project(":lib:core-ui"))
    api(project(mapOf("path" to ":feature:account-domain")))
    api(project(mapOf("path" to ":feature:navigation-domain")))
}