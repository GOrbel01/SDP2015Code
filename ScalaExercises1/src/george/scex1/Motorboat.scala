package george.scex1

/**
 * Created by Squall on 20/01/2015.
 */
class Motorboat {

  def startMotor(): String =
  {
    val motorOp = "Motor On" : String
    println(motorOp)
    motorOp
  }

  def stopMotor(): String =
  {
    val motorOp = "Motor Off" : String
    println(motorOp)
    motorOp
  }

  def signal(): String =
  {
    val flare = new Flare
    flare.light()
  }

}
