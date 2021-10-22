
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileLogger implements ILogger{
    private static int N = 1;
    @Override
    public void log(String str, String tag) throws IOException {
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter("log.txt", true);
            fileWriter.append("line number N="+ N + " " + "<" + tag + ">" + str + "</" + tag + ">" + "\n");
            fileWriter.flush();
            N++;
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
