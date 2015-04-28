package sdpmock.q4

/**
 * Created by Squall on 28/04/2015.
 */
object MergeSort extends App {
  def merge[T](as: List[T], bs: List[T])(cmp: (T, T) => Boolean): List[T] =
    (as, bs) match {
        case (Nil, _) => println("herebs"); println(bs); bs
        case (_, Nil) => println("hereas"); println(as); as
        case (x :: xs, y :: ys) =>
          println("X: " + x)
          println("Y: " + y)
          println("XS: " + xs)
          println("YS: " + ys)
          println("AS List State: " + as)
          println("BS List State: " + bs)
          if (cmp(x ,y)) x :: merge(xs, bs)(cmp)
          else y :: merge(as, ys)(cmp)
    }

  val la = List(1, 4, 5, 6, 7)
  val lb = List(2, 3, 8, 9)
  val lc = merge(lb, la)((x, y) => x <= y)
  println(lc)
}
