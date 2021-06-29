package com.example.carSale.strong;

public class Car {
    private  ClassicConfiguration classicConfiguration;
    private  SportConfiguration sportConfiguration;
    private  IndividualСonfiguration yourConfiguration;

    public String readyForSale(){
//        classicConfiguration = new ClassicConfiguration();
//        sportConfiguration = new SportConfiguration();
        yourConfiguration = new IndividualСonfiguration();
        return "Car Ready in: " + yourConfiguration.makeConfiguration();
    }

}
