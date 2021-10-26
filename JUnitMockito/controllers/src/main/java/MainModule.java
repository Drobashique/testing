import com.google.inject.AbstractModule;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BooksFactory.class).toInstance(new FileBookFactory("controllers/src/main/resources/books.txt"));
    }
}
