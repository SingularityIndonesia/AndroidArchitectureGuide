import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension

/*import org.gradle.kotlin.dsl.kotlinOptions*/

subprojects {
    apply(plugin = "com.android.library")
    apply(plugin = "org.jetbrains.kotlin.android")
    apply(plugin = "kotlin-android")
    /*apply(plugin = "kotlin-parcelize")
    apply(plugin = "kotlin-kapt")
    apply(plugin = "androidx.navigation.safeargs")
    apply(plugin = "com.google.android.libraries.mapsplatform.secrets-gradle-plugin")*/

    plugins.withType(BasePlugin::class.java).configureEach {
        configure<BaseExtension> {

            val androidLibrary = extensions.findByName("android") as? LibraryExtension
                ?: error("Project '$name' is not an Android module")

            androidLibrary.apply {
                compileSdk = 34

                defaultConfig {
                    minSdk = 24

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                    consumerProguardFiles("consumer-rules.pro")
                }

                buildTypes {
                    release {
                        isMinifyEnabled = true
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                    create("staging") {
                        isMinifyEnabled = true
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                    debug {
                        isMinifyEnabled = false
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }
                buildFeatures {
                    compose = true
                }

                // this is not working yet
                /*kotlinOptions {
                    jvmTarget = "1.8"
                    freeCompilerArgs = freeCompilerArgs.plus("-Xcontext-receivers")
                }*/
            }
        }
    }

}