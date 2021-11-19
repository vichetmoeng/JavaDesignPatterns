package com.vichet.patterns.structural.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Pizza panPizza = new PanPizza();
        System.out.println("You orderd - Pan Pizza");
        System.out.println("Your pizza topping - " + panPizza.description());
        System.out.println("Your total cost - " + panPizza.cost());


        panPizza = new Tomatoes(panPizza);
        System.out.println("You orderd - Pan Pizza");
        System.out.println("Your pizza topping - " + panPizza.description());
        System.out.println("Your total cost - " + panPizza.cost());

        panPizza = new Onio(panPizza);
        System.out.println("You orderd - Pan Pizza");
        System.out.println("Your pizza topping - " + panPizza.description());
        System.out.println("Your total cost - " + panPizza.cost());

        panPizza = new Cheese(panPizza);
        System.out.println("You orderd - Pan Pizza");
        System.out.println("Your pizza topping - " + panPizza.description());
        System.out.println("Your total cost - " + panPizza.cost());


    }
}
