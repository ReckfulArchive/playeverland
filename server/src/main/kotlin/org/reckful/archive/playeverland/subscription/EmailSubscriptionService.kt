package org.reckful.archive.playeverland.subscription

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val logger = LoggerFactory.getLogger(EmailSubscriptionService::class.java)

@Service
class EmailSubscriptionService {

    fun subscribe(email: String) {
        logger.info("New subscriber: $email")
    }
}
