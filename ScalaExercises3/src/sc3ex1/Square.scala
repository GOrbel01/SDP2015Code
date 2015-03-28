package sc3ex1

/**
 * Created by Squall on 28/03/2015.
 */
case class Square(size : Double, col : Colour) extends Rectangular {
    val colour = col
    override val width = size
    override val height = size
}
