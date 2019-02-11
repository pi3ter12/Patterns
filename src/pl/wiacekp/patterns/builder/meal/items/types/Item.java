package pl.wiacekp.patterns.builder.meal.items.types;

import pl.wiacekp.patterns.builder.meal.items.types.packing.Packing;

public interface Item {
    String name();
    Integer price();
    Packing packing();
}
