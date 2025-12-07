package com.woocurlee.redisranking.model.dto

import com.woocurlee.redisranking.model.entity.Feed
import java.time.LocalDateTime

data class FeedReq(
    val title: String,
    val content: String,
    val userId: String,
)

data class FeedRes(
    val feedNo: Long,
    val title: String,
    val content: String,
    val userId: String,
    val insDate: LocalDateTime,
    val updDate: LocalDateTime,
) {
    companion object {
        fun fromEntity(feed: Feed): FeedRes {
            return FeedRes(
                feedNo = feed.feedNo ?: 0L,
                title = feed.title,
                content = feed.content,
                userId = feed.userId,
                insDate = feed.insDate,
                updDate = feed.updDate
            )
        }
    }
}