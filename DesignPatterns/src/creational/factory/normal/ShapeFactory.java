package creational.factory.normal;

import creational.factory.Circle;
import creational.factory.Rectangle;
import creational.factory.Shape;
import creational.factory.Square;

/**
 * Created by Cloud on 10/03/2015.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
        if (shapeType == null)
        {
            return null;
        }
        if (shapeType.equals("CIRCLE"))
        {
            return new Circle();
        }
        else if (shapeType.equals("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if (shapeType.equals("SQUARE"))
        {
            return new Square();
        }
        return null;
    }
}
