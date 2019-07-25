package com.eagle.cyg.dao;

import com.eagle.cyg.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM springboot_user")
    @Results({
            @Result(property = "name",  column = "name", javaType = String.class),
            @Result(property = "age", column = "age"),
            @Result(property = "phone",column ="phone")
    })
    List<User> queryAll();
    @Select("select from springboot_user where name=#{name}")
    @Results({
            @Result(property = "name",  column = "name", javaType = String.class),
            @Result(property = "age", column = "age"),
            @Result(property = "phone",column ="phone")
    })
    User queryone(String name);
    @Insert("insert into springboot_user(name,age,phone)values(#{name},#{age},#{phone})")
    void insert(User user);
    @Update("update springboot_user set name=#{name} where age=#{age}")
    void update(User user);
    @Delete("delete from springboot_user where name=#{name}")
    void delete(String name);
}
