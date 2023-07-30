package org.reckful.archive.playeverland.model

import java.time.LocalDate

data class Article(
    val id: String,
    val title: String,
    val date: LocalDate,
    val author: String,
    val imageUrl: String,
    val description: String,
    val fullText: String,
)
