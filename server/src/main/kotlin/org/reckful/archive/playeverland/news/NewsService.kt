package org.reckful.archive.playeverland.news

import org.springframework.stereotype.Service
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

@Service
class NewsService(
    val newsRepository: NewsRepository
) {
    fun getNews(): NewsDTO {
        val news = newsRepository.getAll()
        return NewsDTO(
            articles = mapArticles(news.articles)
        )
    }

    private fun mapArticles(articles: List<Article>): List<ArticleDTO> {
        return articles.map {
            ArticleDTO(
                id = it.id,
                title = it.title,
                published = toPublishedString(it.date),
                author = it.author,
                imageUrl = it.imageUrl,
                description = it.description,
                fullText = it.fullText
            )
        }
    }

    private fun toPublishedString(date: LocalDate): String {
        // TODO support today, yesterday, weeks, months, years
        val daysAgo = Duration.between(date.atStartOfDay(), LocalDateTime.now()).toDays()
        return "Published $daysAgo days ago"
    }
}

