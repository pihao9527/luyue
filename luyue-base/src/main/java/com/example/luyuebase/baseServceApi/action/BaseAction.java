package com.example.luyuebase.baseServceApi.action;

import com.example.luyue_base_api.base.api.BaseServiceApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseAction implements BaseServiceApi{
    @Override
    public String getUserById(String Id) {
        return "卢月";
    }
}
