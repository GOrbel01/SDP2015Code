package builder.drinks;

import builder.packaging.Packaging;

/**
 * Created by Squall on 25/03/2015.
 */
public class Bottle implements Packaging {
    @Override
    public String pack() {
        return "Bottle";
    }
}
