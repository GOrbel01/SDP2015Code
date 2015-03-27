package george.scex2.caseclassfilmdir

/**
 * Created by Squall on 26/03/2015.
 */
class CCDirector(val firstName : String, val lastName : String, val yearOfBirth : Int) {
  def name = firstName + " " + lastName
}

object CCDirector {
  def apply(firstName : String, lastName : String, yearOfBirth : Int): CCDirector = {
    new CCDirector(firstName, lastName, yearOfBirth)
  }

  def older(d1 : CCDirector, d2 : CCDirector): CCDirector = {
    if (d1.yearOfBirth < d2.yearOfBirth) {
      d1
    }
    else
    {
      d2
    }
  }
}
