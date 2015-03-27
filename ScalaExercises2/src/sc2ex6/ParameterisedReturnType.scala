package sc2ex6

/**
 * Created by Squall on 27/03/2015.
 */
class ParameterisedReturnType {
  // Return type is inferred:
  def inferred(c1:Char, c2:Char, c3:Char)={
    Vector(c1, c2, c3)
  }

  // Explicit return type:
  def explicit(c1:Char, c2:Char, c3:Char):
  Vector[Char] = {
    Vector(c1, c2, c3)
  }

  def explicit(d1:Double, d2:Double, d3:Double):
  Vector[Double] = {
    Vector(d1, d2, d3)
  }

  def explicitList(vector : Vector[Double]) = {
    List(vector)
  }

  def explicitSet(vector: Vector[Double]) = {
    Set(vector)
  }
}

object paramTypes extends App {
  val pr = new ParameterisedReturnType()
  println(pr.explicit(1.0, 2.0, 3.0))
  println(pr.explicitList(Vector(10.0, 20.0)))
  println(pr.explicitList(Vector(1, 2, 3)))
  println(pr.explicitSet(Vector(10.0, 20.0)))
  println(pr.explicitSet(Vector(1, 2, 3)))
}
