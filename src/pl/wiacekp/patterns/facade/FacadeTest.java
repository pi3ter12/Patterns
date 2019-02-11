package pl.wiacekp.patterns.facade;

import pl.wiacekp.patterns.PatternTest;

public class FacadeTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
        Facade facade = new Facade();
        facade.drawCricle();
        facade.drawRectangle();
        facade.drawSquare();
    }

    @Override
    public String getTitle() {
        return "Facade";
    }
}
