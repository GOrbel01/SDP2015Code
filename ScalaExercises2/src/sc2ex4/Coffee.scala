package sc2ex4

/**
 * Created by Cloud on 27/03/2015.
 */
class Coffee(
               val shots: Int = 2,
               val decaf: Int = 0,
               val milk: Boolean = false,
               val toGo: Boolean = false,
               val syrup: String = "") {
    var result = ""
    println(shots, decaf, milk, toGo, syrup)
    def getCup(): Unit = {
      if (toGo)
        result += "ToGoCup "
      else
        result += "HereCup "
    }
    def pourShots(): Unit = {
      for (s <- 0 until shots) {
        result += "shot "
      }
      for (s <- 0 until decaf) {
        result += "decaf shot "
      }
    }
    def addMilk(): Unit = {
      if (milk)
        result += "milk "
    }
    def addSyrup(): Unit = {
      result += syrup
    }
    def caf = shots - decaf
    getCup()
    pourShots()
    addMilk()
    addSyrup()
}

object coffeeTest extends App {
  val doubleHalfCaf = new Coffee(shots=2, decaf=1)
  val tripleHalfCaf = new Coffee(shots=3, decaf=2)
  println(doubleHalfCaf.decaf)
  println(doubleHalfCaf.caf)
  println(doubleHalfCaf.shots)
  println(tripleHalfCaf.decaf)
  println(tripleHalfCaf.caf)
  println(tripleHalfCaf.shots)
}
