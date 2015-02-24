package functional

/**
 * Created by Squall on 24/02/2015.
 */
object Lazy extends App {
  lazy val resource: Int = meth()

  def meth() : Int = {
    //Do Something Expensive
    println("Doing something Expensive")
    0
  }
}
