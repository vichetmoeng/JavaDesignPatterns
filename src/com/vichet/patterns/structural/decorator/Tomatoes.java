package com.vichet.patterns.structural.decorator;

public class Tomatoes extends PizzaTopping{
    public Tomatoes(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return "Tomatoes";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 1.0;
    }
}
