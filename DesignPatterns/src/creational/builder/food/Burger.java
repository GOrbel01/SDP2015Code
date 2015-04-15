package creational.builder.food;

import creational.builder.Item;
import creational.builder.packaging.Packaging;
import creational.builder.packaging.Wrapper;

/**
 * Created by Squall on 25/03/2015.
 */
public abstract class Burger implements Item {
    @Override
    public Packaging packaging() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
