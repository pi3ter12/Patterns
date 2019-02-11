package pl.wiacekp.patterns.prototype;

import pl.wiacekp.patterns.prototype.shapes.*;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> map = new Hashtable<>();

    public static Shape getShape(String key) {
        Shape cachedShape = map.get(key);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setKey("key1");
        map.put(circle.getKey(), circle);

        Square square = new Square();
        square.setKey("key2");
        map.put(square.getKey(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setKey("key3");
        map.put(rectangle.getKey(), rectangle);
    }
}
