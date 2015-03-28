package sc3ex1

/**
 * Created by Squall on 28/03/2015.
 */
sealed trait Shape {
  def sides : Int
  def perimeter : Double
  def area : Double
  def colour : Colour
}

trait Rectangular extends Shape {
  def width: Double
  def height: Double
  override val perimeter = 2 * width + 2 * height
  override val area = width * height
  override val sides = 4
}

trait Circular extends Shape {
  def radius : Double
}

object Draw {
  def apply(s : Shape) : Unit = {
    s match {
      case Rectangle(width, height, colour) => println(s"S is a Rectangle with Width $width and height of $height " + findColourInfo(colour))
      case Circle(radius, colour) => println(s"S is a Circle with Radius $radius " + findColourInfo(colour))
      case Square(size, colour) => println(s"S is a Square with a Size of $size " + findColourInfo(colour))
      case _ => println("S is Unknown Type")
    }
  }

  def findColourInfo(col : Colour) : String = {
    var str : String = "Colour: "
    col match {
      case Red => str+="Red"
      case Green => str+="Green"
      case Blue => str+="Blue"
      case _ => if (col.brightness < 50) str+="Dark" else if (col.brightness > 170) str+="Light"
    }
    str
  }
}