android {
    namespace = "com.singularity_indonesia.dashboard_data"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
}

dependencies {
    api(project(":lib:core-common"))
    api(project(":lib:core-network"))
}