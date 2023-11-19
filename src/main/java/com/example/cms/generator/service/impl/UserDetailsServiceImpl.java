package com.example.cms.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cms.generator.domain.User;
import com.example.cms.generator.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

public class UserDetailsServiceImpl {
//    @Autowired
//    private UserMapper userMapper;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.eq("username",username);
//        User user = userMapper.selectOne(wrapper);
//        if(user==null){
//            throw new UsernameNotFoundException("该用户不存在");
//        }
//
//        List<GrantedAuthority> roles = AuthorityUtils.commaSeparatedStringToAuthorityList(user.getRole());
//        return new org.springframework.security.core.userdetails.User(username,new
//                BCryptPasswordEncoder().encode(user.getPassword()),roles);
//    }
}
