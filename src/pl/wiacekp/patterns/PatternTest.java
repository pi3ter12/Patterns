package pl.wiacekp.patterns;

import pl.wiacekp.patterns.abstractfactory.AbstractFactoryTest;
import pl.wiacekp.patterns.adapter.AdapterTest;
import pl.wiacekp.patterns.builder.BuilderTest;
import pl.wiacekp.patterns.facade.FacadeTest;
import pl.wiacekp.patterns.factory.FactoryPatternTest;
import pl.wiacekp.patterns.filter.FilterTest;
import pl.wiacekp.patterns.prototype.PrototypeTest;
import pl.wiacekp.patterns.singleton.SingletonTest;

import java.util.Arrays;
import java.util.List;

public class PatternTest {
    private static final List<Class> patternToTest = Arrays.asList(
            FactoryPatternTest.class,
            AbstractFactoryTest.class,
            SingletonTest.class,
            BuilderTest.class,
            PrototypeTest.class,
            AdapterTest.class,
            FilterTest.class,
            FacadeTest.class
    );


    public static void testAll() {
        patternToTest.forEach(c -> testOne(getInstance(c)));
    }

    public static void testOne(PatternTestInterface pattern) {
        if (pattern != null) {
            System.out.println("TITLE: " + pattern.getTitle() + "\n");
            pattern.test();
            System.out.println("***");
        }
    }

    private static PatternTestInterface getInstance(Class clazz) {
        if(PatternTestInterface.class.isAssignableFrom(clazz)) {
            try {
                return (PatternTestInterface) clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public interface PatternTestInterface {
        void test();
        String getTitle();
    }
}
