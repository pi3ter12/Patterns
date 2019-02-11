package pl.wiacekp.patterns.facade;

import pl.wiacekp.patterns.facade.shapes.*;
import pl.wiacekp.patterns.factory.FactoryPatternTest;

public class Facade {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public Facade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCricle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
