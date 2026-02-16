 README GitHub – Unit Testing Project
 Java Unit Testing – Maven Project
 Description

Ce projet a pour objectif d’implémenter et tester plusieurs composants Java en utilisant :

JUnit 5

Maven

Test Driven Development (TDD)

Mock Objects

Injection de dépendances

Il couvre les notions fondamentales de tests unitaires et de qualité logicielle.

🔹  Exercice 1 – Testing MathUtils
 Objectif

Valider les méthodes mathématiques :

Add(int, int)

Subtract(int, int)

Compétences mobilisées

Tests paramétrés (@ParameterizedTest)

Assertions JUnit

Comparaison avec résultat natif Java

Structure Arrange / Act / Assert

Ce que ça montre

Vérification fonctionnelle automatisée

Tests déterministes

Couverture de cas positifs et négatifs
 
🔹  Exercice 2 – Structure Maven & Tests
 Objectif

Mettre en place :

Structure Maven standard

Organisation src/main / src/test

Lancement via mvn test

🔧 Compétences mobilisées

Build automation

Lifecycle Maven

Gestion des dépendances JUnit

 Ce que ça montre

Maîtrise de l’environnement Java professionnel

Compréhension CI/CD basique

🔹 Exercice 3 – Entity3D & Vector3D
 Objectif

Tester une classe représentant une entité 3D et un vecteur mathématique.

Méthodes testées :

Constructeurs

Scale()

Add()

equals()

hashCode()

EpsilonEquals()

Produit scalaire

Produit vectoriel

Norme (Length())

 Bug détecté

La méthode Length() était incorrecte.

Formule erronée :

x² + y*x + z*x


Correction appliquée :

x² + y² + z²

 Ce que ça montre

Détection de bug via test

Validation mathématique

Importance du TDD

🔹 Exercice 4 – Sieve (Crible d’Eratosthène)
 Objectif

Implémenter une fonction retournant tous les nombres premiers jusqu’à N.

Compétences mobilisées

Structures de données (List)

Algorithmique

Tests paramétrés

assertIterableEquals

 Ce que ça montre

Capacité à corriger une implémentation défaillante

Validation algorithmique

Robustesse des tests

🔹 Exercice 5 – Mock Object & Injection de dépendance
 Objectif

Tester DigitalPhotographer sans utiliser un vrai appareil photo.

Solution :

Création d’une interface IDigitalCamera

Création d’un DigitalCameraMock

Injection dans DigitalPhotographer

Test validé :

Flash activé

Photo prise

Flash désactivé

Image non nulle

🧠 Ce que ça montre

Découplage

Tests isolés

Simulation de dépendances externes

Conception orientée interface

🏆 Compétences démontrées

Java avancé

JUnit 5

Maven

TDD

Mocking

Debug compilation Maven

Gestion d’erreurs

Refactoring

Algorithmique

Injection de dépendance
