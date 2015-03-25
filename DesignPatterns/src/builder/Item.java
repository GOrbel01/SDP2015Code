package builder;

import builder.packaging.Packaging;

/**
 * Created by Squall on 25/03/2015.
 */
public interface Item {
    public String name();
    public Packaging packaging();
    public float price();
}
