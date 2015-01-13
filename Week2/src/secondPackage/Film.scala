package secondPackage

/**
 * Created by Squall on 13/01/2015.
 */
class Film(
  val filmName : String,
  val yearOfRelease : Int,
  val imdbRaiting : Double,
  val director : Director)
  {
    def directorsAge = director.yearOfBirth - yearOfRelease
    def isDirectedBy(dir : Director) = this.director == dir
    def copy(name : String = "this.name",
      yearOfRelease : Int = this.yearOfRelease,
      imdbRaiting : Double = this.imdbRaiting,
      director : Director = this.director)
      = new Film(name, yearOfRelease, imdbRaiting, director)
    }



