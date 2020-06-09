package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加用户
    @Override
    public int create(int age, String name) {
        String sql = "insert into user(NAME, AGE) values (?, ?)";
        return this.jdbcTemplate.update(sql, name, age);
    }
}
