package com.vichet.patterns.structural.adapter;

// client
public class ChargerUtils {
    public static void doCharge(Chargeable charger) {
        charger.charge();
    }
}
