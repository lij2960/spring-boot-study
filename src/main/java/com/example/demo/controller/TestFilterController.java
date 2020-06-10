package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestFilterController {
    @GetMapping("/testFilter")
    public String TestF() {
        System.out.println("执行了TestFilterController的TestF方法");
        return "testFilter";
    }
}
