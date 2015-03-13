package factory.abstracted;

import factory.Colour;
import factory.Shape;

/**
 * Created by Cloud on 10/03/2015.
 */
public abstract class AbstractFactory {
    abstract Colour getColour(String colour);
    abstract Shape getShape(String shape);
}
