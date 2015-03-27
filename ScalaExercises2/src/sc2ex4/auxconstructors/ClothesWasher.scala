package sc2ex4.auxconstructors

/**
 * Created by Squall on 27/03/2015.
 */
class ClothesWasher(val modelName : String, val capacity : Double) {
  val cycles = 5
  def this(modelName : String) = {
    this(modelName, 2)
  }

  def this(capacity : Double) = {
    this("Default", capacity)
  }

  def this() = {
    this("Default", 2)
  }
}