package com.example.carSale.low;

public class Car {
    private Configurable configuration;

    public String readyForSale(){
        configuration = new ClassicConfiguration();
        return "Car Ready in: " + configuration.makeConfiguration();
    }

}
