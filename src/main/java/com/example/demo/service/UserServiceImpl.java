package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.bean.User;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Cacheable(value = "users")
    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
