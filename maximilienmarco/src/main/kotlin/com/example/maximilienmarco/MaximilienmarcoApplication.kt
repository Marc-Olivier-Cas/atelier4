package com.example.maximilienmarco

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MaximilienmarcoApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<MaximilienmarcoApplication>(*args)
        }
    }
}
