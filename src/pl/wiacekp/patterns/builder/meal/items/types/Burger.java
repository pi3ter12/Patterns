package pl.wiacekp.patterns.builder.meal.items.types;

import pl.wiacekp.patterns.builder.meal.items.types.packing.Box;
import pl.wiacekp.patterns.builder.meal.items.types.packing.Packing;

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract Integer price();
}
