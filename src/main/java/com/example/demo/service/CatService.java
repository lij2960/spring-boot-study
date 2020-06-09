package com.example.demo.service;

import com.example.demo.pojo.Cat;

public interface CatService {
    Cat findCat(String name);
    Cat findByName(String name);
    Cat update(Cat cat);
//    void delete(Long id);
}
