package sc2ex3

/**
 * Created by Cloud on 26/03/2015.
 */
class Planet(val name : String, description : String, val moons : Int = 1) {
  def hasMoon = moons > 0
}

object testPlanet extends App {
  val p = new Planet(name = "Mercury", description = "Small and Hot Planet", moons = 0)
  println(p.hasMoon)
  val pe = new Planet(moons = 1, name = "Earth", description = "A Hospitable Planet")
  println(pe.hasMoon)
}