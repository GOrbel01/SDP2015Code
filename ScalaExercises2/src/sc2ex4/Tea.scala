package sc2ex4

/**
 * Created by Cloud on 27/03/2015.
 */
class Tea(val name : String = "Earl Grey", val decaf : Boolean = false, val milk : Boolean = false, val sugar : Boolean = false) {

  def describe : String = {
    var description = name
    if(decaf) description += " decaf"
    if(milk) description += " + milk"
    if(sugar) description += " + sugar"
    description
  }

  def calories : Int = {
    var cal = 0
    if (milk) cal += 100
    if (sugar) cal += 16
    cal
  }
}

object testTea extends App {
  val tea = new Tea
  println(tea.describe)
  println(tea.calories)
  val lemonZinger = new Tea(decaf=true, name="Lemon Zinger")
  println(lemonZinger.describe)
  println(lemonZinger.calories)
  val sweetGreen = new Tea(name="Jasmine Green", sugar=true)
  println(sweetGreen.describe)
  println(sweetGreen.calories)
  val teaLatte = new Tea(sugar=true, milk=true)
  println(teaLatte.describe)
  println(teaLatte.calories)
}
