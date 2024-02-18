package Fabrika;

import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalData;
import animals.Animal;

public class AnimalFactory {
    public Animal create(AnimalData animalview){
        switch(animalview){
            case CAT:
                return new Cat();
            case DUCK:
                return new Duck();
            case DOG:
                return new Dog();

        }
        return null;

    }
}
