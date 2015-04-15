package structural.decorator;

/**
 * Created by Squall on 25/03/2015.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape rect = new Rectangle();

        Shape redSquare = new RedShapeDecorator(square);
        Shape redRectangle = new RedShapeDecorator(rect);
        System.out.println("Square with Normal Border");
        square.draw();

        System.out.println("Square with Red Border");
        redSquare.draw();

        System.out.println("Rectangle with Red Border");
        redRectangle.draw();
    }
}
