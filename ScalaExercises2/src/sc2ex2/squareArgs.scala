package sc2ex2

/**
 * Created by Cloud on 26/03/2015.
 */
object squareArgs extends App {
  def squareThem(numbers : Int*) = {
    numbers.map((f) => f * f).reduceLeft(_ + _)
  }

  println(squareThem(2, 4))
  println(squareThem(2))
  println(squareThem(1, 2, 4))
}
