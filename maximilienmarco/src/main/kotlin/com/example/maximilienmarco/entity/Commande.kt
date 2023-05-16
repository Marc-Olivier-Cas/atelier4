package com.example.maximilienmarco.entity

import javax.persistence.*

@Entity
@Table(name = "commandes")
class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var libelle: String? = null

    // Getters et setters (ou utilisez les annotations @JvmField et @JvmName pour les propriétés)
}
