package com.myshopping.MyShopping;

import com.myshopping.MyShopping.models.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyShoppingApplication {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();

		SpringApplication.run(MyShoppingApplication.class, args);
	}

}
