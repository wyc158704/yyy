package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/xx")
    public String xx(String callback){
        System.out.println("callback="+callback);
        return "xx";
    }
}
