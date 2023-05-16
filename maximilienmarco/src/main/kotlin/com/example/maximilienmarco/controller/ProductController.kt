/*package com.example.maximilienmarco.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductController {

    @GetMapping
    fun getProducts(): ResponseEntity<List<Product>> {
        val products = // Appel à un autre repository ou à une API externe pour récupérer la liste des produits
            return ResponseEntity.ok(products)
    }

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): ResponseEntity<Product> {
        val product = // Appel à un autre repository ou à une API externe pour récupérer le produit par son ID
            return if (product != null) {
                ResponseEntity.ok(product)
            } else {
                ResponseEntity.notFound().build()
            }
    }

    // Ajoutez d'autres endpoints pour gérer les opérations liées aux produits
}*/
