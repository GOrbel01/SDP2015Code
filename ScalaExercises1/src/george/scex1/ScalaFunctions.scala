package george.scex1

/**
 * Created by Squall on 19/01/2015.
 */
class ScalaFunctions {

  def getSquare(num : Int): Int =
  {
    num*num
  }

  def isArgOneGreaterThanArgTwo(d1 : Double, d2 : Double): Boolean =
  {
    d1.>(d2)
  }

  def manyTimesString(str : String, num : Int): String =
  {
    var count : Int = 0
    var newString : String = ""
    while (count < num)
    {
      newString = newString.concat(str)
      println(count)
      count = count.+(1)
    }
    newString
  }
}

object FunctionsObject {
  def main(args : Array[String]): Unit =
  {
    val obj = new ScalaFunctions
    val t1c = obj.isArgOneGreaterThanArgTwo(4.1, 5.12)
    val t2c = obj.isArgOneGreaterThanArgTwo(2.1, 1.2)
    println(t1c)
    println(t2c)
    val a = obj.getSquare(3)
    val b = obj.getSquare(2)
    val c = obj.getSquare(8)
    val m1 = obj.manyTimesString("abc", 4)
    val m2 = obj.manyTimesString("123", 3)
    assert(a == 9, true)
    assert(b == 4, true)
    assert(c == 64, true)
    println("t1c: " + t1c + " t2c: " + t2c)
    assert(t1c == false)
    assert(t2c == true)
    assert(m1.equals("abcabcabcabc"), true)
    assert(m2.equals("123123123"), true)

  }
}
