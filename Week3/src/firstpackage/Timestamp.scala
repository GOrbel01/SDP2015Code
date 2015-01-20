package firstpackage

/**
 * Created by Squall on 20/01/2015.
 */
class Timestamp(val seconds : Long)

object Timestamp {
  def apply(hours : Int, minutes : Int, seconds : Int) =
  new Timestamp(hours*60*60 + minutes*60 + seconds)
}
