package org.reckful.archive.playeverland.news

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "News", description = "News requests")
class NewsController(
    val newsService: NewsService
) {
    @Operation(summary = "Retrieves all news")
    @GetMapping("/news", produces = ["application/json"])
    fun getNews(): NewsDTO {
        return newsService.getNews()
    }
}
