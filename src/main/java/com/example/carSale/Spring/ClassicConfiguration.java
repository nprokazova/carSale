package com.example.carSale.Spring;

import com.example.carSale.Configurable;

public class ClassicConfiguration implements Configurable {

    @Override
    public String makeConfiguration(){
        return "Classic";
    }

}
