package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 查询用户信息列表
     * @return
     */
    List<User> queryAll();
    User find(int userId);
    int insert(User user);
    int update(User user);
    int delete(int userId);
}
