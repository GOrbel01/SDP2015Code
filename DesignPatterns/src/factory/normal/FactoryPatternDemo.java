package factory.normal;

import factory.Shape;
import factory.normal.ShapeFactory;

/**
 * Created by Cloud on 10/03/2015.
 */
public class FactoryPatternDemo {
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
