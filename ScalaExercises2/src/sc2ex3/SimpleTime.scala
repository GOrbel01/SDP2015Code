package sc2ex3

/**
 * Created by Cloud on 26/03/2015.
 */
class SimpleTime(val hours : Int, val minutes : Int = 0) {

}

object testST extends App {
  val t = new SimpleTime(hours=5, minutes=30)
  println(t.hours)
  println(t.minutes)

  val d = new SimpleTime(hours=10)
  println(d.hours)
  println(d.minutes)
}