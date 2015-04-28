package miscpractice.shapes;

/**
 * Created by Squall on 16/04/2015.
 */
public class Rectangle extends AbstractShape implements Quad {
    private int width;
    private int height;

    public Rectangle(int width, int height, Point centre) {
        super(centre);
        this.width = width;
        this.height = height;
    }

    public boolean contains(Point p) {
        return false;
    }
}
