package sdpmock.q3;
//ADAPTER
public class LoggerExample {
    public static void main(String[] args) {
        JLog log = new JLoggerToLogAdapter(new JLogger());
    }
}

interface JLog {
    void warning(String msg);
    void error(String msg);
}

class JLogger {
    void log(int level, String msg) {

    }
}

class JLoggerToLogAdapter implements JLog {

    private final JLogger logger;

    public JLoggerToLogAdapter(JLogger log) {
        this.logger = log;
    }

    @Override
    public void warning(String msg) {
        logger.log(10, msg);
    }

    @Override
    public void error(String msg) {
        logger.log(-99, msg);
    }
}