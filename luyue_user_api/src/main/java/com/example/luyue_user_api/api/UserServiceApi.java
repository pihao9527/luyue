package com.example.luyue_user_api.api;

import com.example.luyue_user_api.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", path = "user")
public interface UserServiceApi {

    @PostMapping("/user-name")
    public boolean setUserName(@RequestBody String userName);

    @PostMapping("login")
    public String login(@RequestBody User user);

}
