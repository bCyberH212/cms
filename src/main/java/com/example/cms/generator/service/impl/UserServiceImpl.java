package com.example.cms.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cms.generator.domain.User;
import com.example.cms.generator.mapper.UserMapper;
import com.example.cms.generator.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Beings
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-11-08 16:09:05
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




