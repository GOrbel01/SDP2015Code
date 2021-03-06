package creational.factory.abstracted;

import creational.factory.*;

/**
 * Created by Cloud on 10/03/2015.
 */
public class AShapeFactory extends AbstractFactory {

    @Override
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

    @Override
    Colour getColour(String colour)
    {
        return null;
    }
}
