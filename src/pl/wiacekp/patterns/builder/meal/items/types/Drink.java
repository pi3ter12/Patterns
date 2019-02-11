package pl.wiacekp.patterns.builder.meal.items.types;

import pl.wiacekp.patterns.builder.meal.items.types.packing.Bottle;
import pl.wiacekp.patterns.builder.meal.items.types.packing.Packing;

public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Integer price();
}
