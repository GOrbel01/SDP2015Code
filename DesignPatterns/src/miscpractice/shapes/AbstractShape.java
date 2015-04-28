package miscpractice.shapes;

/**
 * Created by Squall on 16/04/2015.
 */
public class AbstractShape implements Shape {

    private Point centre;

    public AbstractShape(Point centre) {
        this.centre = centre;
    }

    public Point getCentre() {
//        Point centre = getCentre();
        return null;
    }
}
