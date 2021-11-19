package com.vichet.patterns.creational.singleton;

// for Singleton need to follow two rules:
// 1 - should have only single instance
// 2 - should be available global access

// Steps to make a class Singleton:
//
// step1 - Create a class which you want to make Singleton.
public class Circle {

    // step2 - Create a private default constructor of the class.
    private Circle() {

    }

    // step3 - Create a private static variable of the class created in step1.
    // and this variable should be private and static, and it should refer to the instance of the class created in step1.
    private static Circle circleInstance = new Circle();

    // step4 - Create an accessor method which always return instance of class created in step3.
    public static Circle getInstance(){
        return circleInstance;
    }

}
