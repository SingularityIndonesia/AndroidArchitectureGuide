import java.net.URI

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}

rootProject.name = "Singularity Architecture Guideline"
include(":app")
include(":lib")
include(":lib:ui")
include(":lib:network")
include(":lib:common")
include(":lib:gridder")
include(":feature")
include(":feature:navigation-domain")
include(":feature:navigation-ui")
include(":feature:dashboard-domain")
include(":feature:dashboard-data")
include(":feature:dashboard-ui")
include(":feature:account-domain")
include(":feature:account-data")
include(":feature:account-ui")
include(":feature:apod-domain")
include(":feature:apod-ui")
include(":feature:apod-data")
