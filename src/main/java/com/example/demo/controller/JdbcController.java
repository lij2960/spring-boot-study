package com.example.demo.controller;

import com.example.demo.properties.JDBCBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
    @Autowired
    JDBCBean jdbcBean;
    @RequestMapping("/jdbc")
    String homeJdbc() {
        return jdbcBean.toString();
    }
}
