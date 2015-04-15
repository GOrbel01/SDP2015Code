package misctests

/**
 * Created by Squall on 09/04/2015.
 */
class TestSeq {
  val tSeq = Seq(5, 6, 7, 8, 9)
  def print(): Unit = {
    println(tSeq)
    println(tSeq.tail.tail.tail.tail.head)
  }
}

object tSeq extends App {
  val ts = new TestSeq()
  ts.print()
}
