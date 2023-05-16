# Gestion des commandes avec Spring Boot et Kotlin

Ce projet est une application Spring Boot en Kotlin qui permet de gérer des commandes. L'application génère automatiquement une table "commande" avec les colonnes nom, type et prix dans une base de données MySQL lors du démarrage.

## Configuration de la base de données

La base de données utilisée est MySQL. Assurez-vous d'avoir une instance de MySQL exécutée et configurez les informations de connexion dans le fichier `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/commandes?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=<votre_nom_utilisateur>
spring.datasource.password=<votre_mot_de_passe>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Remplacez <votre_nom_utilisateur> et <votre_mot_de_passe> par vos informations d'identification MySQL.

Structure du projet
Le projet est structuré comme suit :

com.example.maximilienmarco.entity: Ce package contient l'entité Commande qui représente une commande avec les propriétés nom, type et prix.
com.example.maximilienmarco.repository: Ce package contient l'interface CommandeRepository qui étend JpaRepository et permet d'effectuer des opérations CRUD sur les commandes.
com.example.maximilienmarco.controller: Ce package contient le contrôleur CommandeController qui gère les opérations liées aux commandes, telles que la création, la lecture, la mise à jour et la suppression.
com.example.maximilienmarco: Ce package contient la classe principale MaximilienmarcoApplication qui démarre l'application.
Endpoints du contrôleur
Le contrôleur CommandeController expose les endpoints suivants :

GET /commandes: Récupère toutes les commandes existantes.
POST /commandes: Crée une nouvelle commande.
GET /commandes/{id}: Récupère une commande par son ID.
PUT /commandes/{id}: Met à jour une commande existante.
DELETE /commandes/{id}: Supprime une commande par son ID.

Démarrage de l'application
Pour démarrer l'application, exécutez la classe principale MaximilienmarcoApplication. L'application sera accessible à l'URL http://localhost:8080.

Assurez-vous d'avoir une instance de MySQL exécutée et que les informations de connexion sont correctement configurées dans application.properties.
