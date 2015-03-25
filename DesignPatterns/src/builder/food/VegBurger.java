package builder.food;

import builder.food.Burger;

/**
 * Created by Squall on 25/03/2015.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
