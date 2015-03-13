package factory.abstracted;

import factory.Colour;
import factory.Shape;

/**
 * Created by Cloud on 10/03/2015.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        AbstractFactory colourFactory = FactoryProducer.getFactory("COLOUR");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
    //call draw method of Shape Circle
        shape1.draw();
    //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
    //call draw method of Shape Rectangle
        shape2.draw();
    //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
    //call draw method of Shape Square
        shape3.draw();

    //get an object of Color Red
        Colour color1 = colourFactory.getColour("RED");
    //call fill method of Red
        color1.fill();
    //get an object of Color Green
        Colour color2 = colourFactory.getColour("GREEN");
    //call fill method of Green
        color2.fill();
    //get an object of Color Blue
        Colour color3 = colourFactory.getColour("BLUE");
    //call fill method of Color Blue
        color3.fill();
    }
}
