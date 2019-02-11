package pl.wiacekp.patterns.abstractfactory.factory;

import pl.wiacekp.patterns.abstractfactory.Animal;

public abstract class AbstractFactory {
    public abstract Animal getAnimal(boolean longHair);
}
