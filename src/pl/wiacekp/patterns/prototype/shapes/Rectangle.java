package pl.wiacekp.patterns.prototype.shapes;

import pl.wiacekp.patterns.prototype.Shape;

public class Rectangle  extends Shape {
    public Rectangle() {
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
