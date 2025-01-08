package com.qst.medical.controller;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/test")
@CrossOrigin
public class TestController {
    @GetMapping("/login")
    public void test(){
        System.out.println("123");
    }
}
