package com.vichet.patterns.behavioral.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // 2 customer
        Customer customer1 = new Customer();
        customer1.setCustomerName("Vichet");

        Customer customer2 = new Customer();
        customer2.setCustomerName("Immortal");

        // 1 product
        Product immortalSword = new Product();
        immortalSword.setProductName("Immortal Sword");
        immortalSword.setAvailable(false);

        // register all customer to get notify
        immortalSword.registerObserver(customer1);
        immortalSword.registerObserver(customer2);

        // start notify to all registered customer when product available
        immortalSword.setAvailable(true);

        // customer2 unsubscribe to notify
        immortalSword.removeObserver(customer2);

        // start notify to all registered customer when product available
        immortalSword.setAvailable(true);

        // customer2 unsubscribe to notify
        immortalSword.removeObserver(customer2);
        immortalSword.removeObserver(customer1);

        // start notify to all registered customer when product available
        immortalSword.setAvailable(true);
    }
}
