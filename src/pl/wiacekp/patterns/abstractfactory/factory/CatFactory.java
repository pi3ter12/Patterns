package pl.wiacekp.patterns.abstractfactory.factory;

import pl.wiacekp.patterns.abstractfactory.Animal;
import pl.wiacekp.patterns.abstractfactory.animals.LongHairCat;
import pl.wiacekp.patterns.abstractfactory.animals.ShortHairCat;

public class CatFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(boolean longHair) {
        return (longHair) ? new LongHairCat() : new ShortHairCat();
    }
}
