object Exercice_XI {
  def main(args: Array[String]): Unit={
    val chaine = "Vanilla Donut 10 2.25"
    val parts = chaine.split(" ")
    val donut = parts.take(2).mkString(" ")
    val quantite = parts(2).toInt
    val prixUnit = parts(3).toDouble

    println(s"Type : $donut")
    println(s"Quantité : $quantite")
    println(s"Prix unitaire : $prixUnit")
  }
}
