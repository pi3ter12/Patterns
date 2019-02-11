package pl.wiacekp.patterns.builder;

import pl.wiacekp.patterns.builder.meal.items.ChickenBurger;
import pl.wiacekp.patterns.builder.meal.items.IceTea;
import pl.wiacekp.patterns.builder.meal.items.Pepsi;
import pl.wiacekp.patterns.builder.meal.items.VegBurger;
import pl.wiacekp.patterns.builder.meal.Meal;

public class Builder {
    public Meal chickenAndPepsi() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
    public Meal vegeMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new IceTea());
        return meal;
    }
    public Meal onlyTea() {
        Meal meal = new Meal();
        meal.addItem(new IceTea());
        return meal;
    }
}
