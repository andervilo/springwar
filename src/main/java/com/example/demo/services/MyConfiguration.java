package com.example.demo.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	@Bean(name = "urlService")
    public UrlService urlService() {
        return () -> "Anderson Oliveira";
    }
}

interface UrlService {
    String getApplicationUrl();
}