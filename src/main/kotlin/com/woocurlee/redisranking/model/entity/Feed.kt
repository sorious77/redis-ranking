package com.woocurlee.redisranking.model.entity

import com.woocurlee.redisranking.model.dto.FeedReq
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "FEED")
class Feed(
    @Column(nullable = false, name = "TITLE")
    var title: String,
    @Column(nullable = false, name = "CONTENT")
    var content: String,
) : BaseEntity() {
    @Id
    @Column(nullable = false, name = "FEED_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var feedNo: Long? = null

    companion object {
        fun from(req: FeedReq): Feed {
            return Feed(title = req.title, content = req.content).apply {
                userId = req.userId
            }
        }
    }
}