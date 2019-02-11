package pl.wiacekp.patterns.abstractfactory.animals;

import pl.wiacekp.patterns.abstractfactory.Animal;

public class ShortHairCat implements Animal {
    @Override
    public void printAnimalName() {
        System.out.println("I'm a short hair cat");
    }
}
