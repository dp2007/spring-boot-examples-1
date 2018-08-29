package com.sqin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinsheng on 2018/8/29.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello spring boot";
    }
}
