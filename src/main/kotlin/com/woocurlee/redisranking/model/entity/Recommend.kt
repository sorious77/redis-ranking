package com.woocurlee.redisranking.model.entity

import com.woocurlee.redisranking.model.dto.RecommendReq
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "RECOMMEND")
class Recommend(
    @Column(nullable = false, name = "FEED_NO")
    var feedNo: Long,
) : BaseEntity() {
    @Id
    @Column(nullable = false, name = "RECOMMEND_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var recommendNo: Long? = null

    companion object {
        fun from(req: RecommendReq): Recommend {
            return Recommend(feedNo = req.feedNo).apply {
                userId = req.userId
            }
        }
    }
}