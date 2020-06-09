package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.example.demo.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.concurrent.Future;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @Autowired
    private Task task;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello spring boot";
    }

//    @RequestMapping("/")
//    public String toDemo(ModelMap map) {
//        map.addAttribute("host", "https://gopher.cc");
//        return "demo";
//    }

    @RequestMapping("/user")
    public String toUser(ModelMap map) {
        User user = new User();
        user.setId(5L);
        user.setAge(26);
        user.setName("Test");
        map.addAttribute("user", user);
        return "user";
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(ModelMap map) {
        int num = this.userService.create(27, "李四");
        return num == 1 ? "ok" : "fail";
    }

    @ApiIgnore
    @RequestMapping("/test")
    @ResponseBody
    public void getTest() {
        try {
            long start = System.currentTimeMillis();
            Future<String> task1 = task.doTaskOne();
            Future<String> task2 = task.doTaskTwo();
            Future<String> task3 = task.doTaskThree();
            while (true) {
                if (task1.isDone() && task2.isDone() && task3.isDone()) {
                    break;
                }
                Thread.sleep(1000);
            }
            long end = System.currentTimeMillis();
            System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
