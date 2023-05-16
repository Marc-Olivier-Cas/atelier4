package com.example.maximilienmarco.service

import com.example.maximilienmarco.entity.Commande
import com.example.maximilienmarco.repository.CommandeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CommandeService(private val commandeRepository: CommandeRepository) {
    @Transactional
    fun creerCommande(libelle: String): Commande {
        val commande = Commande()
        commande.libelle = libelle
        return commandeRepository.save(commande)
    }
}
