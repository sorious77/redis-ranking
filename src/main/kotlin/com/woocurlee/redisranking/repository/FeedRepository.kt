package com.woocurlee.redisranking.repository

import com.woocurlee.redisranking.model.entity.Feed
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FeedRepository : JpaRepository<Feed, Long>