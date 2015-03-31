package helloworld;

import javax.inject.Inject;

/**
 * Created by Cloud on 30/03/2015.
 */
public class MessageWriter {
    @Inject MessageRenderer renderer;
    @Inject MessageProvider provider;

    public void writeMessage() {
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
