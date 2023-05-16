package com.example.maximilienmarco.entity

import org.springframework.stereotype.Component
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import java.util.concurrent.Callable

@Component
@Command(name = "maCommande", mixinStandardHelpOptions = true, description = ["Description de ma commande"])
class Commande : Callable<Int> {
    @Option(names = ["-o", "--option"], description = ["Description de l'option"])
    var option: String? = null

    @CommandLine.Parameters(index = "0", description = ["Description de l'argument"])
    var argument: String? = null

    override fun call(): Int {
        // Logique d'exécution de la commande
        println("Commande exécutée avec option : $option, argument : $argument")
        return 0
    }
}
