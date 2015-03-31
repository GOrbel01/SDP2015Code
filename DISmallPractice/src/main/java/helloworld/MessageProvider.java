package helloworld;

import dagger.Provides;

/**
 * Created by Cloud on 30/03/2015.
 */
//MessageProvider is HardCoded in Message Renderer. Interface can fix that
public interface MessageProvider {
    String getMessage();
}
