package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestInterceptorController {
    @GetMapping("/testInterceptor")
    @ResponseBody
    public String testInterCep() {
        System.out.println("执行了TestInterceptorController的testInterCep方法");
        return "testInterCep";
    }
}
