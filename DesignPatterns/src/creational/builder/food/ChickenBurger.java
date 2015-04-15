package creational.builder.food;

/**
 * Created by Squall on 25/03/2015.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 45.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
