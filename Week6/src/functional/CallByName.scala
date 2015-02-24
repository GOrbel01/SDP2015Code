package functional

/**
 * Created by Squall on 24/02/2015.
 */
object CallByName extends App {

  def continue(conditional: => Boolean)(body: => Unit) {
    if (conditional) {
      body
      continue(conditional)(body)
    }
  }

  var count = 0;
  continue(count < 5) {
    println(s"value of count is $count")
    count += 1
  }
}
