package org.reckful.archive.playeverland.openapi

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenAPIConfiguration(
    private val configurationProperties: OpenApiProperties
) {
    @Bean
    fun openApi(): OpenAPI {
        val info = configurationProperties.info
        return OpenAPI()
            .info(
                Info()
                    .title(info.title)
                    .description(
                        """
                        ${info.shortDescription}
                        
                        You can find this project's source code here: ${beautifyHtmlLink(info.sourceCodeLink)}
                    """.trimIndent()
                    )
            )
            .servers(
                configurationProperties.serverUrls.map {
                    Server().url(it)
                }
            )
    }

    private fun beautifyHtmlLink(link: String): String {
        val linkWithoutNoise = link
            .removePrefix("https://")
            .removePrefix("http://")
            .removePrefix("www.")
            .removeSuffix("/")

        return "<a href=\"$link\">$linkWithoutNoise</a>"
    }
}
