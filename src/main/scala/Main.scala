import org.apache.spark.sql.SparkSession

object Main extends App {
  val spark = SparkSession.builder()
    .appName("TestSpark")
    .master("local[*]")
    .getOrCreate()

  val data = Seq(("Scala", 1), ("Spark", 2))
  import spark.implicits._
  val df = data.toDF("Langage", "Niveau")
  df.show()

  spark.stop()
}
