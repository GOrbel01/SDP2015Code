package sc2ex7

/**
 * Created by Squall on 27/03/2015.
 */
class AnonVector {
  val v = Vector(1, 2, 3, 4)
  var str = ""
  v.foreach(n => str+=n + ",")
  println(str)
}

object testFuncAsObj extends App {
  val noUse = new AnonVector()

  val dog = (d : Int) => d * 7

  println(dog(4))
  val v = Vector(1, 5, 7, 8)
  var s = ""
  v.foreach((v) => s = s + dog(v) + " ")
  println(s)

  val square = (d : Int) => d * d
  s = ""
  val numbers = Vector(1, 2, 5, 3, 7)
  numbers.foreach((num) => s = s + square(num) + " ")
  println(s)
}
