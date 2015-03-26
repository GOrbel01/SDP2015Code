package george.scex2

/**
 * Created by Squall on 26/03/2015.
 */
class Person(val firstName : String,val lastName : String) {
  def apply(first : String, second : String) = new Person(first, second)

}

object Person {
  def apply(fullName: String) = {
    val parts = fullName.split(" ")
    new Person(parts(0), parts(1))
  }
}

object testPers extends App {
  val pers = Person.apply("George Orbell") : Person
  println(pers.firstName)
  println(pers.lastName)
}