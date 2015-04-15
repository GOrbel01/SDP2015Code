package structural.proxy;

/**
 * Created by Squall on 10/04/2015.
 *  In Proxy pattern, a class represents functionality of another class. T his type of desig n pattern comes under
 *  structural pattern.
 *  In Proxy pattern, we create object having orig inal object to interface its functionality to outer world.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
