package com.eagle.cyg.controller;

import com.eagle.cyg.entity.User;
import com.eagle.cyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Hello {
    @Autowired
    UserService userService;
    @ResponseBody
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
    public void  insert(User user) {
        user.setAge("33");
        user.setName("li");
        user.setPhone("15626146161");
        userService.insert(user);
    }
}
