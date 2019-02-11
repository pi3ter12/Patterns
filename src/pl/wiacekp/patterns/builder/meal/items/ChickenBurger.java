package pl.wiacekp.patterns.builder.meal.items;

import pl.wiacekp.patterns.builder.meal.items.types.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public Integer price() {
        return 2;
    }
}
