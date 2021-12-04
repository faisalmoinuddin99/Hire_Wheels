package com.hirewheel.hirewheel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HirewheelApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(HirewheelApplication.class, args);
	}

}
