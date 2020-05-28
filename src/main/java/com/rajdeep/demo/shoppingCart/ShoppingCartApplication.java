package com.rajdeep.demo.shoppingCart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApplication {

	private static final Logger logger = LoggerFactory.getLogger(ShoppingCartApplication.class);

	public static void main(String[] args) {
		logger.info("Begin logging Shopping Cart Application-----!");
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}
