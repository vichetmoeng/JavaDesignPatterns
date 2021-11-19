package com.vichet.patterns.structural.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        Chargeable appleCharger = new AppleCharger();
        appleCharger.setMobileName("Iphone X");
        ChargerUtils.doCharge(appleCharger);

        Charger samsungCharger = new SamsungCharger();
        samsungCharger.setMobileName("Galaxy X");

        AppleAdapter appleAdapter = new AppleAdapter();
        appleAdapter.setSamsungCharger(samsungCharger);

        ChargerUtils.doCharge(appleAdapter);
    }
}
