package com.vichet.patterns.creational.factory;

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        if (animalType == null) return null;
        if ("dog".equalsIgnoreCase(animalType)) return new Dog();
        if ("cat".equalsIgnoreCase(animalType)) return new Cat();
        if ("chicken".equalsIgnoreCase(animalType)) return new Chicken();
        return null;
    }
}
