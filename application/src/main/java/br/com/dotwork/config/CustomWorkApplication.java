package br.com.customwork.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "br.com.customwork")
@SpringBootApplication
public class CustomWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomWorkApplication.class, args);
	}

}
