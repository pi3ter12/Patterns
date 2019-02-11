package pl.wiacekp.patterns.facade.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
