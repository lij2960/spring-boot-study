package com.example.demo.controller;

import com.example.demo.properties.MysqlBean;
import com.example.demo.properties.RedisBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    RedisBean redisBean;
    @RequestMapping("/redis")
    String homeJdbc() {
        return redisBean.toString();
    }
}
