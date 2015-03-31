package helloworld;

import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;

/**
 * Created by Cloud on 30/03/2015.
 */
//Decoupled Message Renderer
@Module(injects = HelloWorldDecoupled.class, includes = MessageProvider.class)
public class StandardOutMessageRenderer implements MessageRenderer {

    @Inject
    MessageProvider messageProvider;

    @Provides
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You Must Set the Property messageProvider of class:"
                        + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Provides public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Provides public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
