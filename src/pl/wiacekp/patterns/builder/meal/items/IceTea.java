package pl.wiacekp.patterns.builder.meal.items;

import pl.wiacekp.patterns.builder.meal.items.types.Drink;

public class IceTea extends Drink {
    @Override
    public String name() {
        return "Ice tea";
    }

    @Override
    public Integer price() {
        return 4;
    }
}
