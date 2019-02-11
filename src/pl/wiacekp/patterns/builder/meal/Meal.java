package pl.wiacekp.patterns.builder.meal;

import pl.wiacekp.patterns.builder.meal.items.types.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Integer getCost() {
        return items.stream().map(Item::price).mapToInt(Integer::intValue).sum();
    }

    public void printAllProducts() {
        items.forEach(c ->
            System.out.println("name: " + c.name() + " in " + c.packing().pack() + ", cost : " + c.price())
        );
        System.out.println("All : " + getCost() + "\n");
    }
}
