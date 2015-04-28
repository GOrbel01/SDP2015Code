package miscpractice.shapes;

/**
 * Created by Squall on 16/04/2015.
 */
public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius, Point centre) {
        super(centre);
        this.radius = radius;
    }
}
