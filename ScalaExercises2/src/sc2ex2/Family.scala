package sc2ex2

/**
 * Created by Cloud on 26/03/2015.
 */
class Family(father : String, mother : String, child : String*) {

  override def toString : String = {
    var fam: String = mother + " " + father
    child.foreach((nam) => fam += " " + nam)
    fam
  }

  def familySize() = 2 + child.size
}

object testFamily extends App {
  val family1 = new Family("Dad", "Mum", "Sally", "Dick")
  val family2 = new Family("Dad", "Mum", "Harry")

  println(family1)
  println(family1.familySize())
  println(family2)
  println(family2.familySize())
}