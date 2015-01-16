package helloworld;

public class HelloWorldDecoupled {

	public static void main(String[] args) {
		StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
		HelloWorldMessageProvider mp = new HelloWorldMessageProvider("Go World!");
		mr.setMessageProvider(mp);
		mr.render();
	}
}
