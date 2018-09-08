package com.example.luyuebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LuyueBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuyueBaseApplication.class, args);
	}
}
