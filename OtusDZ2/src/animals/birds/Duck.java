package animals.birds;

import animals.Animal;

public class Duck extends Animal implements IFly{
    public void Fly() {
        System.out.println("Я лечу");

    }
}
