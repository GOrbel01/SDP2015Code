package highorderfunctions

/**
 * Created by Squall on 22/03/2015.
 */
object UsefulHOFunctions extends App {
  (1 to 9).map(0.1 * _).foreach(println _)
  (1 to 9).map((d) => 0.1 * d).foreach((i) => println(i + "Long"))
  (1 to 9).map((d) => "*" * d).foreach((str) => println(str)) //Full Function
}
