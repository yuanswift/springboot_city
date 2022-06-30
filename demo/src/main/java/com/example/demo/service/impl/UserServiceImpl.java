package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public List<User> listUsersByCondition(User user) {
        return userDao.findUsersByCondition(user);
    }

}
