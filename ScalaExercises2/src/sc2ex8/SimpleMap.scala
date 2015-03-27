package sc2ex8

import scala.collection.immutable.VectorBuilder

/**
 * Created by Squall on 27/03/2015.
 */
object SimpleMap extends App {
  val v = Vector(1, 2, 3, 4)
  val vm = v.map(n => n * 11 + 10)
  println(vm)
  val vbr = new VectorBuilder[Double]
  for (i <- v) {
    vbr += (i * 11) + 10
  }
  val vec : Vector[Double] = vbr.result()
  println(vec)
}

object reduce extends App {
  val v = Vector(1, 10, 100, 1000)
  println(v.reduce((sum, n) => sum + n))
  var num = 0
  println("For Loop Version")
  for(i <- v) {
      num += i
  }
  println(num)

  def sumIt(numbers : Int*) = {
    numbers.reduce((n, b) => n + b)
  }
  println(sumIt(1, 2, 3))
  println(sumIt(45, 45, 45, 60))
}
