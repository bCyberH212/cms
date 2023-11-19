package com.example.cms.generator.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    private Long userId;

    private String username;

    private String password;

    private String role;

    private static final long serialVersionUID = 1L;
}