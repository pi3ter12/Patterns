package pl.wiacekp.patterns.facade.shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
