package com.example.luyue_user.redis;

import com.example.luyue_user_api.api.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class RedisAction implements UserServiceApi {
    @Autowired
    RedisDao redisDao;

    @Override
    public boolean setUserName(@RequestBody String userName) {
        return redisDao.setKey(userName,userName);
    }
}
