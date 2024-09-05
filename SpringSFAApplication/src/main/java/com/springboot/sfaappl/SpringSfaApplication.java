package com.springboot.sfaappl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.sfaappl"})
public class SpringSfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSfaApplication.class, args);
	}

}
