package directorPackage

/**
 * Created by Squall on 13/01/2015.
 */
class Director(first : String, second : String, yob : Int) {
  val firstName : String = first
  val lastName : String = second
  val yearOfBirth : Int = yob
  def name : String = first + " " + second
  def copy(
          firstName : String = this.firstName,
          secondName : String = this.lastName,
          yearOfBirth : Int = this.yearOfBirth)
          = new Director(firstName, lastName, yearOfBirth)
}

object Director {
  def apply(name : String, lastName : String, yearOfBirth : Int) =
  new Director(name, lastName, yearOfBirth)

  def older(d1 : Director, d2 : Director): Director =
  {
    if (d1.yearOfBirth < d2.yearOfBirth) d1 else d2
  }
}
