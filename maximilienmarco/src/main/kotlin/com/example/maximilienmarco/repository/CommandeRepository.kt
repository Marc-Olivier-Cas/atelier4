package com.example.maximilienmarco.repository

import com.example.maximilienmarco.entity.Commande
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommandeRepository : JpaRepository<Commande, Long>
