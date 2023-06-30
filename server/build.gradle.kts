plugins {
    kotlin("jvm")

    id("org.jetbrains.kotlin.plugin.spring")
    id("org.springframework.boot")
}

group = "org.reckful.archive"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_19
    targetCompatibility = JavaVersion.VERSION_19
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootJar {
    enabled = true
}

springBoot {
    mainClass.set("org.reckful.archive.playeverland.ApplicationKt")
}

dependencies {
    val spring_boot_version: String by project
    implementation("org.springframework.boot:spring-boot-starter:$spring_boot_version")
    implementation("org.springframework.boot:spring-boot-starter-web:$spring_boot_version")
    implementation("org.springframework.boot:spring-boot-starter-logging:$spring_boot_version")

    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test:$spring_boot_version")
}
