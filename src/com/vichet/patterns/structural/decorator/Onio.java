package com.vichet.patterns.structural.decorator;

public class Onio extends PizzaTopping{

    public Onio(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Onions";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 1.5;
    }
}
