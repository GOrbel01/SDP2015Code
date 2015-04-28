package miscpractice.shapes;

/**
 * Created by Squall on 16/04/2015.
 */
public class Square extends AbstractShape {
    private int side;

    public Square(int side, Point centre) {
        super(centre);
        this.side = side;
    }
}
