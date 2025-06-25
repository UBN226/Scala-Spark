# Projet Scala/Spark - Chargement et Analyse de données

Ce dépôt contient les solutions aux exercices du module 3 sur l'écosystème Hadoop, implémentées en Scala avec IntelliJ IDEA et Spark.

## Contenu des exercices

### Exercices Scala de base
- **Exercice XI** : Analyse de chaîne avec conversion de type
- **Exercice XII** : Manipulation de listes et ennsembles

### Exercices Spark
- **Exercice XV** : Analyse de données avec Spark SQL (fichier Titanic)

## ⚙️ Configuration requise

- **IntelliJ IDEA** (version Community ou Ultimate)
- **Scala SDK** (version 2.13.x recommandée)
- **Spark** (version 3.3.x) - Pour l'exercice XV
- **Java JDK** (version 17)

## 🛠 Installation

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/teaching-formation/fichiers.git

## Structure du projet

fichiers [SparkProject]/
├── .bsp/                    # Fichiers de configuration pour BSP (Build Server Protocol)
├── .idea/                   # Configuration spécifique à IntelliJ IDEA
├── artifacts/               # Fichiers générés par IntelliJ (ex: packages)
│
├── data/                    # Dossier contenant les fichiers de données
│   ├── loup.txt             # Fichier texte pour l'exercice XIV
│   └── Titanic.csv          # Fichier CSV pour l'exercice XV
│
├── project/                 # Configuration SBT (méta-build)
│   └── build.properties     # Version de SBT utilisée
│
├── src/                     # Code source principal
│   ├── main/
│   │   └── scala/           # Code Scala
│   │       ├── Exercice_XI.scala    # Solution exercice XI
│   │       ├── Exercice_XII.scala   # Solution exercice XII
│   │       ├── Exercice_XV.scala    # Solution exercice XV (Spark SQL)
│   │       └── Main.scala          # Point d'entrée principal
│   │
│   └── test/                # Code de test (à créer si besoin)
│
├── target/                  # Fichiers compilés générés automatiquement
│
├── build.sbt                # Configuration principale du projet (dépendances, etc.)
└── README.md                # Documentation du projet

