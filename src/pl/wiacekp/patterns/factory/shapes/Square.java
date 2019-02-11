package pl.wiacekp.patterns.factory.shapes;

import pl.wiacekp.patterns.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
