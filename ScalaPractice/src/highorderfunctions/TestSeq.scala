package highorderfunctions

import scala.collection.GenSeq

/**
 * Created by Squall on 23/03/2015.
 */
trait TestSeq[+A] {
  def correspondsOwn[B](that: GenSeq[B])(p: (A, B) => Boolean): Boolean
}
