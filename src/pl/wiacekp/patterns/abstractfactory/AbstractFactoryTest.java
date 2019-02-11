package pl.wiacekp.patterns.abstractfactory;

import pl.wiacekp.patterns.PatternTest;
import pl.wiacekp.patterns.abstractfactory.factory.AbstractFactory;

public class AbstractFactoryTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
        AbstractFactory dogFactory = FactoryProducer.getFactory(true);
        dogFactory.getAnimal(true).printAnimalName();
        dogFactory.getAnimal(false).printAnimalName();

        AbstractFactory catFactory = FactoryProducer.getFactory(false);
        catFactory.getAnimal(true).printAnimalName();
        catFactory.getAnimal(false).printAnimalName();
    }

    @Override
    public String getTitle() {
        return "Abstract factory title";
    }
}
