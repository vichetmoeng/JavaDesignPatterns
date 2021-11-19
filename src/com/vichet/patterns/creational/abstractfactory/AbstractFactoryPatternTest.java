package com.vichet.patterns.creational.abstractfactory;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        CarFactory vichetCarFactory = FactoryProducer.getCarFactory("vichet");
        CarFactory hondaCarFactory = FactoryProducer.getCarFactory("honda");

        Car brio = hondaCarFactory.createCar("brio");
        brio.drive();
        Car city = hondaCarFactory.createCar("city");
        city.drive();

        Car i10 = vichetCarFactory.createCar("i10");
        i10.drive();
        Car i20 = vichetCarFactory.createCar("i20");
        i20.drive();
    }
}
