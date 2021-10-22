import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import org.jetbrains.annotations.NotNull;

public final class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ILogger.class).annotatedWith(IConsole.class).to(ConsoleLogger.class);
        bind(ILogger.class).annotatedWith(IFile.class).to(FileLogger.class);
        bind(ILogger.class).annotatedWith(ICompose.class).to(ComposeLogger.class);
    }
}
