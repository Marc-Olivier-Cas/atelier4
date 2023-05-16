package com.example.maximilienmarco.entity

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Parameters
import java.util.concurrent.Callable

@Component
@Command(name = "app", mixinStandardHelpOptions = true, description = ["Description de l'application"])
class CommandeHandler : Callable<Int> {
    @Autowired
    private lateinit var commande: Commande

    @Command(name = "maCommande", mixinStandardHelpOptions = true, description = ["Description de ma commande"])
    fun maCommande(
        @Parameters(index = "0", description = ["Description de l'argument"])
        argument: String
    ) {
        commande.argument = argument
        CommandLine(commande).execute()
    }

    override fun call(): Int {
        // Logique par défaut si aucune commande n'est spécifiée
        println("Aucune commande spécifiée")
        return 0
    }
}
