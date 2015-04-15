package structural.bridge;

/**
 * Created by Squall on 10/04/2015.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ colour : red, radius: "
        + radius + ", x: " + x + ", " + y + "]");
    }
}
