package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    List<User> queryAll();
    User find(int userId);
    int insert(User user);
    int update(User user);
    int delete(int userId);
}
