package com.vichet.patterns.creational.abstractfactory;

public class HondaCarFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {

        if ("brio".equalsIgnoreCase(carType)) return new Brio();
        if ("city".equalsIgnoreCase(carType)) return new City();

        return null;
    }
}
