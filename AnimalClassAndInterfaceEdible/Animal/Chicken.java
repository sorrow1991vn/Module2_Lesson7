package Lesson7.AnimalClassAndInterfaceEdible.Animal;

import Lesson7.AnimalClassAndInterfaceEdible.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
