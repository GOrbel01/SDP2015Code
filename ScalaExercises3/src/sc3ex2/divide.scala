package sc3ex2

/**
 * Created by Squall on 28/03/2015.
 */
object divide {
  def apply(num : Int, den : Int) : DivisionResult = {
    if (den == 0) {
      new Infinite()
    }
    else {
      new Finite(num/den)
    }
  }
}

final case class Finite(res : Int) extends DivisionResult {
  val result = res
}

final case class Infinite() extends DivisionResult {
  val result = 0
}

sealed trait DivisionResult {
  def result : Int
}

object testTypes extends App {
  println(divide(1, 2))
  println(divide(12, 4))
  println(divide(1, 0))

  def matchDivide(num : Int, den : Int) = {
    val divResult = divide(num, den)
    divResult.result match {
      case x : Int if x <= 10 => "Result is Less than 10"
      case x : Int if x >= 10 && x < 20 => "Result is Less than 20 and Greater than 10"
      case x : Int if x >= 20 && x < 30 => "Result is Greater than 20 and Less than 30"
      case x : Int if x > 30 => "Result is 30 or Above"
      case _ => "There is No Result"
    }
  }

  println(matchDivide(14, 2))
  println(matchDivide(10, 0))
}