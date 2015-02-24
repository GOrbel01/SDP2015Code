package functional

/**
 * Created by Squall on 24/02/2015.
 */
object Curry extends App {

  def cat1(s1: String, s2: String) = {
    s1 + s2
  }

  def cat2(s1: String)(s2: String) = {
    s1 + s2
  }

  def cat3(s1: String) = (s2: String) => s1 + s2

  val cat1Curried = (cat1 _).curried

  println(cat1("Hello ", "dodge"))
  println(cat2("Hello ")("dodge"))
  println(cat3("Hello ")("dodge"))
  val l = cat3("Hello ")

  println(l("Betty"))
  println(l("Rita"))

  //println(cat1("XXX")("YYY"))
  println(cat1Curried("XXX ")("YYY"))

}
