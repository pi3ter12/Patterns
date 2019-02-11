package pl.wiacekp.patterns.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private String value = "empty";

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }

    public void printValue() {
        System.out.println(value);
    }

    public void setValue(String value) {
        this.value = value;
    }
}
