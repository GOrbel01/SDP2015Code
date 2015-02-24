/**
 * Created by Squall on 03/02/2015.
 */
case class Square(size : Double) extends Rectangular {
  val perimeter: Double = {
    size.*(sides)
  }
  val area: Double = {
    size.*(size)
  }
}
case class Rectangle(length : Double, width : Double) extends Rectangular {
  val perimeter: Double = {
    length.+(width).+(length.+(width))
  }
  val area : Double = {
    length.*(width)
  }
}
case class Circle(radius : Double) extends Shape {
  val sides : Int = {
    1
  }
  val perimeter : Double = {
    2.*(math.Pi.*(radius))
  }
  val area : Double = {
    math.Pi.*(radius.*(radius))
  }
}
object aShape {
  def main(args: Array[String]): Unit =
  {
    val cir = new Circle(2)
    val sqa = new Square(4)
    val rec = new Rectangle(4, 3)
    println(cir.perimeter)
    println(sqa.perimeter)
    println(rec.area)
  }
}