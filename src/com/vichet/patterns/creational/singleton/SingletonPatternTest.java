package com.vichet.patterns.creational.singleton;

public class SingletonPatternTest {
    public static void main(String[] args) {
        Circle circle1 = Circle.getInstance();
        Circle circle2 = Circle.getInstance();

        System.out.println(circle1); // ..@the_same_address
        System.out.println(circle2); // ..@the_same_address
    }
}
