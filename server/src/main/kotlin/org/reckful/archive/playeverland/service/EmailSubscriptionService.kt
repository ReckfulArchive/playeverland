package org.reckful.archive.playeverland.service

import org.reckful.archive.playeverland.repository.EmailSubscriptionRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val logger = LoggerFactory.getLogger(EmailSubscriptionService::class.java)

@Service
class EmailSubscriptionService(
    private val emailSubscriptionRepository: EmailSubscriptionRepository
) {
    fun subscribe(email: String) {
        if (!isValidEmail(email)) {
            logger.info("Rejecting an invalid email $email")
        } else {
            emailSubscriptionRepository.subscribe(email)
        }
    }

    private fun isValidEmail(input: String): Boolean {
        return input.contains("@")
    }
}
