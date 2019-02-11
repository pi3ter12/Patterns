package pl.wiacekp.patterns.builder.meal.items;

import pl.wiacekp.patterns.builder.meal.items.types.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Integer price() {
        return 3;
    }
}
