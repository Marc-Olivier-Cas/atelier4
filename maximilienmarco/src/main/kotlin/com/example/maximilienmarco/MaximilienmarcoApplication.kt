package com.example.maximilienmarco

import com.example.maximilienmarco.entity.CommandeHandler
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import picocli.CommandLine

@SpringBootApplication
class MaximilienmarcoApplication(private val commandeHandler: CommandeHandler) : CommandLineRunner {
    override fun run(vararg args: String?) {
        CommandLine(commandeHandler).execute(*args)
    }
}

fun main(args: Array<String>) {
    runApplication<MaximilienmarcoApplication>(*args)
}
