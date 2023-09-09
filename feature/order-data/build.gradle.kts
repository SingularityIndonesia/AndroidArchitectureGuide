android {
    namespace = "com.singularity_indonesia.order_data"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
}

dependencies {
    api(project(":lib:core-common"))
    api(project(":lib:core-network"))
    api(project(":lib:core-ui"))
}