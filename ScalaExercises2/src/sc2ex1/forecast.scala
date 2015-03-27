package sc2ex1

/**
 * Created by Cloud on 26/03/2015.
 */
object weather {
  def forecast(cloudiness : Int) = {
    cloudiness match {
      case 100 => "Sunny"
      case 80 => "Mostly Sunny"
      case 50 => "Partly Sunny"
      case 20 => "Partly Cloudy"
      case 0 => "Cloudy"
      case _ => "Unknown"
    }
  }
}

object testForecast extends App {
  println(weather.forecast(100))
  println(weather.forecast(80))
  println(weather.forecast(50))
  println(weather.forecast(20))
  println(weather.forecast(0))
  println(weather.forecast(15))
  println(weather.forecast(30))

  println("Vec Version")

  val vec = Vector(100, 80, 50, 20, 0, 15)
  vec.foreach((i) => println(weather.forecast(i)))
}