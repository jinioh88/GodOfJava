import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface Logging {
    void write(String message);
}

class ConsoleLogging implements Logging {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}

class FileLogging implements Logging {
    private final File toWrite;
    public FileLogging(final File toWrite) {
        this.toWrite=toWrite;
    }

    @Override
    public void write(String message) {
        try {
            final FileWriter fos = new FileWriter(toWrite);
            fos.write(message);
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


