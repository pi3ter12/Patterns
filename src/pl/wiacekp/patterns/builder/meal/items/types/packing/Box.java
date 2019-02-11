package pl.wiacekp.patterns.builder.meal.items.types.packing;

public class Box implements Packing {
    @Override
    public String pack() {
        return "Pack type : box";
    }
}
