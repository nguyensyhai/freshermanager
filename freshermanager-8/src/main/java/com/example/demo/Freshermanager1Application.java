package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:test.properties"})
public class Freshermanager1Application {

	public static void main(String[] args) {
		SpringApplication.run(Freshermanager1Application.class, args);
	}

}
