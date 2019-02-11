package pl.wiacekp.patterns.prototype;

import pl.wiacekp.patterns.PatternTest;

public class PrototypeTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
        ShapeCache.loadCache();

        testKey("key1");
        testKey("key2");
        testKey("key3");
    }

    private void testKey(String key) {
        Shape shape = ShapeCache.getShape(key);
        System.out.println(key + "  , type: " + shape.getType());
        shape.draw();
    }

    @Override
    public String getTitle() {
        return "Prototype";
    }
}
