package sc3ex1

/**
 * Created by Squall on 28/03/2015.
 */
sealed trait Colours {
  def redVal : Int
  def greenVal : Int
  def blueVal : Int
  def brightness : Int
}

case class Colour(red : Int, green : Int, blue : Int) extends Colours {
  val redVal = red
  val greenVal = green
  val blueVal = blue
  val brightness = (red + blue + green) / 3
}

object Red extends Colour(255, 0, 0)
object Green extends Colour(0, 0, 255)
object Blue extends Colour(0, 255, 0)

