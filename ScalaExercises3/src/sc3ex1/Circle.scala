package sc3ex1

/**
 * Created by Squall on 28/03/2015.
 */
case class Circle(rad : Double, col : Colour) extends Circular {
  val colour = col
  val radius = this.rad

  override val area = math.Pi * (radius*radius)

  override val perimeter = math.Pi * (radius + radius)

  override val sides = 0
}
