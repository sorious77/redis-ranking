package com.woocurlee.redisranking.service

import com.woocurlee.redisranking.model.dto.FeedReq
import com.woocurlee.redisranking.model.dto.FeedRes
import com.woocurlee.redisranking.model.entity.Feed
import com.woocurlee.redisranking.repository.FeedRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class FeedService(
    private val feedRepository: FeedRepository,
) {
    @Transactional
    fun saveFeed(req: FeedReq): FeedRes {
        val feed = feedRepository.save(Feed.from(req))

        return FeedRes.fromEntity(feed)
    }
}