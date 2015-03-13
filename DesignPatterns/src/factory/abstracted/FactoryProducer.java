package factory.abstracted;

/**
 * Created by Cloud on 10/03/2015.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE"))
        {
            return new AShapeFactory();
        }
        else if (choice.equalsIgnoreCase("COLOUR"))
        {
            return new AColourFactory();
        }
        return null;
    }
}
