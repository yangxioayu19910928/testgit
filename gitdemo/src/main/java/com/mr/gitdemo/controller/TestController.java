package com.mr.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
public class TestController {

    @GetMapping("/testReq")
    public String testReq(){
        return "successful";
    }

    @GetMapping("/testUpdateReq")
    public String testUpdateReq(){
        return "updateSuccessful";
    }

}
