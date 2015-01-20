package directorPackage

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
object Film {
  //apply -- takes same parameters as for constructor -> new Film
  def apply(name : String, year : Int, imdbRaiting : Double, director : Director) =
  new Film(name, year, imdbRaiting, director) //Tick

  //Method to return highest rating of two films
  def highestRating(f1 : Film, f2 : Film): Double =
  {
    if (f1.imdbRaiting > f2.imdbRaiting)
    {
      f1.imdbRaiting
    }
    else
    {
      f2.imdbRaiting
    }
  }

  //Method to return oldest director at time of filming between two films
  def oldestDirectorAtTheTime(f1 : Film, f2 : Film): Director =
  {
    if (f1.directorsAge > f2.directorsAge)
    {
      f1.director
    }
    else
    {
      f2.director
    }
  }

}

