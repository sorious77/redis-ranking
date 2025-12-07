package com.woocurlee.redisranking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisRankingApplication

fun main(args: Array<String>) {
	runApplication<RedisRankingApplication>(*args)
}
