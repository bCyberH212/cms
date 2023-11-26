package com.example.cms;

import cn.dev33.satoken.SaManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.cms.generator.mapper")
@SpringBootApplication
public class CmdApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(CmdApplication.class, args);
    }

}
