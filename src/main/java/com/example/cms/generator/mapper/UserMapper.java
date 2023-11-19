package com.example.cms.generator.mapper;

import com.example.cms.generator.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Beings
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-11-08 16:09:05
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




