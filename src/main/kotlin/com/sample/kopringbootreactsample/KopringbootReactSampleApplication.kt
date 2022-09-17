package com.sample.kopringbootreactsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class KopringbootReactSampleApplication

fun main(args: Array<String>) {
    runApplication<KopringbootReactSampleApplication>(*args)
}
