android {
    namespace = "com.singularity_indonesia.order_domain"
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
    }
}

dependencies {
    api(project(":lib:core-common"))
}