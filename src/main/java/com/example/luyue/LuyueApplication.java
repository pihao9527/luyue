package com.example.luyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LuyueApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuyueApplication.class, args);
	}
}
