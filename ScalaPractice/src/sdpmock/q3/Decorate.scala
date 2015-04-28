package sdpmock.q3

object Decorate extends App {
  val s = new FOS("foo.txt") with Buffered
}

trait OutputStream {
  def write(b: Byte)
  def write(b: Array[Byte])
}

trait Buffered extends OutputStream {
  abstract override def write(b: Byte): Unit = {
    super.write(b)
  }
}

class FOS(path: String) extends OutputStream {
  override def write(b: Byte): Unit = ???
  override def write(b: Array[Byte]): Unit = ???
}