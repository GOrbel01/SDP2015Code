package sc3ex3

/**
 * Created by Cloud on 28/03/2015.
 */
sealed trait LinkedList[A]

case class Pair[A](head : A, tail : LinkedList[A]) extends LinkedList[A]

case class Empty[A]() extends LinkedList[A]

object testLL extends App {
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
}