package sc3ex3

/**
 * Created by Cloud on 28/03/2015.
 */
sealed trait Publication

case class Periodical(issueNo : Int, volume : String, editor : String, text : Seq[Manuscript]) extends Publication {

}

case class Book(length : Int, author : String) extends Manuscript(length, author) with Publication {

}

class Manuscript(length : Int, author : String) {

}