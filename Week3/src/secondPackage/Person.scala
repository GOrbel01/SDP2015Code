package secondPackage

/**
 * Created by Squall on 20/01/2015.
 */
case class Person(firstName: String, lastName: String)

object Stormtrooper {
  def inspect(p : Person) : String =
  p match
  {
    case Person("Luke", "Skywalker") => s"Stop you rebel scum"
    case Person("Han", "Solo") => s"Stop Solo"
//    case Person(first) => s"Move along, $first"
  }
}
