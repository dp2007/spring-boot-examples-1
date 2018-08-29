package com.sqin.controller;

import com.sqin.domain.User;
import com.sqin.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinsheng on 2018/8/29.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private UserProperties userProperties;

    @RequestMapping
    public User getUser(){
        User user = new User();
        user.setUsername(userProperties.getTitle());
        user.setPassword("123456");
        return user;
    }
}
