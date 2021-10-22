import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application {
    private final ILogger consoleLogger;
    private final ILogger fileLogger;
    private final ILogger composeLogger;
    private ILogger logger;

    @Inject
    public Application(@NotNull @IConsole ILogger consoleLogger, @NotNull @IFile ILogger fileLogger, @NotNull @ICompose ILogger composeLogger){
        this.consoleLogger = consoleLogger;
        this.fileLogger = fileLogger;
        this.composeLogger = composeLogger;
    }


    public void waitForInput(String type, String tag) {

        try (Scanner scanner = new Scanner(System.in)) {
            //System.out.println("print type.");
            //String type = scanner.nextLine();
            if (type.equals("console")){
                logger = consoleLogger;
            }
            else if (type.equals("file")){
                logger = fileLogger;
            }
            else if (type.equals("compose")){
                logger = composeLogger;
            }
            //System.out.println("print tag.");
            //String tag = scanner.nextLine();

            while (true) {
                System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
                String line = scanner.nextLine();
                logger.log(line, tag);
            }
        } catch (IllegalStateException | NoSuchElementException | IOException e) {
        }
    }
}
