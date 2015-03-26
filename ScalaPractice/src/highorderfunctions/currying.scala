package highorderfunctions

import scala.collection.GenSeq

/**
 * Created by Squall on 23/03/2015.
 */
object currying extends TestSeq {
  def mul(x: Int, y: Int) = x * y
  def mulOneAtATime(x: Int) = (y: Int) => x * y

  mulOneAtATime(6)(7)

  val a = Array("Hello", "World")
  val b = Array("hello", "world")

  a.correspondsOwn(b)(_.equalsIgnoreCase(_))
}
