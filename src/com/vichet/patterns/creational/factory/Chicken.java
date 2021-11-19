package com.vichet.patterns.creational.factory;

public class Chicken implements Animal{
    @Override
    public void eat() {
        System.out.println("Chicken is eating");
    }
}
