package com.armando.crud.service;

import com.armando.crud.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    User findById(Integer id);
    void deleteById(Integer id);
    void update(User user);
}
