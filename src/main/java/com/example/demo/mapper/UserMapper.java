package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    public List<User> queryAll();
}
