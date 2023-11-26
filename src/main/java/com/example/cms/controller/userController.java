package com.example.cms.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.example.cms.DTO.LoginForm;
import com.example.cms.common.ApiResponse;
import com.example.cms.generator.domain.User;
import com.example.cms.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@RestController
@RequestMapping("/user/")
public class userController {
    @Autowired
    private UserService userService;

    @PostMapping("doLogin")
    public ApiResponse doLogin(@RequestBody LoginForm loginForm) {
        int id = userService.fineId(loginForm.getUsername(),loginForm.getPassword());
        if(id!=0) {
            StpUtil.login(id,loginForm.isRememberMe());
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            return ApiResponse.ofSuccess(tokenInfo);
        }
        return ApiResponse.ofMessage("登陆失败");
    }

    @GetMapping("userInfo")
    public ApiResponse userInfo(){
        if (StpUtil.isLogin()){
            User user = userService.getById((Serializable) StpUtil.getLoginId());
            return ApiResponse.ofSuccess(user);
        }
        return ApiResponse.ofMessage("未登录");
    }
    @RequestMapping("logout")
    public ApiResponse logout(){
        StpUtil.logout();
        return ApiResponse.ofMessage("登出成功");
    }
}