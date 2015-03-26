package highorderfunctions

/**
 * Created by Squall on 23/03/2015.
 */
object closures extends App {
  def mulBy(factor : Double) = (x : Double) => factor * x //Function that Returns a Function
  val triple = mulBy(3)
  val half = mulBy(0.5)

  println(triple(14) + " " + half(14))
}
