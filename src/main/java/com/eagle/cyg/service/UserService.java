package com.eagle.cyg.service;


import com.eagle.cyg.dao.UserDao;
import com.eagle.cyg.dao.UserMapper;
import com.eagle.cyg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    public UserDao userDao;
    @Autowired//使用mybatis插件的
    UserMapper userMapper;
    public List<User> queryAll() {

       return userDao.queryAll();
    }
    public void insert(User user){
      userMapper.insert(null);
    }
    public User selectById( int id){
        User user = userMapper.selectById(id);
        return user;
    }
}
