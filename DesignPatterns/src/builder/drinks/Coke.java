package builder.drinks;

/**
 * Created by Squall on 25/03/2015.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 20.45f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
