package com.example.demo.controller;

import com.example.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.IUserService;

import java.util.List;

@RestController//为springmvc提供 定义类可以被浏览器访问
@RequestMapping(value = "users")/*post方式询问*/
@Api//表示swagger资源，用在类上
public class UserController {
    @Autowired
    IUserService IUserService;

    @ApiOperation(value = "todo")
    @GetMapping(value = "", produces = {"application/json;charset=UTF-8"})
    public List<User> getAllUsers() {
        List<User> users = IUserService.listUsers();
        return users;
    }

    @ApiOperation(value = "todo")
    @PostMapping(value = "/getUsers", produces = {"application/json;charset=UTF-8"})
    public List<User> getUsersByCondition(@RequestBody User user) {
        return IUserService.listUsersByCondition(user);
    }

}
