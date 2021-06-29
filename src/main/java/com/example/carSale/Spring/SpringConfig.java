package com.example.carSale.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.carSale.Spring")
public class SpringConfig {

    @Bean
    public ClassicConfiguration classicConfiguration(){
        return new ClassicConfiguration();
    }

    @Bean
    public SportConfiguration sportConfiguration(){

        return new SportConfiguration();
    }

    @Bean
    public IndividualСonfiguration yourConfiguration() {
        return new IndividualСonfiguration();
    }

    @Bean
    public Car classicCar(){
        return new Car(classicConfiguration());
    }

    @Bean
    public Car sportCar(){
        return new Car(sportConfiguration());
    }

    @Bean
    public Car yourCar() {
        return new Car(yourConfiguration());
    }
}
