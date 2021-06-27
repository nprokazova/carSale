package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);

		Car carForFamily = new Car(new ClassicConfiguration());
		System.out.println(carForFamily.readyForSale());

		Car carForYoung = new Car(new SportConfiguration());
		System.out.println(carForYoung.readyForSale());
	}


}
