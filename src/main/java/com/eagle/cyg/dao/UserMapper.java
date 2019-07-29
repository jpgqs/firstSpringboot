package com.eagle.cyg.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eagle.cyg.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
