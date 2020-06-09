package com.example.demo.service;

import com.example.demo.dao.CatRepository;
import com.example.demo.pojo.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private CatRepository catRepository;

    @Override
    public Cat findCat(String name) {
        return this.catRepository.findCat(name);
    }

    @Override
    public Cat findByName(String name) {
        return this.catRepository.findByName(name);
    }

    @Override
    public Cat update(Cat cat) {
        return this.catRepository.save(cat);
    }

//    @Override
//    public void delete(Long id) {
//        this.catRepository.delete(id);
//    }
}
