package list

/**
 * Created by Squall on 03/02/2015.
 */
sealed trait IntList {
  def map(fn : Int => Int): IntList =
  this match {
      case EndOfList => EndOfList
      case Node(hd, tl) => Node(fn(hd), tl.map(fn))
  }

  def length: Int =
  fold[Int](0,(_,tl) => 1 + tl)

  def sum: Int =
  fold[Int](0,(hd, tl) => hd + tl)

  def fold[T](end: T, f: (Int, T) => T): T =
  this match {
     case EndOfList => end
     case Node(hd, tl) => f(hd, tl.fold())
  }

  final case object EndOfList extends IntList
  final case class Node(head: Int, tail: IntList) extends IntList

  object Test extends App {
//    val l
  }
}
