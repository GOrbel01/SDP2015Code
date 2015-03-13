package factory.normal;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;
import factory.Square;

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
