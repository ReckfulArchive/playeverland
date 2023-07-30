package org.reckful.archive.playeverland.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "Article", description = "A news article")
class ArticleDTO(

    @Schema(description = "Display id of the article, safe to use in the URL", example = "an-everland-birthday")
    val id: String,

    @Schema(description = "Title of the article", example = "An Everland Birthday")
    val title: String,

    @Schema(description = "String representing the publishing date", example = "2 weeks ago")
    val published: String,

    @Schema(description = "Article author", example = "RazorOS")
    val author: String,

    @Schema(description = "Article image")
    val imageUrl: String,

    @Schema(description = "Short description to be used as preview", example = "Short description")
    val description: String,

    @Schema(
        description = "Full article text, including the description",
        example = "Short description. Long description."
    )
    val fullText: String,
)
