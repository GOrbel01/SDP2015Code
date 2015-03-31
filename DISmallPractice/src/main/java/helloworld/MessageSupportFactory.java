package helloworld;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Cloud on 30/03/2015.
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance = null;
    private Properties props = null;
    private StandardOutMessageRenderer renderer = null;
    private HelloWorldMessageProvider provider = null;

    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(new FileInputStream("src/bean.properties"));
            String renderClass = props.getProperty("renderer");
            String providerClass = props.getProperty("provider");
            renderer = (StandardOutMessageRenderer) Class.forName(renderClass).newInstance();
            provider = (HelloWorldMessageProvider) Class.forName(providerClass).newInstance();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
