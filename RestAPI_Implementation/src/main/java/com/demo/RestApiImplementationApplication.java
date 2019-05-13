package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.controller","com.service"})

public class RestApiImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiImplementationApplication.class, args);
	}

}
