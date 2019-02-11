package pl.wiacekp.patterns.facade.shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
