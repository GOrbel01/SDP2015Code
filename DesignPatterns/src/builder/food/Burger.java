package builder.food;

import builder.Item;
import builder.packaging.Packaging;
import builder.packaging.Wrapper;

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
