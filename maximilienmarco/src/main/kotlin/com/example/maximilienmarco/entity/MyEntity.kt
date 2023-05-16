package com.example.maximilienmarco.entity

import org.springframework.stereotype.Component
import javax.persistence.*

@Component // Ajoutez cette annotation
@Entity
@Table(name = "my_entity")
class MyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "name")
    var name: String? = null

    // Autres propriétés de l'entité...
}
