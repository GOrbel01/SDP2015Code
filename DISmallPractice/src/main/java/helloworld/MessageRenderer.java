package helloworld;

/**
 * Created by Cloud on 30/03/2015.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
