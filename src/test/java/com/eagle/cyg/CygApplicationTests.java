package com.eagle.cyg;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eagle.cyg.dao.UserMapper;
import com.eagle.cyg.entity.User;
import com.eagle.cyg.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CygApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private User user;
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println("lkk");
    }

    @Test
    public void logd() {
        List<User> users = userService.queryAll();
        Assert.assertEquals("3",users.size());
        users.forEach(System.out::println);
    }
    @Test
    public void insert(){
        user.setName("chengwen");
        userMapper.insert(user);
    }
    @Test
    public void testQuery(){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name","li");
        Integer integer = userMapper.selectCount(queryWrapper);
        System.out.println(integer);
        System.out.println(userMapper.selectById("1"));
        System.out.println(userMapper.selectOne(new QueryWrapper<User>().eq("name","chengwen")));

    }

}
