import javax.inject.Inject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleLogger implements ILogger{
    private static int N = 1;
    public void log(String str, String tag) throws IOException {
        System.out.println("line number N=" + N +" " + "<" + tag + ">" + str+ "</" + tag + ">");
        N++;
    }
}
