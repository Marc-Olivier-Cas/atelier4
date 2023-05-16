# Bloc de Commandes - API

Ce projet implémente un bloc de commandes pour une API utilisant Spring et Kotlin. Le bloc de commandes permet d'exécuter des commandes spécifiques à partir de la ligne de commande, fournissant ainsi une interface en ligne de commande pour interagir avec l'API.

## Fonctionnalités

- Prise en charge de la commande "maCommande" avec des options et des arguments personnalisables.
- Utilisation de la bibliothèque picocli pour la gestion des commandes et des arguments de ligne de commande.
- Intégration avec Spring Boot pour une configuration et une exécution faciles.

## Exécution de l'API

1. Assurez-vous que Java est installé sur votre système.
2. Clonez le dépôt et accédez au répertoire du projet.
3. Exécutez la commande suivante pour générer le fichier JAR exécutable :

./gradlew build

4. Une fois la construction terminée, exécutez l'API avec la commande :

java -jar build/libs/nom-du-fichier.jar


## Utilisation des commandes

### maCommande

La commande "maCommande" permet d'exécuter une opération spécifique. Voici comment l'utiliser :

java -jar build/libs/nom-du-fichier.jar maCommande --option=monOption argument


- `--option` : Spécifie une option personnalisée.
- `argument` : Spécifie un argument requis.

La commande "maCommande" effectuera une opération en utilisant les options et l'argument spécifiés.

## Intégration avec d'autres blocs de l'API

Ce bloc de commandes peut être intégré avec d'autres blocs de l'API en utilisant les points d'entrée appropriés. Assurez-vous de consulter la documentation spécifique à chaque bloc pour connaître les points d'entrée disponibles et les exemples d'intégration.

## Documentation supplémentaire

Pour plus de détails sur les fonctionnalités et la configuration de l'API, veuillez consulter la documentation complète disponible dans le dossier "docs" du projet.

## Développeurs

Ce projet a été développé par [Marc-Olivier CAS](https://github.com/Marc-Olivier-Cas/atelier4) et [Maximilen DELIBES-HOUDAYER](https://github.com/Marc-Olivier-Cas/atelier4).

## Contributions

Les contributions à ce projet sont les bienvenues. Si vous souhaitez contribuer, veuillez suivre les étapes suivantes :

1. Fork du projet.
2. Créez une nouvelle branche avec une fonctionnalité ou une correction de bug.
3. Effectuez les modifications nécessaires et testez-les.
4. Soumettez une pull request détaillant les modifications apportées.

## Licence

Ce projet est sous licence [Nom de la licence]. Veuillez consulter le fichier LICENSE pour plus d'informations.


