package com.eagle.cyg.controller;

import com.eagle.cyg.entity.User;
import com.eagle.cyg.service.UserService;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {
    @Autowired
    UserService userService;

    @RequestMapping("/userquery")
    public List<User> queryAll() {
        System.out.println(userService.queryAll());
        return userService.queryAll();
    }

    @RequestMapping("/userupdate")
    public String updateByname() {
        return "hello";
    }

    @RequestMapping("/userinsert")
    public void insert(User user) {
        user.setAge("33");
        user.setName("li");
        user.setPhone("15626146161");
        userService.insert(user);
    }

    @RequestMapping("/query/{key}")
    public User selectById(@PathVariable("key") int id) {
        User user = userService.selectById(id);
        return user;

    }
}
