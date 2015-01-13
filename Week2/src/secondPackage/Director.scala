package secondPackage

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
