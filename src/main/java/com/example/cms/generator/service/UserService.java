package com.example.cms.generator.service;

import com.example.cms.generator.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Beings
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-11-25 21:49:44
*/
public interface UserService extends IService<User> {
    /**
     * 登录寻查ID
     * @param username
     * @param password
     * @return
     */
    int fineId(String username,String password);
}
