package com.vichet.patterns.structural.adapter;

public class AppleAdapter implements Chargeable{
    Charger samsungCharger;


    public void setSamsungCharger(Charger samsungCharger) {
        this.samsungCharger = samsungCharger;
    }

    @Override
    public void setMobileName(String mobileName) {
        // keep empty
    }

    @Override
    public void charge() {
        samsungCharger.supplyCharge();
    }
}
