import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(@NotNull String[] args) {
        final Injector injector = Guice.createInjector(new MainModule());
        injector.getInstance(Application.class).waitForInput(args[0],args[1]);
    }
}
