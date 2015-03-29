package sc3ex3

sealed trait LinkedList[T] {
  def head : T
  def tail : LinkedList[T]

  def length(num : Int = 0) : Int
  def apply(index : Int, n : Int = 0) : T
  def contains(element : T, n : Int = 0) : Boolean
}

case class Pair[T](head : T, tail : LinkedList[T]) extends LinkedList[T] {
  def length(num : Int = 0) : Int = {
    tail match {
      case Empty() => num+1
      case _ => tail.length(num+1)
    }
  }

  def apply(index : Int, n : Int = 0) : T = {
    n match {
      case num : Int == index  =>
    }


    if (n == index) {
      head
    }
    else
    {
      tail.apply(index, n+1)
    }
  }

  def contains()
}

final case class Empty[T]() extends LinkedList[T] {
  val head : T = head
  val tail : LinkedList[T] = tail
  def length(num : Int = 0) = 0
  def apply(index : Int, n : Int) = head
  def contains(element : T, n : Int = 0) = false
}

object testLL extends App {
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  println(list.isInstanceOf[LinkedList[Int]])
  println(list.head)
  println(list.tail.head)
  println(list.tail.tail)
  println(list.tail.tail.head)
  println(list.tail.tail.tail)
  println("Length: " + list.length())
  println("Apply: " + list.apply(0))
//  val p : Pair = list.tail.tail
}

