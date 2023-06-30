package org.reckful.archive.playeverland

import org.reckful.archive.playeverland.openapi.OpenApiProperties
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

fun main() {
    SpringApplication.run(Application::class.java)
}

@SpringBootApplication
@EnableConfigurationProperties(OpenApiProperties::class)
class Application

