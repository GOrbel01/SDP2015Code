package sc2ex5

/**
 * Created by Squall on 27/03/2015.
 */
case class Person(first : String, second : String, email : String)

object caseClassTest extends App {
  val p = new Person("Jane", "Do", "janedo@somewhere.org")
  println(p.first)
  println(p.second)
  println(p.email)

  val people = Vector(
    Person("Jane","Smile","jane@smile.com"),
    Person("Ron","House","ron@house.com"),
    Person("Sally","Dove","sally@dove.com"))
  println(people(0))
  println(people(1))
  println(people(2))
}
