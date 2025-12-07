package com.woocurlee.redisranking.model.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {
    @Column(nullable = false, name = "USER_ID")
    var userId: String = ""

    @CreatedDate
    @Column(nullable = false, name = "CREATED_DATE")
    lateinit var insDate: LocalDateTime

    @LastModifiedDate
    @Column(nullable = false, name = "LAST_MODIFIED_DATE")
    lateinit var updDate: LocalDateTime
}