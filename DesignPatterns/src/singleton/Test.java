package singleton;

/**
 * Created by Cloud on 10/03/2015.
 */
public class Test {

    private int testVal;

    private static Test ourInstance = new Test(5);

    public static Test getInstance() {
        return ourInstance;
    }

    private Test(int testVal) {
        this.testVal = testVal;
    }

    public void printTest()
    {
        System.out.println("Test: " + this.testVal);
    }
}
