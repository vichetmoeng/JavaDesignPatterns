package com.vichet.patterns.creational.abstractfactory;

public class FactoryProducer {
    public static CarFactory getCarFactory(String factoryType) {
        if ("vichet".equalsIgnoreCase(factoryType)) return new VichetCarFactory();
        if ("honda".equalsIgnoreCase(factoryType)) return new HondaCarFactory();
        return null;
    }
}
