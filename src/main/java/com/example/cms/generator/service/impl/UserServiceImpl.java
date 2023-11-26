package com.example.cms.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cms.generator.service.UserService;
import com.example.cms.generator.domain.User;
import com.example.cms.generator.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Beings
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-11-25 21:49:44
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int fineId(String username, String password) {
        return userMapper.selectIdByUsernameAndPassword(username,password);
    }
}




