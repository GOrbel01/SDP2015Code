package george.scex2

/**
 * Created by Squall on 26/03/2015.
 */
class ImpCounter(val count : Int) {
  def inc: ImpCounter = inc()
  def dec: ImpCounter = dec()
  def inc(amount : Int = 1): ImpCounter = new ImpCounter(count + amount)
  def dec(amount : Int = 1): ImpCounter = new ImpCounter(count - amount)
}

object c2 extends App {
  val obj = new ImpCounter(10).inc(5).inc.dec.inc.inc.count
  println(obj)
}
