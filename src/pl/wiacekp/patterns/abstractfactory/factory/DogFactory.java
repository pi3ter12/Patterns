package pl.wiacekp.patterns.abstractfactory.factory;

import pl.wiacekp.patterns.abstractfactory.Animal;
import pl.wiacekp.patterns.abstractfactory.animals.LongHairDog;
import pl.wiacekp.patterns.abstractfactory.animals.ShortHairDog;

public class DogFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(boolean longHair) {
        return (longHair) ? new LongHairDog() : new ShortHairDog();
    }
}
