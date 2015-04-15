package misctests

/**
 * Created by Squall on 09/04/2015.
 */
class TestTuples {
  def testTup(): Unit = {
    val tup1 = Tuple1("Hi", 1, "Omg")
    val tup2 = Tuple2("Hi", 2)
    val tup3 = Tuple3("Hi", 2, "Gone")
    val tup4 = Tuple4("Hi", 4, "Good", 5)
    println(tup1)
    println(tup1._1._1)
    println(tup2._1)
    println(tup3._3)
    println(tup4._4)
  }
}

object testobj extends App {
  val tt = new TestTuples()
  tt.testTup()
  tt
}