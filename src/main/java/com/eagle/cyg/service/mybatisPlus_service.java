package com.eagle.cyg.service;

import com.eagle.cyg.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mybatisPlus_service {
    @Autowired
    UserMapper userMapper;

}
