import java.io.IOException;

public interface ILogger {
    void log(String str, String tag) throws IOException;
}
