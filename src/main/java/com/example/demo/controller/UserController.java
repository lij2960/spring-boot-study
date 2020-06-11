package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询用户信息列表
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public List<User> List() {
        List<User> userList = userService.queryAll();
        return userList;
    }

    @GetMapping("/user")
    @ResponseBody
    public User Find() {
        User user = userService.find(5);
        return user;
    }

    @GetMapping("/insert")
    @ResponseBody
    public int Insert() {
        User user = new User();
        user.setAddress("gopher.cc");
        user.setAge(3);
        user.setMobilePhone("18955220533");
        user.setUserName("gopher.cc");
        return userService.insert(user);
    }

    @GetMapping("/update")
    @ResponseBody
    public int Update() {
        User user = new User();
        user.setAddress("gopher.cc update");
        user.setId(5);
        return userService.update(user);
    }

    @GetMapping("/delete")
    @ResponseBody
    public int Delete() {
        return userService.delete(5);
    }
}
