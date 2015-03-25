package builder;

import builder.drinks.Coke;
import builder.drinks.Fanta;
import builder.food.ChickenBurger;
import builder.food.VegBurger;

/**
 * Created by Squall on 25/03/2015.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Fanta());
        return meal;
    }
}
