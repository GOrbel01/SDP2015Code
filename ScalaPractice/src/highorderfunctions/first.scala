package highorderfunctions

/**
 * Created by Squall on 21/03/2015.
 */
object first extends App {

  def pi : Double = {
    val num = 3.14
    val fun = math.ceil(num)
    fun
  }

  def meth(dub : Double) : Double = {
    val triple = (x : Double) => 3 * x
    triple(dub)
  }

  def tripleArray() : Array[Double] = {
    val arr = Array(3.14, 1.42, 2.0).map{(x: Double) => 3 * x}
    arr
  }

  println(pi)
  println(meth(3.0))
  tripleArray().foreach(x => println(x)) //Same as Below for loop
//  for (elem <- tripleArray()) {
//    println(elem)
//  }
}
