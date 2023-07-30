package org.reckful.archive.playeverland.repository

import org.reckful.archive.playeverland.model.News

interface NewsRepository {
    fun getAll(): News
}
