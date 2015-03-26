package highorderfunctions
import scala.math._
/**
 * Created by Squall on 21/03/2015.
 */
object asParam extends App {
  //Functions that Receive Functions, these are called High Order Functions
  def valueAtOneQuarter(f : (Double) => Double) = f(4.00)

  println(valueAtOneQuarter(ceil))
  println(valueAtOneQuarter(sqrt))

  def stringOnEnd(f: (String) => String) = f("ANK")
  def concString(str : String) : String = str

  println(stringOnEnd(concString))

  def mulBy(factor : Double) = (x : Double) => factor * x //Function that Returns a Function
  val m3 = mulBy(3)
  val m4 = mulBy(4)
  println(m3(4))
  println(m4(4))

  def addString(str : String) = (x : String) => x + " " + str
  val s1 = addString("All")
  val s2 = addString("None")
  println(s1("Try"))
  println(s2("Try"))

  valueAtOneQuarter((x : Double) => 3 * x) //Two Functions both use anonymous function as param and
  valueAtOneQuarter((x) => 3 * x)          //Are equivalent, only difference is inferred param type
  valueAtOneQuarter(x => 3 * x)            //Also Equivalent () can be omitted
  valueAtOneQuarter(3 * _)                 //With sing occurence of param on right side of =>, "_" can be used
}
