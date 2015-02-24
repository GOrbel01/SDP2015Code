package functional

/**
 * Created by Squall on 24/02/2015.
 */
object Towns extends App {

  val townsAndCounties = Map (
    "Essex" -> "Chelmsford",
    "Yorkshire" -> "Leeds",
    "Lancashire" -> "Manchester",
    "Devon" -> "Exeter"
  )

  println("Towns In Counties:")
  println("Essex " + townsAndCounties.get("Essex"))
  println("Yorkshire " + townsAndCounties.get("Yorkshire"))
  println("Kent: " + townsAndCounties.get("Kent").getOrElse("Oops"))

}
