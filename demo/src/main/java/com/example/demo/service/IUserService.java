package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> listUsers();

    List<User> listUsersByCondition(User user);
}
