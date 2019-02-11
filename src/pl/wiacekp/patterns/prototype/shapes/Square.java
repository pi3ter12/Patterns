package pl.wiacekp.patterns.prototype.shapes;

import pl.wiacekp.patterns.prototype.Shape;

public class Square  extends Shape {
    public Square() {
        type = "square";
    }

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
