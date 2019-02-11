package pl.wiacekp.patterns.factory;

import pl.wiacekp.patterns.PatternTest;

public class FactoryPatternTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(ShapeTypeEnum.CIRCLE);
        shape.draw();

        shape = shapeFactory.getShape(ShapeTypeEnum.RECTANGLE);
        shape.draw();

        shape = shapeFactory.getShape(ShapeTypeEnum.SQUARE);
        shape.draw();
    }

    @Override
    public String getTitle() {
        return "Factory pattern";
    }
}
