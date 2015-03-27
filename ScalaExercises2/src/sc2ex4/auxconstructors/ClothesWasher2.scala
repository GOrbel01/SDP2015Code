package sc2ex4.auxconstructors

/**
 * Created by Squall on 27/03/2015.
 */
class ClothesWasher2(val modelName : String = "Default", val capacity : Double = 2) {

}

object testCW2 extends App {
  val washer = new ClothesWasher2()
  println(washer.capacity)
  println(washer.modelName)

  val washer2 = new ClothesWasher2(modelName = "AllInOne")
  println(washer2.capacity)
  println(washer2.modelName)
  val washer3 = new ClothesWasher2(capacity = 3.6)
  println(washer3.capacity)
  println(washer3.modelName)

}
