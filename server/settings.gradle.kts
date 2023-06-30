rootProject.name = "playeverland-server"

pluginManagement {
    val kotlin_version: String by settings
    val spring_boot_version: String by settings
    plugins {
        id("org.jetbrains.kotlin.jvm") version kotlin_version
        id("org.jetbrains.kotlin.plugin.spring") version kotlin_version
        id("org.springframework.boot") version spring_boot_version
    }
}
