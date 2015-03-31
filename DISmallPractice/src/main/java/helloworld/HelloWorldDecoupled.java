package helloworld;

import dagger.ObjectGraph;

import javax.inject.Inject;

/**
 * Created by Cloud on 30/03/2015.
 */
//Bring it together
public class HelloWorldDecoupled implements Runnable {

    @Inject MessageWriter writer;

    public static void main(String[] args) {
//        MessageSupportFactory msf = MessageSupportFactory.getInstance();
//        msf.getMessageRenderer().setMessageProvider(msf.getMessageProvider());
//        msf.getMessageRenderer().render();
        ObjectGraph objectGraph = ObjectGraph.create(new StandardOutMessageRenderer());
        HelloWorldDecoupled helloWorld = objectGraph.get(HelloWorldDecoupled.class);
        helloWorld.run();
    }

    public void run() {
        writer.writeMessage();
    }
}