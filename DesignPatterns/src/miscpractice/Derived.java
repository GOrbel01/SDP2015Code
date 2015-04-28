package miscpractice;

/**
 * Created by Squall on 16/04/2015.
 */
public class Derived extends Base {
    public void methodOne(int a) {
        super.methodOne();
        System.out.println("X");
    }

    public void methodOne(Integer a) {
        super.methodOne();
        System.out.println("C");
    }

    public void methodTwo() {
        super.methodTwo();
        System.out.println("D");
    }
}
