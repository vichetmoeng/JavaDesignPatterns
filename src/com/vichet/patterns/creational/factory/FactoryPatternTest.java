package com.vichet.patterns.creational.factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        // without factory pattern
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        Chicken chicken = new Chicken();
        chicken.eat();

        // with factory pattern
        String animalType = "cat"; // "dog", "chicken"
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal(animalType);
        animal.eat();
    }
}
