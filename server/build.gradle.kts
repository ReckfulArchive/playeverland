plugins {
    kotlin("jvm")

    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")

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
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-logging")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")

    implementation("org.postgresql:postgresql")
    implementation("org.flywaydb:flyway-core")

    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
