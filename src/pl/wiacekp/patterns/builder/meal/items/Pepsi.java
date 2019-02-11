package pl.wiacekp.patterns.builder.meal.items;

import pl.wiacekp.patterns.builder.meal.items.types.Drink;

public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Integer price() {
        return 6;
    }
}
