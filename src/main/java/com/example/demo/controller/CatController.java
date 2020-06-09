package com.example.demo.controller;

import com.example.demo.pojo.Cat;
import com.example.demo.properties.ParamProperties;
import com.example.demo.service.CatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;

@Controller
public class CatController {
    @Autowired
    private CatService catService;

    @Autowired
    private ParamProperties paramProperties;

    private static final Logger LOGGER = LoggerFactory.getLogger(CatController.class);

    @RequestMapping("/findCat")
    @ResponseBody
    public Cat findUser() {
        Cat c = this.catService.findCat("李白");
        return c;
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public Cat findByName() {
        Cat c = this.catService.findByName("张三");
        return c;
    }

    @ApiIgnore
    @RequestMapping("/wyait")
    @ResponseBody
    public String getMsg(HttpServletResponse response) {
        System.out.println(1 / 0);
        LOGGER.debug("==============debug信息>>>>>" + paramProperties);
        LOGGER.debug("==============info信息>>>>>" + paramProperties);
        return paramProperties.toString();
    }
}
