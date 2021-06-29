package com.example.carSale;

import com.example.carSale.Spring.Car;
import com.example.carSale.Spring.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class CarSaleApplicationTests {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	void contextLoads() {
		Car superCar = context.getBean("yourCar", Car.class);

		String result = superCar.readyForSale();

		Assert.isTrue(result.equals("Car Ready in: Individual"));
	}

}
