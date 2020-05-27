package com.arquitecturajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.arquitecturajava")
public class HolaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringBootApplication.class, args);
	}

}
