package pl.wiacekp.patterns.factory.shapes;

import pl.wiacekp.patterns.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
