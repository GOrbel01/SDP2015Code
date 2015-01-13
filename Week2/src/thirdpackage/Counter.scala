package thirdpackage

/**
 * Created by Squall on 13/01/2015.
 */
class CounterTen(c : Int) {
  def inc = new CounterTen(c + 1)
  def dec = new CounterTen(c - 1)
  def count = c
  def adjust(adder : Adder) = new CounterTen(adder.add(count))
}

class Adder(amount: Int)
{
  def add(in : Int) = in + amount
}

object Test
{
  def main(args: Array[String]): Unit =
  {
    var cter = new CounterTen(5)
    println(cter.inc.dec.inc.inc.count)
  }
}
