package sdpmock.q4

/**
 * Created by Squall on 28/04/2015.
 */
object OwnListTest extends App {
  val ml = List(1, 4, 6)
  val m2 = List(2, 3, 5, 8)
  def listT(): Unit = {
    (ml, m2) match {
      case (x :: xs, y :: ys) => println("TESTED")
    }
  }

  def listB(): Unit = {
    ml match {
      case x :: xs => println(x); println(xs); println("APPROVED")
    }
  }
  listB()
  listT()
}
