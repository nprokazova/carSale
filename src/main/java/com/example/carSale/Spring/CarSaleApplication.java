package com.example.carSale.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car newCarForFamily = context.getBean("classicCar", Car.class);
		Car newCarStudent = context.getBean("sportCar", Car.class);
		Car newCarForYou = context.getBean("yourCar", Car.class);

		System.out.println(newCarForFamily.readyForSale());
		System.out.println(newCarStudent.readyForSale());
		System.out.println(newCarForYou.readyForSale());
	}


}
