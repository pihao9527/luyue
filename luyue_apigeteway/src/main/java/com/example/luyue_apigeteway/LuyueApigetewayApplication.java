package com.example.luyue_apigeteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LuyueApigetewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuyueApigetewayApplication.class, args);
	}
}
