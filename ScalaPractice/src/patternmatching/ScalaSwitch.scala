package patternmatching

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Squall on 13/03/2015.
 */
class ScalaSwitch {

}

object anObj {
  var sign = 0
  val ch: Char = '-'

  ch match {
    case '+' => sign = 1
    case '-' => sign = -1
    case _ => sign = 0
  }

  val pizzas = ArrayBuffer[String]("Pepperoni", "Pepper", "Jalapeno")
  val test = List[String]("Oh", "Dear")
  val badPizzas = ArrayBuffer[String]("Chicken", "Mushroom", "Egg")
  val scorePiz1 = pizzaScorer(pizzas)
  val scorePiz2 = pizzaScorer(badPizzas)

  def pizzaScorer(pizza: ArrayBuffer[String]): Int = {
    pizza match {
      case ArrayBuffer("Pepperoni", "Pepper", "Jalapeno") => 10
      case ArrayBuffer("Mushroom", "Chicken", "Egg") => 3
      case _ => 0
    }
  }

  def main(args: Array[String]) {
    println(sign)
    println(scorePiz1)
    println(scorePiz2)
  }

}
