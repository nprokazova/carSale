package com.example.carSale.strong;

import com.example.carSale.ClassicConfiguration;

public class Car {
    private  ClassicConfiguration classicConfiguration;

    public String readyForSale(){
        classicConfiguration = new ClassicConfiguration();
        return "Car Ready in: " + classicConfiguration.makeConfiguration();
    }

}
