package com.woocurlee.redisranking.controller

import com.woocurlee.redisranking.model.dto.FeedReq
import com.woocurlee.redisranking.model.dto.FeedRes
import com.woocurlee.redisranking.service.FeedService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/feeds")
class FeedController(
    private val feedService: FeedService,
) {
    @PostMapping
    fun saveFeed(req: FeedReq): FeedRes {
        return feedService.saveFeed(req)
    }
}