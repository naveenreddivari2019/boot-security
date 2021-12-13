package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
/*
 * @ComponentScan(basePackages = { "com.rest" }, excludeFilters
 * = @ComponentScan.Filter(type = FilterType.ASPECTJ,pattern = "com.sb.*"))
 */
public class SpringBootRestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

}
