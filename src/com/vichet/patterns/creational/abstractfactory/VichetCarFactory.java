package com.vichet.patterns.creational.abstractfactory;

public class VichetCarFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {
        if ("i10".equalsIgnoreCase(carType)) return new I10();
        if ("i20".equalsIgnoreCase(carType)) return new I20();

        return null;
    }
}
