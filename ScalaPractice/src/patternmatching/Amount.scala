package patternmatching

/**
 * Created by Cloud on 13/03/2015.
 */
abstract class Amount {
  case class Dollar(value: Double) extends Amount
  case class Currency(value: Double, unit: String) extends Amount

//  case object Nothing extends Amount
//   match {
//     case Dollar(v) => "$" + v
//     case Currency(_, u) => "Oh Noes, I got " + u
//     case Nothing => ""
//   }

  object test {
    val amt = Currency(29.95, "EUR")
    val price = amt.copy()

    val otherPrice = amt.copy(value=19.95)
  }

}