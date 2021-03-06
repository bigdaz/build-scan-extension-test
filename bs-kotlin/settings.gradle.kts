pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}
plugins {
    id("com.gradle.enterprise") version("3.7.1")
}
gradleEnterprise {
    server = "https://localhost"
    allowUntrustedServer = true
    buildScan {
        publishAlways()
    }
}

rootProject.name = "bs-kotlin"
include("app", "list", "utilities")
