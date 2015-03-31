package helloworld;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cloud on 30/03/2015.
 */
//Decoupled Message Provider
@Module(complete = false, library = true)
public class HelloWorldMessageProvider implements MessageProvider {

    @Provides
    public String getMessage() {
        return "Hello World";
    }
}
