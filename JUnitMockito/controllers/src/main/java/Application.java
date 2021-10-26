import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

public class Application {

    public static void main(@NotNull String[] args) throws IOException {

        final Injector injector = Guice.createInjector(new MainModule());
        int capacity = Integer.parseInt(args[0]);
        Library library = injector.getInstance(LibraryFactory.class).library(capacity);
        library.printAll();
    }
}