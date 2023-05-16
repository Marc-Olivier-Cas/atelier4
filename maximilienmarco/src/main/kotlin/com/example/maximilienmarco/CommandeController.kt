package com.example.maximilienmarco.controller

import com.example.maximilienmarco.entity.Commande
import com.example.maximilienmarco.service.CommandeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/commandes")
class CommandeController(private val commandeService: CommandeService) {
    @PostMapping
    fun creerCommande(@RequestBody libelle: String): Commande {
        return commandeService.creerCommande(libelle)
    }
}
