package com.example.carSale.low;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);

		Car carForFamily = new Car();
				System.out.println(carForFamily.readyForSale());
		Car carForYoung = new Car();
				System.out.println(carForYoung.readyForSale());
		Car carForYou = new Car();
		System.out.println(carForYou.readyForSale());

	}


}
