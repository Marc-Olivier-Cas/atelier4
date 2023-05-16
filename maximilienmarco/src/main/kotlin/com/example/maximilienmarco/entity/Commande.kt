package com.example.maximilienmarco.entity

import javax.persistence.*

@Entity
@Table(name = "commande")
data class Commande(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var nom: String,

    @Column(nullable = false)
    var type: String,

    @Column(nullable = false)
    var prix: Double
)
