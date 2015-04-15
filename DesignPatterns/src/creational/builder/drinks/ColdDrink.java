package creational.builder.drinks;

import creational.builder.Item;
import creational.builder.packaging.Packaging;

/**
 * Created by Squall on 25/03/2015.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packaging packaging() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
