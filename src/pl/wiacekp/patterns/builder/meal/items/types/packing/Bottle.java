package pl.wiacekp.patterns.builder.meal.items.types.packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Pack type : bottle";
    }
}
