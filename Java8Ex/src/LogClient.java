import java.io.File;
import java.io.IOException;

public class LogClient {
    private final Logging logging;
    public LogClient(Logging logging) {
        this.logging = logging;
    }

    public void doWork(int count) {
        if(count%2==0)
            logging.write("Even number : "+count);
    }

    public static void main(String[] args) throws IOException {
        LogClient client1 = new LogClient(new ConsoleLogging());
        client1.doWork(32);

        File temp = File.createTempFile("test","log");
        LogClient client2 = new LogClient(new FileLogging(temp));
        client2.doWork(42);
    }
}
