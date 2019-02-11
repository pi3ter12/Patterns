package pl.wiacekp.patterns.singleton;

import pl.wiacekp.patterns.PatternTest;

public class SingletonTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
//        new Singleton() - compiler error
        method1();
        method2();
    }

    private void method1() {
        System.out.println("I'm in method 1");
        Singleton singleton = Singleton.getInstance();
        singleton.printValue();
        System.out.println("set value \"test1\"");
        singleton.setValue("test1");
        singleton.printValue();
    }

    private void method2() {
        System.out.println("I'm in method 2");
        Singleton.getInstance().printValue();
    }

    @Override
    public String getTitle() {
        return "Singleton";
    }
}
