package miscpractice;

/**
 * Created by Squall on 16/04/2015.
 */
public class ClassTest {
    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne(9);
        System.out.println();
        b.methodTwo();
    }
}
