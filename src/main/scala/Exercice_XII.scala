object Exercice_XII {
  def main(args: Array[String]): Unit = {
    // Partie 1
    val panier1 = Seq("Gâteau", "Lait", "Fromage", "Papier toilette")
    val panier2 = Seq("Pain", "Eau", "Jus de fruit", "Lait", "Fromage")
    val commun = panier1.intersect(panier2)
    println(s"Articles communs : $commun")
    println(s"Articles communs : "+commun.mkString(", "))

    // Partie 2
    val list1 = List( "crayon", "stylo", "taille-crayon")
    val list2 = List( "livre de mathématiques", "livre français", "livre anglais")
    val fusion = List(list1, list2)

    val list_finale = fusion.flatten.map{
      // flatten pour mettre les elements des deux listes dans une seule liste
      case e if e.contains("livre") => s"le $e est nécessaire en classe."
      case e => s"un $e est nécessaire en classe."
    }

    list_finale.foreach(println)
  }
}