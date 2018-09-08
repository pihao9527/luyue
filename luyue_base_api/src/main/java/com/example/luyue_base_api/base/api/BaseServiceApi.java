package com.example.luyue_base_api.base.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="base-service" ,path="base")
public interface BaseServiceApi {

    @GetMapping("/")
    public String getUserById(String Id);

}
