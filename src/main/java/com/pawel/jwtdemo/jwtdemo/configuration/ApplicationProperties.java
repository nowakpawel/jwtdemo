package com.pawel.jwtdemo.jwtdemo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.datasource")
public record ApplicationProperties(String userName, String password, String database) {
}
