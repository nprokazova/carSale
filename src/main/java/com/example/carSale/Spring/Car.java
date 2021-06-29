package com.example.carSale.Spring;

public class Car {
    private Configurable configuration;

    public Car(Configurable configuration) {
        this.configuration = configuration;
    }
    public String readyForSale(){
        return "Car Ready in: " + configuration.makeConfiguration();
    }
}
