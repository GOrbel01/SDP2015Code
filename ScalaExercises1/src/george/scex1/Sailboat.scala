package george.scex1

/**
 * Created by Squall on 20/01/2015.
 */
class Sailboat {

  def lower(): String =
  {
    val sailOp = "Sails Lowered" : String
    println(sailOp)
    sailOp
  }

  def raise(): String =
  {
    val sailOp = "Sails Raised" : String
    println(sailOp)
    sailOp
  }

  def signal(): String =
  {
    val flare = new Flare
    flare.light()
  }

}

object boats
{
  val aSailBoat = new Sailboat
  val aMotorBoat = new Motorboat
  val aFlare = new Flare
  def main(args : Array[String]): Unit =
  {
    val r1 : String = aSailBoat.lower
    assert(r1 == "Sails Lowered", "Expected Sails Lowered, Got " + r1)
    val r2 : String = aSailBoat.raise
    assert(r2 == "Sails Raised", "Expected Sails Raised, Got " + r1)
    val m1 : String = aMotorBoat.startMotor
    assert(m1 == "Motor On", "Expected Motor On, Got " + m1)
    val m2 : String = aMotorBoat.stopMotor
    assert(m2 == "Motor Off", "Expected Motor Off, Got " + m2)
    val f1 : String = aFlare.light()
    assert(f1 == "Flare Used!", "Expected Flare Used!, Got " + f1)
    val sbf : String = aSailBoat.signal()
    assert(sbf == "Flare Used!", "Expected Flare Used!, Got " + sbf)
    val mbf : String = aMotorBoat.signal()
    assert(mbf == "Flare Used!", "Expected Flare Used!, Got " + mbf)
  }
}
