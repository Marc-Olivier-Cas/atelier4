package com.example.maximilienmarco.controller

import com.example.maximilienmarco.entity.Commande
import com.example.maximilienmarco.repository.CommandeRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/commandes")
class CommandeController(private val commandeRepository: CommandeRepository) {

    @GetMapping
    fun getAllCommandes(): List<Commande> {
        return commandeRepository.findAll()
    }

    @PostMapping
    fun createCommande(@RequestBody commande: Commande): Commande {
        return commandeRepository.save(commande)
    }

    @GetMapping("/{id}")
    fun getCommandeById(@PathVariable id: Long): Commande {
        return commandeRepository.findById(id).orElseThrow { NoSuchElementException("Commande introuvable") }
    }

    @PutMapping("/{id}")
    fun updateCommande(@PathVariable id: Long, @RequestBody updatedCommande: Commande): Commande {
        val existingCommande = commandeRepository.findById(id).orElseThrow { NoSuchElementException("Commande introuvable") }
        existingCommande.nom = updatedCommande.nom
        existingCommande.type = updatedCommande.type
        existingCommande.prix = updatedCommande.prix
        return commandeRepository.save(existingCommande)
    }

    @DeleteMapping("/{id}")
    fun deleteCommande(@PathVariable id: Long) {
        if (commandeRepository.existsById(id)) {
            commandeRepository.deleteById(id)
        } else {
            throw NoSuchElementException("Commande introuvable")
        }
    }
}
