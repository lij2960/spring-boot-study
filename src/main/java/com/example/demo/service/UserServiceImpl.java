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

    @Override
    public User find(int userId) {
        return userMapper.find(userId);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(int userId) {
        return userMapper.delete(userId);
    }
}
