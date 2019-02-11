package pl.wiacekp.patterns.builder;

import pl.wiacekp.patterns.PatternTest;
import pl.wiacekp.patterns.builder.meal.Meal;

public class BuilderTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
        Builder builder = new Builder();

        Meal meal = builder.chickenAndPepsi();
        meal.printAllProducts();

        meal = builder.onlyTea();
        meal.printAllProducts();

        meal = builder.vegeMeal();
        meal.printAllProducts();
    }

    @Override
    public String getTitle() {
        return "Builder";
    }
}
