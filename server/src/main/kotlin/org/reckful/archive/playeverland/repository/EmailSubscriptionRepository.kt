package org.reckful.archive.playeverland.repository

interface EmailSubscriptionRepository {
    fun subscribe(email: String)
}
