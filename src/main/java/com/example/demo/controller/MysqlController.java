package com.example.demo.controller;

import com.example.demo.properties.JDBCBean;
import com.example.demo.properties.MysqlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlController {
    @Autowired
    MysqlBean mysqlBean;
    @RequestMapping("/mysql")
    String homeJdbc() {
        return mysqlBean.toString();
    }
}
