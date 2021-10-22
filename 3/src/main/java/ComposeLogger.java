import javax.inject.Inject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComposeLogger implements ILogger{
    private static int N = 1;

    public void log(String str, String tag) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("log.txt", true);
            String result = "<" + tag + ">" +str+ "</" + tag + ">";
            System.out.println("line number N= " + N + ": " + result + "\n");
            N++;
            fileWriter.append("line number N="+N + " " + result+"\n");
            fileWriter.flush();
            N++;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
