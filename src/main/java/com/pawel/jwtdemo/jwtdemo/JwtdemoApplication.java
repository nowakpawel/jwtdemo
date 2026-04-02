package com.pawel.jwtdemo.jwtdemo;

import com.pawel.jwtdemo.jwtdemo.configuration.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class JwtdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(JwtdemoApplication.class, args);
	}
}
