package com.qst.medical.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/login")
@CrossOrigin
public class TestController {
    public void test(){
        System.out.println("123");
    }
}
