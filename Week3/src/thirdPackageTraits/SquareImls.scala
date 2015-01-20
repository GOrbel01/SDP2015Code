package thirdPackageTraits

/**
 * Created by Squall on 20/01/2015.
 */
case class Square(size : Double) extends Shape {
    val sides = 4
    val perimeter = size * 4
    val area = size * size
}

case class Circle(radius: Double) extends Shape {
    val sides = 1
    val perimeter = math.Pi * radius
    val area = math.Pi * (radius * radius)
}

case class Rectangle(width: Double, height: Double) extends Shape
{
    val sides = 4
    val perimeter = (width*2) + (height*2)
    val area = width * height

}
