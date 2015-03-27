package sc2ex3

/**
 * Created by Cloud on 26/03/2015.
 */
class Item(val name : String, val price : Double) {
  def cost(grocery : Boolean = false, medication : Boolean = false, taxRates : Double = 0.10) = {
    var cost : Double = price
    if (!grocery && !medication) {
      cost += price*taxRates
      cost
    }
    else
    {
      cost
    }
  }
}

object testItem extends App {
  val flour = new Item(name="flour", 4)
  println(flour.cost(grocery=true))
  val sunscreen = new Item(
  name="sunscreen", 3)
  println(sunscreen.cost())
  val tv = new Item(name="television", 500)
  println(tv.cost(taxRates = 0.06))
}

