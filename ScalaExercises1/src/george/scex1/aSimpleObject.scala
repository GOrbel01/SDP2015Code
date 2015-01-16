package george

/**
 * Created by Squall on 16/01/2015.
 */
object aSimpleObject {
  val sky : String = "Sunny"
  val temp : Double = 89

  def eval(): Boolean =
  {
    sky.equals("Sunny") && temp >= 80.0
  }

  def main(args: Array[String]): Unit =
  {
    if (eval())
    {
      println("What a DAY!!!")
    }
    else
    {
      println("Bad Times....")
    }
  }

  def toCelcius(Double: temp): Double =
  {
    temp
  }
}
