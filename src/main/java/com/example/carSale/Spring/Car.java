package com.example.carSale.Spring;

import com.example.carSale.Configurable;

public class Car {
    private  Configurable configuration;

    public Car(Configurable configuration) {
        this.configuration = configuration;
    }
    public String readyForSale(){
        return "Car Ready in: " + configuration.makeConfiguration();
    }
}
