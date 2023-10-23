package com.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @RequestMapping(value = "check_UserProvider.do")
    public String check(){
        System.out.println("服务提供者动作.....");
        return "登录成功";
    }
}
