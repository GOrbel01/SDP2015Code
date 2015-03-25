package decorator;

/**
 * Created by Squall on 25/03/2015.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape shape) {
        System.out.println("Border Colour: Red");
    }
}
