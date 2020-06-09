package com.example.demo.controller;

import com.example.demo.properties.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonBean personBean;

    @RequestMapping("/homePerson")
    String homePerson() {
        return personBean.toString();
    }
}
