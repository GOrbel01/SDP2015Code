package creational.factory.abstracted;

import creational.factory.*;

/**
 * Created by Cloud on 10/03/2015.
 */
public class AColourFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType)
    {
        return null;
    }

    @Override
    public Colour getColour(String colourType)
    {
        if (colourType == null)
        {
            return null;
        }
        if (colourType.equals("RED"))
        {
            return new Red();
        }
        else if (colourType.equals("GREEN"))
        {
            return new Green();
        }
        else if (colourType.equals("BLUE"))
        {
            return new Blue();
        }
        return null;
    }
}
