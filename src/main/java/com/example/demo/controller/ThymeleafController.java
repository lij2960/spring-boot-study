package com.example.demo.controller;

import com.example.demo.properties.PersonBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class ThymeleafController {
    @RequestMapping("thymeleafDemo")
    public String ThymeleafPage(Model model) {

        PersonBean personBean = new PersonBean();
        personBean.setName("hello");
        personBean.setPassword("password");
        personBean.setAddress("my address");
        personBean.setAge(10);

        List<PersonBean> personBeanList = new ArrayList<>();
        personBeanList.add(personBean);

        PersonBean personBean2 = new PersonBean();

        personBean2.setName("hello2");
        personBean2.setPassword("password2");
        personBean2.setAddress("my address2");
        personBean2.setAge(11);
        personBeanList.add(personBean2);

        PersonBean personBean3 = new PersonBean();

        personBean3.setName("hello3");
        personBean3.setPassword("password3");
        personBean3.setAddress("my address3");
        personBean3.setAge(12);
        personBeanList.add(personBean3);

        model.addAttribute("personBean", personBean);
        model.addAttribute("personList", personBeanList);
        model.addAttribute("hello", "hello, thymeleaf");
        model.addAttribute("age", 6);
        model.addAttribute("name", "gopher.cc");

        return "thymeleafDemo";
    }
}
