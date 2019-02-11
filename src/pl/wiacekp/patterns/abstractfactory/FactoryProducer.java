package pl.wiacekp.patterns.abstractfactory;

import pl.wiacekp.patterns.abstractfactory.factory.AbstractFactory;
import pl.wiacekp.patterns.abstractfactory.factory.CatFactory;
import pl.wiacekp.patterns.abstractfactory.factory.DogFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isDog) {
        return (isDog) ? new DogFactory() : new CatFactory();
    }
}
