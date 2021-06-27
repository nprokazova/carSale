package com.example.carSale.Spring;

import com.example.carSale.Configurable;

public class SportConfiguration implements Configurable{

    @Override
    public String makeConfiguration(){
        return "Sport";
    }

}
