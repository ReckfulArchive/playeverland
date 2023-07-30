package org.reckful.archive.playeverland.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class JdbcEmailSubscriptionRepository(
    private val jdbcTemplate: JdbcTemplate
) : EmailSubscriptionRepository {
    override fun subscribe(email: String) {
        jdbcTemplate.update(
            "INSERT INTO email_subscription(email) VALUES (?)",
            email
        )
    }
}
