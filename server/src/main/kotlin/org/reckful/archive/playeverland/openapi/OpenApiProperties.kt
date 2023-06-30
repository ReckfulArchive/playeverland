package org.reckful.archive.playeverland.openapi

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "openapi")
data class
OpenApiProperties(
    val info: OpenApiInfo,
    val serverUrls: List<String> = emptyList()
)
