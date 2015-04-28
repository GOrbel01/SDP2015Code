package miscpractice;

/**
 * Created by Squall on 16/04/2015.
 */
public class Base {
    public void methodOne() {
        System.out.println("A");
        methodTwo();
    }

    public void methodOne(int a) {
        System.out.println("W");
        methodTwo();
    }

    public void methodTwo() {
        System.out.println("B");
    }
}
