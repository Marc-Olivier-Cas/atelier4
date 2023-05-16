# Documentation de l'API

Bienvenue dans la documentation de l'API de notre projet.

## Endpoints

### Endpoint 1

Description de l'endpoint 1.

- **URL** : `/api/endpoint1`
- **Méthode** : GET
- **Paramètres de requête** :
    - `param1` (obligatoire) : Description du paramètre 1.
    - `param2` (optionnel) : Description du paramètre 2.

Exemple d'appel d'API :

GET /api/endpoint1?param1=valeur1&param2=valeur2


Réponse attendue :

{
"message": "Exemple de réponse"
}


### Endpoint 2

Description de l'endpoint 2.

- **URL** : `/api/endpoint2`
- **Méthode** : POST
- **Corps de la requête** :
  ```json
  {
    "property1": "valeur1",
    "property2": "valeur2"
  }


POST /api/endpoint2
{
"property1": "valeur1",
"property2": "valeur2"
}


Réponse attendue :

{
"message": "Exemple de réponse"
}
