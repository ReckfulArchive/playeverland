package org.reckful.archive.playeverland.news

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "News")
class NewsDTO(
    val articles: List<ArticleDTO>
)
