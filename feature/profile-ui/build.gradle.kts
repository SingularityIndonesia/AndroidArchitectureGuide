android {
    namespace = "com.singularity_indonesia.profile_ui"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
}

dependencies {
    api(project(":lib:core-common"))
    api(project(":lib:core-ui"))
}