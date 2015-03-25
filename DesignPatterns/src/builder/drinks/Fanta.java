package builder.drinks;

import builder.drinks.ColdDrink;

/**
 * Created by Squall on 25/03/2015.
 */
public class Fanta extends ColdDrink {
    @Override
    public float price() {
        return 20.45f;
    }

    @Override
    public String name() {
        return "Fanta";
    }
}
