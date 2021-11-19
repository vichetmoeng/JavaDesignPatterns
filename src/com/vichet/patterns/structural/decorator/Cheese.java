package com.vichet.patterns.structural.decorator;

public class Cheese extends PizzaTopping{
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return "Cheese";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 5.5;
    }
}
