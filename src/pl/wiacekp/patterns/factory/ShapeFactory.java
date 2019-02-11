package pl.wiacekp.patterns.factory;

import pl.wiacekp.patterns.factory.shapes.Circle;
import pl.wiacekp.patterns.factory.shapes.Rectangle;
import pl.wiacekp.patterns.factory.shapes.Square;

public class ShapeFactory {
    public Shape getShape(ShapeTypeEnum type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
