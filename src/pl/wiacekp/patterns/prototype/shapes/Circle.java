package pl.wiacekp.patterns.prototype.shapes;

import pl.wiacekp.patterns.prototype.Shape;

public class Circle extends Shape {
    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
