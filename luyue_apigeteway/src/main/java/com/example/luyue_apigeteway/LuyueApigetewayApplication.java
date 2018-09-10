package com.example.luyue_apigeteway;

import com.example.luyue_apigeteway.filter.LoginFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class LuyueApigetewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuyueApigetewayApplication.class, args);
	}

	@Bean
    @LoadBalanced
    public void LoginFilter(){
	    new LoginFilter();
    }
}
