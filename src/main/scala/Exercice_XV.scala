// SparkSQL
import org.apache.spark.sql.SparkSession

object Exercice_XV {
  def main(args: Array[String]): Unit ={
    val spark = SparkSession.builder()
      .appName("Exercice_XV")
      .master("local[*]")
      .getOrCreate()

    // 1. Charger le fichier Titanic.csv dans le répertoire
    val df = spark.read.option("delimiter", ",").option("header", "true").csv("D:/Mes_dossiers/IDSI/M1/Cours/Semestre 2/Hadoop_MapReduce/fichiers/data/Titanic.csv")


    // 4. Transformez le fichier en un rdd (dans une autre variable)
    val rdd = df.rdd

    // 5. Affichez le nombre d’éléments
    println(s"Le nombre d'éléments :"  + rdd.count())

    // 6. Afficher le premier élément
    println("Le premier élément :" + rdd.first())

    // 7. Afficher la 1ere valeur du résultat obtenu à la question 6)
    println(s"Première valeur: " +rdd.first()(0))

    // 8. Faites un sample de la donnée de 5%
    val sample = rdd.sample(withReplacement = false, 0.05)
    sample.take(5).foreach(println)

    // 9. Revenez à la première variable et tapez les commandes suivantes
    df.show()
    df.createOrReplaceTempView("titanic")
    spark.sql("select * from titanic").show()

    // 10. Qu’observez-vous ?
    /* On remarque un premier  tableau contenant les données de titanic, en l'occurence les 20 premières lignes.
    La vue contient les mêmes données que celles de df. */

    // 11. Avec les commandes SQL, faites une analyse succincte de la donnée Titanic.
    // Dans ExerciceXV.scala (après avoir chargé les données)

    // 11. Analyse succincte avec SQL
    spark.sql("""
    -- 1. Statistiques de base
    SELECT
    COUNT(*) AS total_passagers,
    AVG(Age) AS age_moyen,
    SUM(CASE WHEN Survived = '1' THEN 1 ELSE 0 END) AS survivants,
    ROUND(SUM(CASE WHEN Survived = '1' THEN 1 ELSE 0 END) / COUNT(*) * 100, 2) AS taux_survie_pourcentage
    FROM titanic
    """).show()

    spark.sql("""
    -- 2. Analyse par sexe
    SELECT
    Sex,
    COUNT(*) AS nombre_passagers,
    SUM(CASE WHEN Survived = '1' THEN 1 ELSE 0 END) AS survivants,
    ROUND(SUM(CASE WHEN Survived = '1' THEN 1 ELSE 0 END) / COUNT(*) * 100, 2) AS taux_survie_pourcentage
    FROM titanic
    GROUP BY Sex
    """).show()


    spark.stop()
  }
}