package com.eagle.cyg.service;

import com.eagle.cyg.dao.UserDao;
import com.eagle.cyg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> queryAll() {

       return userDao.queryAll();
    }
    public void insert(User user){
        userDao.insert(user);
    }
}
