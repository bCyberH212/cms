package com.example.cms.generator.mapper;

import com.example.cms.generator.domain.User;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Beings
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2023-11-25 21:49:44
* @Entity generator.domain.User
*/
public interface UserMapper extends BaseMapper<User> {
    int selectIdByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}




