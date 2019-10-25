package com.mr.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testReq")
    public String testReq(){
        System.out.println(123123);
        System.out.println(321321);
        return "successful";
    }

}
