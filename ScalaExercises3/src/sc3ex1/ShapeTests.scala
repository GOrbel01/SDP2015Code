package sc3ex1

/**
 * Created by Squall on 28/03/2015.
 */
object ShapeTests extends App {
//  val circle = new Circle(3)
//  val square = new Square(3)
//  val rectangle = new Rectangle(3, 4)
//
//  println(circle.area)
//  println(square.area)
//  println(rectangle.area)
//
//  println(circle.perimeter)
//  println(square.perimeter)
//  println(rectangle.perimeter)

  println(Draw(new Circle(10, Blue)))
  println(Draw(new Rectangle(3, 4, Red)))
  println(Draw(new Rectangle(3, 4, new Colour(20, 20, 20))))
  println(Draw(new Rectangle(4, 5, new Colour(150, 180, 200))))
}
