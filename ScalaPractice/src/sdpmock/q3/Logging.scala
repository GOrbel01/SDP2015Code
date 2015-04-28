package sdpmock.q3
//ADAPTER
object MyMain extends App {
  trait Log {
    def warning(msg: String)

    def error(msg: String)
  }

  final class Logger {
    def log(level: Int, msg: String): Unit = {

    }
  }

  implicit class LoggerToLogAdapter(logger: Logger) extends Log {
    def warning(msg: String) {
      logger.log(10, msg)
    }

    def error(msg: String) {
      logger.log(-99, msg)
    }
  }

  val log: Log = new Logger()
}