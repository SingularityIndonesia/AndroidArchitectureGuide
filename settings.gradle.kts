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
include(":navigation")
include(":lib")
include(":lib:core-common")
include(":lib:core-network")
include(":lib:core-ui")
include(":feature")
include(":feature:dashboard-domain")
include(":feature:account-domain")
include(":feature:account-data")
include(":feature:account-ui")
include(":feature:dashboard-data")
include(":feature:dashboard-ui")
