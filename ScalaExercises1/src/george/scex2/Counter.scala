package george.scex2

/**
 * Created by Squall on 26/03/2015.
 */
class Counter(val count : Int) {
  def inc() = new Counter(count+1)
  def dec() = new Counter(count-1)
}

object c1 extends App {
  val con = new Counter(10).inc.dec.inc.inc.count
  println(con)
}
