package sc3ex3

sealed trait LinkedList[T] {
}

final case class Pair[T](h : T, t : LinkedList[T]) extends LinkedList[T] {
  def head : T = h
  def tail : LinkedList[T] = t
}

final case class Empty[T]() extends LinkedList[T]

object testLL extends App {
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  println(list.isInstanceOf[LinkedList[Int]])
  println(list)
}