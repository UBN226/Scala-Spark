# Projet Scala/Spark - Chargement et Analyse de données

Ce dépôt contient les solutions aux exercices du module 3 sur l'écosystème Hadoop, implémentées en Scala avec IntelliJ IDEA et Spark.

## Contenu des exercices

### Exercices Scala de base
- **Exercice XI** : Analyse de chaîne avec conversion de type
- **Exercice XII** : Manipulation de listes et ennsembles

### Exercices Spark
- **Exercice XV** : Analyse de données avec Spark SQL (fichier Titanic)

## Configuration requise

- **IntelliJ IDEA** (version Community ou Ultimate)
- **Scala SDK** (version 2.13.x recommandée)
- **Spark** (version 3.3.x) - Pour l'exercice XV
- **Java JDK** (version 17)

## Installation

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/teaching-formation/fichiers.git

## Structure du projet

fichiers [SparkProject]/
├── .bsp/                  
├── .idea/                  
├── artifacts/              
│
├── data/                    
│   ├── loup.txt            
│   └── Titanic.csv          
│
├── project/                 
│   └── build.properties    
│
├── src/                     
│   ├── main/
│   │   └── scala/          
│   │       ├── Exercice_XI.scala    
│   │       ├── Exercice_XII.scala   
│   │       ├── Exercice_XV.scala    
│   │       └── Main.scala          
│   │
│   └── test/                
│
├── target/         
│
├── build.sbt               
└── README.md                

