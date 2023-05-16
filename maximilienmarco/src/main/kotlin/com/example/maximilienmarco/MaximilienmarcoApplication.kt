package com.example.maximilienmarco

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories("com.example.maximilienmarco.repository")
class MaximilienmarcoApplication

fun main(args: Array<String>) {
    runApplication<MaximilienmarcoApplication>(*args)
}
