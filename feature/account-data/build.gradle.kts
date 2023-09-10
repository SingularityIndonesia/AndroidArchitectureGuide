android {
    namespace = "com.singularity_indonesia.account_data"
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
    api(project(":lib:core-common"))
    api(project(":lib:core-network"))
    implementation(project(mapOf("path" to ":feature:account-domain")))
}